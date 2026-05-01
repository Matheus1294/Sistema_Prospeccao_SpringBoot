package ifba.br.edu.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prospectores")
public class Prospector {
	
	@Id
	private String id;
	private String nome;
	private String email;
	private boolean ativo;
	private List<Prospeccao> prospeccoes;
	
	public String getId() {
		return id;
	}
	public void setId(String pId) {
		this.id = pId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String pNome) {
		this.nome = pNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String pEmail) {
		this.email = pEmail;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean pAtivo) {
		this.ativo = pAtivo;
	}
	public List<Prospeccao> getProspeccoes() {
		return prospeccoes;
	}
	private void setProspeccoes(List<Prospeccao> pProspeccoes) {
		this.prospeccoes = pProspeccoes;
	}
	
	
	
}
