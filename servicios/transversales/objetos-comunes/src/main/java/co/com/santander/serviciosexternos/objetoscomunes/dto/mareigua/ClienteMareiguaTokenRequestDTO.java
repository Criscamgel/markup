/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.santander.serviciosexternos.objetoscomunes.dto.mareigua;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

public class ClienteMareiguaTokenRequestDTO {
	
	@NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private TokenRequest requestBody;

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
    
    public class TokenRequest {

        @JsonProperty("grant_type")
    	private String grant_type;

        @JsonProperty("username")
    	private String username;

        @JsonProperty("password")
    	private String password;
    	
    	public TokenRequest() {
		}
    	
    	public TokenRequest(String grant_type, String username, String password) {
    		super();
    		this.grant_type = grant_type;
    		this.username = username;
    		this.password = password;
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
    }
}
