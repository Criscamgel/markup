package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public class MensajeSmsRequestDTO {
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private MensajeSms requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public MensajeSms getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(MensajeSms requestBody) {
        this.requestBody = requestBody;
    }

    public class MensajeSms{
        @NotNull
        @JsonProperty("identificadorTransaccion")
        private String identificadorTransaccion;

        @NotNull
        @JsonProperty("perfil")
        private String perfil;

        @NotNull
        @JsonProperty("destinatario")
        private List<String> destinatario;

        @NotNull
        @JsonProperty("canal")
        private String canal;

        @NotNull
        @JsonProperty("mensaje")
        private String mensaje;

        @NotNull
        @JsonProperty("UrlRedireccionLog")
        private String UrlRedireccionLog;

        @NotNull
        @JsonProperty("argumentosPersonalizados")
        private ArgumentosPersonalizadosSmsDTO argumentosPersonalizados;

        public String getIdentificadorTransaccion() {
            return identificadorTransaccion;
        }

        public void setIdentificadorTransaccion(String identificadorTransaccion) {
            this.identificadorTransaccion = identificadorTransaccion;
        }

        public String getPerfil() {
            return perfil;
        }

        public void setPerfil(String perfil) {
            this.perfil = perfil;
        }

        public List<String> getDestinatario() {
            return destinatario;
        }

        public void setDestinatario(List<String> destinatario) {
            this.destinatario = destinatario;
        }

        public String getCanal() {
            return canal;
        }

        public void setCanal(String canal) {
            this.canal = canal;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getUrlRedireccionLog() {
            return UrlRedireccionLog;
        }

        public void setUrlRedireccionLog(String urlRedireccionLog) {
            UrlRedireccionLog = urlRedireccionLog;
        }

        public ArgumentosPersonalizadosSmsDTO getArgumentosPersonalizados() {
            return argumentosPersonalizados;
        }

        public void setArgumentosPersonalizados(ArgumentosPersonalizadosSmsDTO argumentosPersonalizados) {
            this.argumentosPersonalizados = argumentosPersonalizados;
        }

        public MensajeSms() {
        }
    }
}
