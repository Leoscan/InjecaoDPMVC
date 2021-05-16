package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Aluno;
import com.formatador.formatador;


public class PersistenciaMySQL extends Persistencia{
	final String NOMEDATABELA = "alunos";
	
	public String CriaPersistencia(List<Aluno> ListAluno) {
		try {
	        Connection conn = com.classes.conexao.Conn.conectar();
		        
		        for (Aluno aluno : ListAluno) {
		        	String sql = "INSERT INTO " + NOMEDATABELA + " (matricula, nome, cpf, dtNascimento, email) VALUES (?, ?, ?, ?, ?);";
			        PreparedStatement ps = conn.prepareStatement(sql);
			        ps.setInt(1, aluno.getMatricula());
			        ps.setString(2, aluno.getNome());	    
			        ps.setString(3, formatador.removeCPF(aluno.getCpf()));
			        ps.setString(4, aluno.getDataNascimento());
			        ps.setString(5, aluno.getEmail());
			        ps.executeUpdate();
			        ps.close();
		        }
		        conn.close();
		        
		        
		    return "Dados inseridos com sucesso no MYSQL";
	    } catch (Exception e) {
	        //System.err.println("Erro: " + e.toString());
	        //e.printStackTrace();
	        return "Falha ao adicionar no MYSQL";
	    }
	}
		
		public List<Aluno> RecuperaPersistencia() {
		    try {
		    	Connection conn = com.classes.conexao.Conn.conectar();		    	
		    		String sql = "SELECT * FROM " + NOMEDATABELA + ";";		    	
		    		PreparedStatement ps = conn.prepareStatement(sql);
		    		ResultSet rs = ps.executeQuery();
		    		List<Aluno> ListAlunos = new ArrayList<Aluno>();			        
			            while (rs.next()) {
			                Aluno aa = new Aluno();			               			                
			                aa.setMatricula(rs.getInt(2));
			                aa.setNome(rs.getString(3));			              
			                aa.setCpf(rs.getString(4));
			                aa.setDataNascimento(rs.getString(5));
			                aa.setEmail(rs.getString(6));
			                ListAlunos.add(aa);
			            }
	            return ListAlunos;
	        } catch (Exception e) {
	            System.err.println("Erro: " + e.toString());
	            e.printStackTrace();
	            return null;
	        }		    
		}
	
}
