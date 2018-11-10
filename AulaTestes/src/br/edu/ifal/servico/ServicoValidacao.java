package br.edu.ifal.servico;

public class ServicoValidacao {
	
	public boolean validarUsuario(String nome, int idade, String email) {
		
		
		
		for (int i = 0; i < nome.length(); i++) {
	          if (!Character.isAlphabetic((nome.charAt(i)))) {
	              
	        	  if(!nome.contains(" "))
	        	   return false;
	          }
	     }
		
		
		if(idade < 150 && idade > 0) {
				
			if(email.contains("@")) return true;
				
		}
			
			
		return false;
	
	}
	
	

}
