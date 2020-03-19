package co.com.santander.serviciosexternos.objetoscomunes.dto.mareigua;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

public class ClienteMareiguaConsultaRequestDTO {

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

	public class ConsultasRequest {
		
		@NotNull
		@JsonProperty("token")
		private String token;

		@NotNull
		@JsonProperty("tipo_identificacion_id")
		private Integer tipo_identificacion_id;

		@NotNull
		@JsonProperty("numero_empleado_id")
		private String numero_empleado_id;

		@NotNull
		@JsonProperty("salario_mensual")
		private Integer salario_mensual;

		@NotNull
		@JsonProperty("producto_id")
		private Integer producto_id;
		
		public ConsultasRequest() {
		}
		
		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getTipo_identificacion_id() {
			return tipo_identificacion_id;
		}

		public void setTipo_identificacion_id(Integer tipo_identificacion_id) {
			this.tipo_identificacion_id = tipo_identificacion_id;
		}

		public String getNumero_empleado_id() {
			return numero_empleado_id;
		}

		public void setNumero_empleado_id(String numero_empleado_id) {
			this.numero_empleado_id = numero_empleado_id;
		}

		public Integer getSalario_mensual() {
			return salario_mensual;
		}

		public void setSalario_mensual(Integer salario_mensual) {
			this.salario_mensual = salario_mensual;
		}

		public Integer getProducto_id() {
			return producto_id;
		}

		public void setProducto_id(Integer producto_id) {
			this.producto_id = producto_id;
		}
	}

}
