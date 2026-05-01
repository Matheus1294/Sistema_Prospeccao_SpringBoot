package ifba.br.edu.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {
	
	@Id 
	private String id;
	private String nomeUsuario;
	private String nome;
	private String senha;
	private String email;
	private String role;
	private String active;
	
	public String getId() {
		return this.id;
	}
	private void setId(String pId) {
		this.id = pId;
	}
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}
	public void setNomeUsuario(String pNomeUsuario) {
		this.nomeUsuario = pNomeUsuario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String pNome) {
		this.nome = pNome;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String pSenha) {
		this.senha = pSenha;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String pEmail) {
		this.email = pEmail;
	}
	public String getRole() {
		return this.role;
	}
	public void setRole(String pRole) {
		this.role = pRole;
	}
	public String getActive() {
		return this.active;
	}
	public void setActive(String pActive) {
		this.active = pActive;
	}
	
	
	
}
