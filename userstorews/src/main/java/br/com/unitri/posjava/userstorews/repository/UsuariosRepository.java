package br.com.unitri.posjava.userstorews.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.unitri.posjava.userstorews.domain.Usuario;

@Repository
public class UsuariosRepository {

	@Autowired
	private DataSource dataSource;
	
	public Usuario buscar(String username) {
		
		String sql = "SELECT * from USUARIOS WHERE username = ?;";
		
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				Usuario aluno = new Usuario();
				aluno.setId(rs.getLong("id"));
				aluno.setPassword(rs.getString("password"));
				aluno.setUsername(rs.getString("username"));
				
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
