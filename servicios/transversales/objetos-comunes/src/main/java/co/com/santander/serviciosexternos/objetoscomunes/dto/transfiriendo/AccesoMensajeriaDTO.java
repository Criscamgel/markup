package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccesoMensajeriaDTO {
    @JsonProperty("smtp")
    private String smtp;

    @JsonProperty("puerto")
    private int puerto;

    @JsonProperty("usuario")
    private String usuario;

    @JsonProperty("clave")
    private String clave;

    @JsonProperty("ssl")
    private boolean ssl;

    @JsonProperty("apikey")
    private String apikey;

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}
