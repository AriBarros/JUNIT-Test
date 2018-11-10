package br.edu.ifal.servico;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ServicoValidacaoTest {

	
	@Test
	public void TestandoAtributos() {
		
		String nome = "Davi João";
		int idade = 24;
		String email = "davitampa@gmail.com";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(true, validacaoDoUsuarioRetornada);
			
	}
	
	@Test
	public void TestarIdadeNegativa() {
		
		String nome = "Davi João";
		int idade = -24;
		String email = "davitampa@gmail.com";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(false, validacaoDoUsuarioRetornada);
			
	}
	
	@Test
	public void TestarIdadeElevada() {
		
		String nome = "Melk Molho";
		int idade = 2400;
		String email = "melkpipoca@gmail.com";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(false, validacaoDoUsuarioRetornada);
			
	}
	
	@Test
	public void VerificarIdadeNeutra() {
		
		String nome = "Melk Molho P";
		int idade = 0;
		String email = "melkpipoca@gmail.com";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(false, validacaoDoUsuarioRetornada);
			
	}
	
	@Test
	public void VerificarNomeComNumeros() {
		
		String nome = "edmils0njunior";
		int idade = 19;
		String email = "juninhodapegada@gmail.com";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(false, validacaoDoUsuarioRetornada);
		
	}
	
	@Test
	public void VerificarNomeComCaracteresEspeciais() {
		
		String nome = "Vit@o";
		int idade = 20;
		String email = "vitao@gmail.com";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(false, validacaoDoUsuarioRetornada);
		
	}
	
	
	@Test
	public void VerificarDominioDoEmail() {
		
		String nome = "Janaine";
		int idade = 19;
		String email = "janaine";
		
		ServicoValidacao servico = new ServicoValidacao();
		boolean validacaoDoUsuarioRetornada = servico.validarUsuario(nome, idade, email);
		Assert.assertEquals(false, validacaoDoUsuarioRetornada);
		
	}
	
	
	
	

}
