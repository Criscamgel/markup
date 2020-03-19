package co.com.santander.serviciosexternos.objetoscomunes.dto.vigia;

import javax.validation.constraints.NotNull;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author brian.gomez
 *
 */
public class RegistrarVerificacionTercerosRequestDTO {

	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;

	@NotNull
	@JsonProperty("requestBody")
	private RegistarVerificacionTerceros body;

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public RegistarVerificacionTerceros getBody() {
		return body;
	}

	public void setBody(RegistarVerificacionTerceros body) {
		this.body = body;
	}

	public static class RegistarVerificacionTerceros {

		@JsonProperty("nombre")
		private String nombre;

		@JsonProperty("numeroIdentificacion")
		private String numeroIdentificacion;

		@JsonProperty("porcentaje")
		private String porcentaje;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNumeroIdentificacion() {
			return numeroIdentificacion;
		}

		public void setNumeroIdentificacion(String numeroIdentificacion) {
			this.numeroIdentificacion = numeroIdentificacion;
		}

		public String getPorcentaje() {
			return porcentaje;
		}

		public void setPorcentaje(String porcentaje) {
			this.porcentaje = porcentaje;
		}
	}
}
