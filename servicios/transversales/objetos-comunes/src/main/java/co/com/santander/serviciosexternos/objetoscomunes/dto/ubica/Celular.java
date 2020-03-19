package co.com.santander.serviciosexternos.objetoscomunes.dto.ubica;

import javax.xml.bind.annotation.XmlElement;

public class Celular {
	private String CelPos;
	private String NoReportes;
	private String ProductoActivo;
	private String SectorEconomico;
	private String PrimerReporte;
	private String UltimoReporte;
	private String Celular;
	//private String _pos;

	// Getter Methods
	
	@XmlElement(name = "CelPos")
	public String getCelPos() {
		return CelPos;
	}
	
	@XmlElement(name = "NoReportes")
	public String getNoReportes() {
		return NoReportes;
	}
	
	@XmlElement(name = "ProductoActivo")
	public String getProductoActivo() {
		return ProductoActivo;
	}

	@XmlElement(name = "SectorEconomico")
	public String getSectorEconomico() {
		return SectorEconomico;
	}
	
	@XmlElement(name = "PrimerReporte")
	public String getPrimerReporte() {
		return PrimerReporte;
	}
	
	@XmlElement(name = "UltimoReporte")
	public String getUltimoReporte() {
		return UltimoReporte;
	}
	
	@XmlElement(name = "Celular")
	public String getCelular() {
		return Celular;
	}
	
//	@XmlElement(name = "Celulares")
//	public String get_pos() {
//		return _pos;
//	}

	// Setter Methods

	public void setCelPos(String CelPos) {
		this.CelPos = CelPos;
	}

	public void setNoReportes(String NoReportes) {
		this.NoReportes = NoReportes;
	}

	public void setProductoActivo(String ProductoActivo) {
		this.ProductoActivo = ProductoActivo;
	}

	public void setSectorEconomico(String SectorEconomico) {
		this.SectorEconomico = SectorEconomico;
	}

	public void setPrimerReporte(String PrimerReporte) {
		this.PrimerReporte = PrimerReporte;
	}

	public void setUltimoReporte(String UltimoReporte) {
		this.UltimoReporte = UltimoReporte;
	}

	public void setCelular(String Celular) {
		this.Celular = Celular;
	}

//	public void set_pos(String _pos) {
//		this._pos = _pos;
//	}
}