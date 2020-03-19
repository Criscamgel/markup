/**
 * 
 */
package co.com.santander.serviciosexternos.objetoscomunes.dto.income;

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
	@XmlElement
	private String TipoIdentificacion;
	@XmlElement
	private String CodigoTipoIndentificacion;
	@XmlElement
	private String NumeroIdentificacion;
	@XmlElement
	private String NombreTitular;
	@XmlElement
	private String NombreCiiu;
	@XmlElement
	private String LugarExpedicion;
	@XmlElement
	private String FechaExpedicion;
	@XmlElement
	private String Estado;
	@XmlElement
	private String NumeroInforme;
	@XmlElement
	private String EstadoTitular;
	@XmlElement
	private String RangoEdad;
	@XmlElement
	private String CodigoCiiu;
	@XmlElement
	private String CodigoDepartamento;
	@XmlElement
	private String CodigoMunicipio;
	@XmlElement
	private String Fecha;
	@XmlElement
	private String Hora;
	@XmlElement
	private String Entidad;
	@XmlElement
	private String RespuestaConsulta;

	@XmlElement
	private IncomeEstimator IncomeEstimator;

	// Getter Methods


	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}

	public String getCodigoTipoIndentificacion() {
		return CodigoTipoIndentificacion;
	}

	public String getNumeroIdentificacion() {
		return NumeroIdentificacion;
	}

	public String getNombreTitular() {
		return NombreTitular;
	}

	public String getNombreCiiu() {
		return NombreCiiu;
	}

	public String getLugarExpedicion() {
		return LugarExpedicion;
	}

	public String getFechaExpedicion() {
		return FechaExpedicion;
	}

	public String getEstado() {
		return Estado;
	}

	public String getNumeroInforme() {
		return NumeroInforme;
	}

	public String getEstadoTitular() {
		return EstadoTitular;
	}

	public String getRangoEdad() {
		return RangoEdad;
	}

	public String getCodigoCiiu() {
		return CodigoCiiu;
	}

	public String getCodigoDepartamento() {
		return CodigoDepartamento;
	}

	public String getCodigoMunicipio() {
		return CodigoMunicipio;
	}

	public String getFecha() {
		return Fecha;
	}

	public String getHora() {
		return Hora;
	}

	public String getEntidad() {
		return Entidad;
	}

	public String getRespuestaConsulta() {
		return RespuestaConsulta;
	}

	// Setter Methods


	public void setTipoIdentificacion(String TipoIdentificacion) {
		this.TipoIdentificacion = TipoIdentificacion;
	}

	public void setCodigoTipoIndentificacion(String CodigoTipoIndentificacion) {
		this.CodigoTipoIndentificacion = CodigoTipoIndentificacion;
	}

	public void setNumeroIdentificacion(String NumeroIdentificacion) {
		this.NumeroIdentificacion = NumeroIdentificacion;
	}

	public void setNombreTitular(String NombreTitular) {
		this.NombreTitular = NombreTitular;
	}

	public void setNombreCiiu(String NombreCiiu) {
		this.NombreCiiu = NombreCiiu;
	}

	public void setLugarExpedicion(String LugarExpedicion) {
		this.LugarExpedicion = LugarExpedicion;
	}

	public void setFechaExpedicion(String FechaExpedicion) {
		this.FechaExpedicion = FechaExpedicion;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}

	public void setNumeroInforme(String NumeroInforme) {
		this.NumeroInforme = NumeroInforme;
	}

	public void setEstadoTitular(String EstadoTitular) {
		this.EstadoTitular = EstadoTitular;
	}

	public void setRangoEdad(String RangoEdad) {
		this.RangoEdad = RangoEdad;
	}

	public void setCodigoCiiu(String CodigoCiiu) {
		this.CodigoCiiu = CodigoCiiu;
	}

	public void setCodigoDepartamento(String CodigoDepartamento) {
		this.CodigoDepartamento = CodigoDepartamento;
	}

	public void setCodigoMunicipio(String CodigoMunicipio) {
		this.CodigoMunicipio = CodigoMunicipio;
	}

	public void setFecha(String Fecha) {
		this.Fecha = Fecha;
	}

	public void setHora(String Hora) {
		this.Hora = Hora;
	}

	public void setEntidad(String Entidad) {
		this.Entidad = Entidad;
	}

	public void setRespuestaConsulta(String RespuestaConsulta) {
		this.RespuestaConsulta = RespuestaConsulta;
	}

	/**
	 * @return the incomeEstimator
	 */
	public IncomeEstimator getIncomeEstimator() {
		return IncomeEstimator;
	}

	/**
	 * @param incomeEstimator
	 *            the incomeEstimator to set
	 */
	public void setIncomeEstimator(IncomeEstimator incomeEstimator) {
		IncomeEstimator = incomeEstimator;
	}
	
	

	/**
	 * @return the identificadorLinea
	 */
	 @XmlElement(name = "IdentificadorLinea")  
	public String getIdentificadorLinea() {
		return identificadorLinea;
	}

	/**
	 * @param identificadorLinea the identificadorLinea to set
	 */
	public void setIdentificadorLinea(String identificadorLinea) {
		this.identificadorLinea = identificadorLinea;
	}

	@Override
	public String toString() {
		return String.format(
				"%nTercero [identificadorLinea=%s,%nTipoIdentificacion=%s,%nCodigoTipoIndentificacion=%s,%nNumeroIdentificacion=%s,%nNombreTitular=%s,%nNombreCiiu=%s,%nLugarExpedicion=%s,%nFechaExpedicion=%s,%nEstado=%s,%nNumeroInforme=%s,%nEstadoTitular=%s,%nRangoEdad=%s,%nCodigoCiiu=%s,%nCodigoDepartamento=%s,%nCodigoMunicipio=%s,%nFecha=%s,%nHora=%s,%nEntidad=%s,%nRespuestaConsulta=%s,%nIncomeEstimator=%s]",
				identificadorLinea, TipoIdentificacion,
				CodigoTipoIndentificacion, NumeroIdentificacion, NombreTitular,
				NombreCiiu, LugarExpedicion, FechaExpedicion, Estado,
				NumeroInforme, EstadoTitular, RangoEdad, CodigoCiiu,
				CodigoDepartamento, CodigoMunicipio, Fecha, Hora, Entidad,
				RespuestaConsulta, IncomeEstimator);
	}
	
}