package com.formatador;

public class formatador {
	public static String removeimpurezas(String a) {
		   a = a.replaceAll("^\"|\"$", "");		   
		   return a;
	}
	
	public static String removeCPF(String a) {
			a = a.replaceAll("[^0-9]", "");		   
			return a;
	}
}
