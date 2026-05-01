package ifba.br.edu.document;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "empresas")
public class Empresa {
	
	@Id 
	private String id;
	private String nomeEmpresa;
	private Prospector prospector;
	private String status;
	private Date ultimaAtualizacao;
	private String observacoes;
	
	public String getId() {
		return id;
	}
	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}
	public Prospector getProspector() {
		return this.prospector;
	}
	public String getStatus() {
		return this.status;
	}
	public Date getUltimaAtualizacao() {
		return this.ultimaAtualizacao;
	}
	public String getObservacoes() {
		return this.observacoes;
	}
	private void setId(String pId) {
		this.id = pId;
	}
	private void setNomeEmpresa(String pNomeEmpresa) {
		this.nomeEmpresa = pNomeEmpresa;
	}
	private void setProspector(Prospector pProspector) {
		this.prospector = pProspector;
	}
	private void setStatus(String pStatus) {
		this.status = pStatus;
	}
	private void setUltimaAtualizacao(Date pUltimaAtualizacao) {
		this.ultimaAtualizacao = pUltimaAtualizacao;
	}
	private void setObservacoes(String pObservacoes) {
		this.observacoes = pObservacoes;
	}
	
	
}
