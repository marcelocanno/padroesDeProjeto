package padroesDeProjeto;

import padroesDeProjeto.Pessoa.PessoaBuilder;

public class TestPessoa {
	/*
	public TestPessoa(String nome, String ultimoNome, String nomeDoMeio, String nomePai, String apelido) {
		super(nome, ultimoNome, nomeDoMeio, nomePai, apelido);
	}


	public static void main (String[] args) {
		
		PessoaBuilder p = new Pessoa.PessoaBuilder("Marcelo").nome("marcxelo").ultimoNome("Ruas").nomeDoMeio("Canno").apelido("Alemao").nomePai("onofre");
		*/
		
	/*
	public TestPessoa(String nome, String ultimoNome, String nomeDoMeio, String nomePai, String apelido) {
		super(nome, ultimoNome, nomeDoMeio, nomePai, apelido);
		// TODO Auto-generated constructor stub
	}
	*/
	public static void main(String[] args) {
		Pessoa p = new Pessoa.PessoaBuilder("Marcelo")
				.nome("Marcelo")
				.ultimoNome("Ruas")
				.nomeDoMeio("Canno") 
				.apelido("Alemão")
				.nomePai("Onofre")
				.build();
		System.out.println(p);
				
	}			
}
