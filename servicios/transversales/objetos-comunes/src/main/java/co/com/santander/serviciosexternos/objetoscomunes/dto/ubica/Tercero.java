/**
 * 
 */
package co.com.santander.serviciosexternos.objetoscomunes.dto.ubica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author itac
 *
 */
@XmlRootElement(name = "Tercero")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Tercero {

	private String identificadorLinea;
	
	private String tipoIdentificacion;
	
	private String codigoTipoIndentificacion;
	
	private String numeroIdentificacion;
	
	private String nombre1;
	
	private String apellido1;
	
	private String nombreTitular;
	
	private String nombreCiiu;
	
	private String lugarExpedicion;
	
	private String fechaExpedicion;
	
	private String estado;
	
	private String numeroInforme;
	
	private String estadoTitular;
	
	private String rangoEdad;
	
	private String codigoCiiu;
	
	private String codigoDepartamento;
	
	private String codigoMunicipio;
	
	private String fecha;
	
	private String hora;
	
	private String entidad;
	
	private String respuestaConsulta;

	UbicaPlusCifin ubicaPlusCifin;
	
	@XmlElement(name = "IdentificadorLinea")  
	public String getIdentificadorLinea() {
		return identificadorLinea;
	}

	public void setIdentificadorLinea(String identificadorLinea) {
		this.identificadorLinea = identificadorLinea;
	}
	
	@XmlElement(name = "TipoIdentificacion")  
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	@XmlElement(name = "CodigoTipoIndentificacion")  
	public String getCodigoTipoIndentificacion() {
		return codigoTipoIndentificacion;
	}

	public void setCodigoTipoIndentificacion(String codigoTipoIndentificacion) {
		this.codigoTipoIndentificacion = codigoTipoIndentificacion;
	}
	
	@XmlElement(name = "NumeroIdentificacion")  
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	@XmlElement(name = "Nombre1")  
	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	@XmlElement(name = "Apellido1")  
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	@XmlElement(name = "NombreTitular")
	public String getNombreTitular() {
		return nombreTitular;
	}
	
	
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	@XmlElement(name = "NombreCiiu")  
	public String getNombreCiiu() {
		return nombreCiiu;
	}

	public void setNombreCiiu(String nombreCiiu) {
		this.nombreCiiu = nombreCiiu;
	}
	
	@XmlElement(name = "LugarExpedicion")
	public String getLugarExpedicion() {
		return lugarExpedicion;
	}

	public void setLugarExpedicion(String lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}
	
	@XmlElement(name = "FechaExpedicion")
	public String getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	
	@XmlElement(name = "Estado")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@XmlElement(name = "NumeroInforme")
	public String getNumeroInforme() {
		return numeroInforme;
	}

	public void setNumeroInforme(String numeroInforme) {
		this.numeroInforme = numeroInforme;
	}
	
	@XmlElement(name = "EstadoTitular")
	public String getEstadoTitular() {
		return estadoTitular;
	}

	public void setEstadoTitular(String estadoTitular) {
		this.estadoTitular = estadoTitular;
	}
	
	@XmlElement(name = "RangoEdad")
	public String getRangoEdad() {
		return rangoEdad;
	}

	public void setRangoEdad(String rangoEdad) {
		this.rangoEdad = rangoEdad;
	}
	
	@XmlElement(name = "CodigoCiiu")
	public String getCodigoCiiu() {
		return codigoCiiu;
	}

	public void setCodigoCiiu(String codigoCiiu) {
		this.codigoCiiu = codigoCiiu;
	}
	
	@XmlElement(name = "CodigoDepartamento")
	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}
	
	@XmlElement(name = "CodigoMunicipio")
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	
	@XmlElement(name = "Fecha")
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@XmlElement(name = "Hora")
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	@XmlElement(name = "Entidad")
	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
	@XmlElement(name = "RespuestaConsulta")
	public String getRespuestaConsulta() {
		return respuestaConsulta;
	}

	public void setRespuestaConsulta(String respuestaConsulta) {
		this.respuestaConsulta = respuestaConsulta;
	}
	
	@XmlElement(name = "UbicaPlusCifin")
	public UbicaPlusCifin getUbicaPlusCifinObject() {
		return ubicaPlusCifin;
	}

	public void setUbicaPlusCifinObject(UbicaPlusCifin ubicaPlusCifinObject) {
		this.ubicaPlusCifin = ubicaPlusCifinObject;
	}

	@Override
	public String toString() {
		return "Tercero [identificadorLinea=" + identificadorLinea + ", tipoIdentificacion=" + tipoIdentificacion
				+ ", codigoTipoIndentificacion=" + codigoTipoIndentificacion + ", numeroIdentificacion="
				+ numeroIdentificacion + ", nombre1=" + nombre1 + ", apellido1=" + apellido1 + ", nombreTitular="
				+ nombreTitular + ", nombreCiiu=" + nombreCiiu + ", lugarExpedicion=" + lugarExpedicion
				+ ", fechaExpedicion=" + fechaExpedicion + ", estado=" + estado + ", numeroInforme=" + numeroInforme
				+ ", estadoTitular=" + estadoTitular + ", rangoEdad=" + rangoEdad + ", codigoCiiu=" + codigoCiiu
				+ ", codigoDepartamento=" + codigoDepartamento + ", codigoMunicipio=" + codigoMunicipio + ", fecha="
				+ fecha + ", hora=" + hora + ", entidad=" + entidad + ", respuestaConsulta=" + respuestaConsulta
				+ ", ubicaPlusCifinObject=" + ubicaPlusCifin + "]";
	}

	
	
	
//	@Override
//	public String toString() {
////		return String.format(
////				"%nTercero [identificadorLinea=%s,%nTipoIdentificacion=%s,%nCodigoTipoIndentificacion=%s,%nNumeroIdentificacion=%s,%nNombreTitular=%s,%nNombreCiiu=%s,%nLugarExpedicion=%s,%nFechaExpedicion=%s,%nEstado=%s,%nNumeroInforme=%s,%nEstadoTitular=%s,%nRangoEdad=%s,%nCodigoCiiu=%s,%nCodigoDepartamento=%s,%nCodigoMunicipio=%s,%nFecha=%s,%nHora=%s,%nEntidad=%s,%nRespuestaConsulta=%s]",
////				identificadorLinea, TipoIdentificacion,
////				CodigoTipoIndentificacion, NumeroIdentificacion, NombreTitular,
////				NombreCiiu, LugarExpedicion, FechaExpedicion, Estado,
////				NumeroInforme, EstadoTitular, RangoEdad, CodigoCiiu,
////				CodigoDepartamento, CodigoMunicipio, Fecha, Hora, entidad,
////				RespuestaConsulta);
//	}



}