package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class OtpRequestDTO {
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private Otp requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public Otp getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(Otp requestBody) {
        this.requestBody = requestBody;
    }

    public OtpRequestDTO() {
        this.requestBody = new OtpRequestDTO.Otp();
    }

    public class Otp{
        @NotNull
        @JsonProperty("llave")
        private String llave;
        @NotNull
        @JsonProperty("plantilla")
        private String plantilla;
        @NotNull
        @JsonProperty("ttl")
        private String ttl;
        @NotNull
        @JsonProperty("tipo")
        private String identificadorTransaccion;

        @NotNull
        @JsonProperty("canal")
        private String canal;

        @NotNull
        @JsonProperty("destinatario")
        private String destinatario;

        public String getLlave() {
            return llave;
        }

        public void setLlave(String llave) {
            this.llave = llave;
        }

        public String getPlantilla() {
            return plantilla;
        }

        public void setPlantilla(String plantilla) {
            this.plantilla = plantilla;
        }

        public String getTtl() {
            return ttl;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
        }

        public String getIdentificadorTransaccion() {
            return identificadorTransaccion;
        }

        public void setIdentificadorTransaccion(String identificadorTransaccion) {
            this.identificadorTransaccion = identificadorTransaccion;
        }

        public String getCanal() {
            return canal;
        }

        public void setCanal(String canal) {
            this.canal = canal;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public void setDestinatario(String destinatario) {
            this.destinatario = destinatario;
        }

        public Otp() {
        }
    }
}
