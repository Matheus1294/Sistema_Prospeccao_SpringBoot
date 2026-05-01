package ifba.edu.br.dto;

public class LoginRequest {
	
	private String nomeUsuario;
	private String senha;
	
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}
	private void setNomeUsuario(String pNomeUsuario) {
		this.nomeUsuario = pNomeUsuario;
	}
	private String getSenha() {
		return this.senha;
	}
	public void setSenha(String pSenha) {
		this.senha = pSenha;
	}
	
	

}
