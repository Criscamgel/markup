package co.com.santander.serviciosexternos.objetoscomunes.dto.reconocer;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

/**
 * 
 * @author brian.gomez
 *
 */
public class ClienteReconocerRequestDTO {
    
	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;

	@NotNull
	@JsonProperty("requestBody")
	private ConsultasRequest requestBody;

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public ConsultasRequest getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(ConsultasRequest requestBody) {
		this.requestBody = requestBody;
	}

	public static class ConsultasRequest {
		
		@NotNull
		@JsonProperty("token")
		private String token;

		@NotNull
		@JsonProperty("tipoId")
		private Integer tipoId;

		@NotNull
		@JsonProperty("numeroId")
		private String numeroId;

		@NotNull
		@JsonProperty("nit")
		private String nit;

		@NotNull
		@JsonProperty("primerApellidoBuscar")
		private String primerApellidoBuscar;
		
		@NotNull
		@JsonProperty("validarNombre")
		private Boolean validarNombre;
		
		public ConsultasRequest() {
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getTipoId() {
			return tipoId;
		}

		public void setTipoId(Integer tipoId) {
			this.tipoId = tipoId;
		}

		public String getNumeroId() {
			return numeroId;
		}

		public void setNumeroId(String numeroId) {
			this.numeroId = numeroId;
		}

		public String getNit() {
			return nit;
		}

		public void setNit(String nit) {
			this.nit = nit;
		}

		
		public String getPrimerApellidoBuscar() {
			return primerApellidoBuscar;
		}

		public void setPrimerApellidoBuscar(String primerApellidoBuscar) {
			this.primerApellidoBuscar = primerApellidoBuscar;
		}

		public Boolean getValidarNombre() {
			return validarNombre;
		}

		public void setValidarNombre(Boolean validarNombre) {
			this.validarNombre = validarNombre;
		}

	}
}
