package ifba.edu.br.dto;

public class LoginResponse {
	
	private String token;
	private String id;
	private String nomeUsuario;
	private String nome;
	private String role;
	
	public String getToken() {
		return this.token;
	}
	private void setToken(String pToken) {
		this.token = pToken;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String pId) {
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
	public String getRole() {
		return this.role;
	}
	public void setRole(String pRole) {
		this.role = pRole;
	}
	
	

}
