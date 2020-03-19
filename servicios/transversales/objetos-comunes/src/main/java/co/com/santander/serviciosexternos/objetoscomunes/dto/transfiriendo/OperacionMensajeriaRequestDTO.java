package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class OperacionMensajeriaRequestDTO {
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private OperacionMensajeria requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public OperacionMensajeria getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(OperacionMensajeria requestBody) {
        this.requestBody = requestBody;
    }

    public class OperacionMensajeria{
        @NotNull
        @JsonProperty("id")
        private String id;

        @NotNull
        @JsonProperty("data")
        private PerfilMensajeriaDTO data;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public PerfilMensajeriaDTO getData() {
            return data;
        }

        public void setData(PerfilMensajeriaDTO data) {
            this.data = data;
        }
    }
}
