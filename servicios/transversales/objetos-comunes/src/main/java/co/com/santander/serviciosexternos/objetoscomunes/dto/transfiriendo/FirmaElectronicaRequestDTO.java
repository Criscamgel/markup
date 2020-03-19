package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class FirmaElectronicaRequestDTO {
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private FirmaElectronica requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public FirmaElectronica getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(FirmaElectronica requestBody) {
        this.requestBody = requestBody;
    }

    public class FirmaElectronica{
        @NotNull
        @JsonProperty("llave")
        private String llave;
        @NotNull
        @JsonProperty("otp")
        private String otp;
        @NotNull
        @JsonProperty("huellaDigital")
        private String huellaDigital;
        @NotNull
        @JsonProperty("identificadorTransaccion")
        private String identificadorTransaccion;

        public String getLlave() {
            return llave;
        }

        public void setLlave(String llave) {
            this.llave = llave;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getHuellaDigital() {
            return huellaDigital;
        }

        public void setHuellaDigital(String huellaDigital) {
            this.huellaDigital = huellaDigital;
        }

        public String getIdentificadorTransaccion() {
            return identificadorTransaccion;
        }

        public void setIdentificadorTransaccion(String identificadorTransaccion) {
            this.identificadorTransaccion = identificadorTransaccion;
        }
    }
}
