package co.com.santander.serviciosexternos.objetoscomunes.dto.reconocer;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

/**
 * 
 * @author brian.gomez
 *
 */
public class ClienteReconocerTokenRequestDTO {

	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;

	@JsonProperty("requestBody")
	private TokenRequest requestBody;
	
	public ClienteReconocerTokenRequestDTO() {
		
	}
	
	public ClienteReconocerTokenRequestDTO(RequestHeaderDTO requestHeaderDTO, TokenRequest requestBody) {
		super();
		this.requestHeaderDTO = requestHeaderDTO;
		this.requestBody = requestBody;
	}

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public TokenRequest getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(TokenRequest requestBody) {
		this.requestBody = requestBody;
	}

	public static class TokenRequest {

		@NotNull
		@JsonProperty("grant_type")
		private String grant_type;

		@NotNull
		@JsonProperty("username")
		private String username;

		@NotNull
		@JsonProperty("password")
		private String password;

		@NotNull
		@JsonProperty("scope")
		private String scope;
		
		public TokenRequest() {
			
		}

		public TokenRequest(String grant_type, String username, String password, String scope) {
			super();
			this.grant_type = grant_type;
			this.username = username;
			this.password = password;
			this.scope = scope;
		}

		public String getGrant_type() {
			return grant_type;
		}

		public void setGrant_type(String grant_type) {
			this.grant_type = grant_type;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getScope() {
			return scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}
	}

}
