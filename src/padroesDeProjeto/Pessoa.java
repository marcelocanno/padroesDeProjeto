package padroesDeProjeto;

public class Pessoa {

	public String nome;
	public String ultimoNome;
	public String nomeDoMeio;
	public String apelido;
	public String nomePai;
	
	
	private Pessoa(String nome, String ultimoNome, String nomeDoMeio, String apelido, String nomePai) {
		super();
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.nomeDoMeio = nomeDoMeio;
		this.apelido = apelido;
		this.nomePai = nomePai;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", ultimoNome=" + ultimoNome + ", nomeDoMeio=" + nomeDoMeio + ", apelido="
				+ apelido + ", nomePai=" + nomePai + "]";
	}
	
	public static class PessoaBuilder{
	public String nome;
	public String ultimoNome;
	public String nomeDoMeio;
	public String apelido;
	public String nomePai;
	
	public PessoaBuilder(String string) {
		}
	
	public PessoaBuilder nome (String nome) {
		this.nome = nome;
		return this;
		}
	
	public PessoaBuilder ultimoNome (String ultimoNome) {
		this.ultimoNome = ultimoNome;
		return this;
		}
	public PessoaBuilder nomeDoMeio (String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
		return this;
		}
	public PessoaBuilder apelido (String apelido) {
		this.apelido = apelido;
		return this;
		}
	public PessoaBuilder nomePai (String nomePai) {
		this.nomePai = nomePai;
		return this;
		}
		
	public Pessoa build() {
			return new Pessoa(nome,ultimoNome,nomeDoMeio,apelido, nomePai);
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getNomeDoMeio() {
		return nomeDoMeio;
	}

	public void setNomeDoMeio(String nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	}	
}
