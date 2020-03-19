package co.com.santander.serviciosexternos.objetoscomunes.dto.mft;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteMensajeriaRequestDTO {

	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;

	@NotNull
	@JsonProperty("requestBody")
	private MensajeRequest requestBody;

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public MensajeRequest getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(MensajeRequest requestBody) {
		this.requestBody = requestBody;
	}

	public class MensajeRequest {

		@NotNull
		@JsonProperty("from_Desde")
		private String from_Desde;

		@NotNull
		@JsonProperty("to_a")
		private String to_a;

		@NotNull
		@JsonProperty("subject_Asunto")
		private String subject_Asunto;

		@NotNull
		@JsonProperty("message_Mensaje")
		private String message_Mensaje;

		@NotNull
		@JsonProperty("cc")
		private String cc;
		@NotNull
		@JsonProperty("bcc")
		private String bcc;
		
                @JsonProperty("tipoDocumento")
		private Integer tipoDocumento;
		
		@NotNull
		@JsonProperty("numeroIdentificacion")
		private String numeroIdentificacion;
		
		public MensajeRequest() {
		}

		public String getFrom_Desde() {
			return from_Desde;
		}

		public void setFrom_Desde(String from_Desde) {
			this.from_Desde = from_Desde;
		}

		public String getTo_a() {
			return to_a;
		}

		public void setTo_a(String to_a) {
			this.to_a = to_a;
		}

		public String getSubject_Asunto() {
			return subject_Asunto;
		}

		public void setSubject_Asunto(String subject_Asunto) {
			this.subject_Asunto = subject_Asunto;
		}

		public String getMessage_Mensaje() {
			return message_Mensaje;
		}

		public void setMessage_Mensaje(String message_Mensaje) {
			this.message_Mensaje = message_Mensaje;
		}

		public String getCc() {
			return cc;
		}

		public void setCc(String cc) {
			this.cc = cc;
		}

		public String getBcc() {
			return bcc;
		}

		public void setBcc(String bcc) {
			this.bcc = bcc;
		}

		public Integer getTipoDocumento() {
			return tipoDocumento;
		}

		public void setTipoDocumento(Integer tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}

		public String getNumeroIdentificacion() {
			return numeroIdentificacion;
		}

		public void setNumeroIdentificacion(String numeroIdentificacion) {
			this.numeroIdentificacion = numeroIdentificacion;
		}
		
	}

}
