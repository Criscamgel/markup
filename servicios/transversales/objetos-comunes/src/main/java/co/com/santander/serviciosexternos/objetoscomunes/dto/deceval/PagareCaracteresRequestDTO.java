package co.com.santander.serviciosexternos.objetoscomunes.dto.deceval;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

public class PagareCaracteresRequestDTO <T> {
	
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
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
