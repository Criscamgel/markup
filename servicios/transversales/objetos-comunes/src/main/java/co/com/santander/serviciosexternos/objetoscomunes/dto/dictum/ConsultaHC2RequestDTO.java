package co.com.santander.serviciosexternos.objetoscomunes.dto.dictum;

import javax.validation.constraints.NotNull;
import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ConsultaHC2RequestDTO <T> {
	
	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;
	
	@NotNull
	@JsonProperty("requestBody")
	private ConsultaHc2 requestBody;

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public ConsultaHc2 getBody() {
		return requestBody;
	}

	public void setBody(ConsultaHc2 body) {
		this.requestBody = body;
	}

	public class ConsultaHc2 {
		
		@NotNull
		@JsonProperty("primerApellido")
		private String primerApellido;

		@JsonProperty("parametros")
		private List<T> parametros;


		public String getPrimerApellido() {
			return primerApellido;
		}

		public void setPrimerApellido(String primerApellido) {
			this.primerApellido = primerApellido;
		}


		public List<T> getParametros() {
			return parametros;
		}

		public void setParametros(List<T> parametros) {
			this.parametros = parametros;
		}

		public ConsultaHc2() {
		}
	}
}
