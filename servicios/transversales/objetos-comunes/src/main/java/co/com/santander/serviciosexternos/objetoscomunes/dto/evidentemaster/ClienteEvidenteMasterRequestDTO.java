/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.santander.serviciosexternos.objetoscomunes.dto.evidentemaster;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;

/**
 *
 * @author gustavocastro
 */
public class ClienteEvidenteMasterRequestDTO<T> {
	@NotNull
	@JsonProperty("requestHeader")
	private RequestHeaderDTO requestHeaderDTO;
	
	
	@JsonProperty("requestBody")
	private T body;
	
	

	public RequestHeaderDTO getRequestHeaderDTO() {
		return requestHeaderDTO;
	}

	public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
		this.requestHeaderDTO = requestHeaderDTO;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	
	
}
