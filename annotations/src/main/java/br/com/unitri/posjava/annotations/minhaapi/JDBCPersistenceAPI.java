package br.com.unitri.posjava.annotations.minhaapi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//NÃO LEVAR EM CONSIDERAÇÃO A FORMA DE OBTER A CONEXAO COM O BANCO DE DADOS E ETC...

public class JDBCPersistenceAPI implements PersistenceAPI {

	public void salvar(Object entidade) {
		
		List<CampoValor> campos = new ArrayList<CampoValor>();
		
		Class clazz = entidade.getClass();
		
		String nomeTabela = entidade.getClass().getAnnotation(Tabela.class).nome();
		
		for(Field f : clazz.getDeclaredFields()) {
			
			if(f.isAnnotationPresent(Campo.class)) {
				
				try {
					
					CampoValor cv = new CampoValor(f.getAnnotation(Campo.class).nome(), f.get(entidade));
					
					campos.add(cv);
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		try {
			
			Connection conn = getConexao();
			
			String sql = "INSERT INTO %s (%s, %s) VALUES (?, ?)";
			
			sql = String.format(sql, nomeTabela, campos.get(0).getCampo(), campos.get(1).getCampo());
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, (Integer)campos.get(0).getValor());
			stmt.setString(2, (String)campos.get(1).getValor());
			
			stmt.execute();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	private static Connection getConexao() throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost/posjava?useSSL=false";
        String usr = "root";
        String pwd = "";

        // Carregar o driver
        Class.forName("com.mysql.jdbc.Driver");

        // Conectar com o servidor de banco de dados
       
        return DriverManager.getConnection(url, usr, pwd);
		
	}
 
}

class CampoValor {
	
	private Object campo;
	
	private Object valor;
	
	public CampoValor(Object campo, Object valor) {
		
		this.campo = campo;
		this.valor = valor;
		
	}

	public Object getCampo() {
		return campo;
	}

	public Object getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "CampoValor [campo=" + campo + ", valor=" + valor + "]";
	}
	
}