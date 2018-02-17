package br.com.unitri.posjava.crud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.unitri.posjava.crud.domain.Aluno;

@Repository
public class AlunosRepository {

	@Autowired
	private DataSource dataSource;
	
	
	public void salvar(Aluno aluno) {
		
		String sql = "INSERT INTO ALUNOS(nome, endereco) VALUES(?, ?);";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			int result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void atualizar(Aluno aluno) {
		
		String sql = "UPDATE ALUNOS SET nome = ?, endereco = ? WHERE id =?;";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			stmt.setLong(3, aluno.getId());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			int result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void remover(Long id) {
		
		String sql = "DELETE FROM ALUNOS WHERE id = ?;";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			int result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Aluno> listar() {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		String sql = "SELECT * from ALUNOS ORDER BY id ASC;";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		try {
			
			stmt = con.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Aluno aluno = new Aluno();
				aluno.setEndereco(rs.getString("endereco"));
				aluno.setNome(rs.getString("nome"));
				aluno.setId(rs.getLong("id"));
				
				alunos.add(aluno);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alunos;
		
	}
	
	public Aluno buscar(Long id) {
		
		String sql = "SELECT * from ALUNOS WHERE id = ?;";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				Aluno aluno = new Aluno();
				aluno.setEndereco(rs.getString("endereco"));
				aluno.setNome(rs.getString("nome"));
				aluno.setId(rs.getLong("id"));
				
				con.close();
				
				return aluno;
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
