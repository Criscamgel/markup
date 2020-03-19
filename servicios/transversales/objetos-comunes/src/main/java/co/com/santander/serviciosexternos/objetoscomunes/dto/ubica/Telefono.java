package co.com.santander.serviciosexternos.objetoscomunes.dto.ubica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Telefono")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Telefono {
	private String TelPos;
	private String NoReportes;
	private String ProductoActivo;
	private String TipoUbicacion;
	private String SectorEconomico;
	private String PrimerReporte;
	private String UltimoReporte;
	private String Prefijo;
	private String Telefono;
	private String Ciudad;
	//private String _pos;

	// Getter Methods
	@XmlElement(name = "TelPos")
	public String getTelPos() {
		return TelPos;
	}
	
	@XmlElement(name = "NoReportes")
	public String getNoReportes() {
		return NoReportes;
	}
	
	@XmlElement(name = "ProductoActivo")
	public String getProductoActivo() {
		return ProductoActivo;
	}
	
	@XmlElement(name = "TipoUbicacion")
	public String getTipoUbicacion() {
		return TipoUbicacion;
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
	
	@XmlElement(name = "Prefijo")
	public String getPrefijo() {
		return Prefijo;
	}
	
	@XmlElement(name = "Telefono")
	public String getTelefono() {
		return Telefono;
	}
	
	@XmlElement(name = "Ciudad")
	public String getCiudad() {
		return Ciudad;
	}
	
//	@XmlElement(name = "Posicion del arreglo ? ")
//	public String get_pos() {
//		return _pos;
//	}

	// Setter Methods

	public void setTelPos(String TelPos) {
		this.TelPos = TelPos;
	}

	public void setNoReportes(String NoReportes) {
		this.NoReportes = NoReportes;
	}

	public void setProductoActivo(String ProductoActivo) {
		this.ProductoActivo = ProductoActivo;
	}

	public void setTipoUbicacion(String TipoUbicacion) {
		this.TipoUbicacion = TipoUbicacion;
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

	public void setPrefijo(String Prefijo) {
		this.Prefijo = Prefijo;
	}

	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}

	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
	}

//	public void set_pos(String _pos) {
//		this._pos = _pos;
//	}
}