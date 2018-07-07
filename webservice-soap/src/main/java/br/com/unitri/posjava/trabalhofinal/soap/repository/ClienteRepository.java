package br.com.unitri.posjava.trabalhofinal.soap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import br.com.unitri.posjava.trabalhofinal.soap.model.Cliente;

public class ClienteRepository {

	private DataSource dataSource;

	public void salvar(Cliente cliente) {

		String sql = "INSERT INTO Cliente (nome, cpf, endereco, nascimento, telefone, rg) VALUES (?,?,?,?,?,?)";

		PreparedStatement stmt = null;

		Connection conn = null;

		try {

			conn = dataSource.getConnection();

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEndereco());
			stmt.setString(4, cliente.getNascimento());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getRg());

			stmt.execute();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Cliente> listar() {

		List<Cliente> clientes = new ArrayList<Cliente>();

		String sql = "Select * from Cliente";

		PreparedStatement stmt = null;

		Connection conn = null;

		try {

			conn = dataSource.getConnection();

			stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				
				Cliente cliente = new Cliente();
				
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setId(rs.getLong("id"));
				cliente.setNascimento(rs.getString("nascimento"));
				cliente.setNome(rs.getString("nome"));
				cliente.setRg(rs.getString("rg"));
				cliente.setTelefone(rs.getString("telefone"));
				
				clientes.add(cliente);
				
			}
			

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return clientes;

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Cliente buscar(Long id) {

		if(id == null)
			return null;
		
		Cliente cliente = null;

		String sql = "Select * from Cliente where id = ?";

		PreparedStatement stmt = null;

		Connection conn = null;

		try {

			conn = dataSource.getConnection();

			stmt = conn.prepareStatement(sql);
			
			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				
				cliente = new Cliente();
				
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setId(rs.getLong("id"));
				cliente.setNascimento(rs.getString("nascimento"));
				cliente.setNome(rs.getString("nome"));
				cliente.setRg(rs.getString("rg"));
				cliente.setTelefone(rs.getString("telefone"));
				
				
			}
			

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return cliente;

	}


}
