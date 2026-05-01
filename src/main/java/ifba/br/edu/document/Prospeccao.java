package ifba.br.edu.document;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prospeccoes")
public class Prospeccao {
	
	@Id
	private String id;
	private Empresa empresa;
	private String segmento;
	private String status;
	private Date dataCadastro;
	private Prospector prospector;
	
	public String getId() {
		return this.id;
	}
	public void setId(String pId) {
		this.id = pId;
	}
	public Empresa getEmpresa() {
		return this.empresa;
	}
	public void setEmpresa(Empresa pEmpresa) {
		this.empresa = pEmpresa;
	}
	public String getSegmento() {
		return this.segmento;
	}
	public void setSegmento(String pSegmento) {
		this.segmento = pSegmento;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String pStatus) {
		this.status = pStatus;
	}
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	public void setDataCadastro(Date pDataCadastro) {
		this.dataCadastro = pDataCadastro;
	}
	public Prospector getProspector() {
		return this.prospector;
	}
	private void setProspector(Prospector pProspector) {
		this.prospector = pProspector;
	}
	
	
	
}
