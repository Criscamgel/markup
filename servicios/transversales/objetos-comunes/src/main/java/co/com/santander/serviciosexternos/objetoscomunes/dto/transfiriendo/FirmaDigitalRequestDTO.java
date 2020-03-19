package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class FirmaDigitalRequestDTO {

    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private FirmaDigital requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public FirmaDigital getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(FirmaDigital requestBody) {
        this.requestBody = requestBody;
    }

    public class FirmaDigital{
        @NotNull
        @JsonProperty("idCertificado")
        private String idCertificado;
        @NotNull
        @JsonProperty("documento")
        private String documento;
        @NotNull
        @JsonProperty("razon")
        private String razon;
        @NotNull
        @JsonProperty("visible")
        private boolean visible;
        @NotNull
        @JsonProperty("identificadorTransaccion")
        private String identificadorTransaccion;

        public String getIdCertificado() {
            return idCertificado;
        }

        public void setIdCertificado(String idCertificado) {
            this.idCertificado = idCertificado;
        }

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public String getRazon() {
            return razon;
        }

        public void setRazon(String razon) {
            this.razon = razon;
        }

        public boolean isVisible() {
            return visible;
        }

        public void setVisible(boolean visible) {
            this.visible = visible;
        }

        public String getIdentificadorTransaccion() {
            return identificadorTransaccion;
        }

        public void setIdentificadorTransaccion(String identificadorTransaccion) {
            this.identificadorTransaccion = identificadorTransaccion;
        }

        public FirmaDigital() {
        }
    }
}
