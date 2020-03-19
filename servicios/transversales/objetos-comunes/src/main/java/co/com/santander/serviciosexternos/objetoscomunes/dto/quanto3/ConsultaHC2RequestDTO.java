package co.com.santander.serviciosexternos.objetoscomunes.dto.quanto3;

import java.util.List;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

public class ConsultaHC2RequestDTO <T> {
	
	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;
	
	@NotNull
	@JsonProperty("requestBody")
	private ConsultaHc2 body;

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public ConsultaHc2 getBody() {
		return body;
	}

	public void setBody(ConsultaHc2 body) {
		this.body = body;
	}

	public class ConsultaHc2{
		@NotNull
		@JsonProperty("clave")
		private String clave;

		@NotNull
		@JsonProperty("identificacion")
		private String identificacion;

		@NotNull
		@JsonProperty("primerApellido")
		private String primerApellido;

		@NotNull
		@JsonProperty("producto")
		private String producto;

		@NotNull
		@JsonProperty("tipoIdentificacion")
		private String tipoIdentificacion ;

		@NotNull
		@JsonProperty("usuario")
		private String usuario;

		@JsonProperty("parametros")
		private List<T> parametros;

		public String getClave() {
			return clave;
		}

		public void setClave(String clave) {
			this.clave = clave;
		}

		public String getIdentificacion() {
			return identificacion;
		}

		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}

		public String getPrimerApellido() {
			return primerApellido;
		}

		public void setPrimerApellido(String primerApellido) {
			this.primerApellido = primerApellido;
		}

		public String getProducto() {
			return producto;
		}

		public void setProducto(String producto) {
			this.producto = producto;
		}

		public String getTipoIdentificacion() {
			return tipoIdentificacion;
		}

		public void setTipoIdentificacion(String tipoIdentificacion) {
			this.tipoIdentificacion = tipoIdentificacion;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
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
