package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class MensajeriaRequestDTO {
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private PerfilMensajeriaDTO requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public PerfilMensajeriaDTO getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(PerfilMensajeriaDTO requestBody) {
        this.requestBody = requestBody;
    }
}
