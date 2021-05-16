package com.classes.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	final static String url =  "jdbc:mysql://127.0.0.1:3306/mvcInjecaoDep";
	
	final static String usuario = "root";
	
	final static String senha = "123456789";

	
    public static Connection conectar() {
    	try {
    		 return DriverManager.getConnection(url, usuario, senha); 
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }    	
    }
}
