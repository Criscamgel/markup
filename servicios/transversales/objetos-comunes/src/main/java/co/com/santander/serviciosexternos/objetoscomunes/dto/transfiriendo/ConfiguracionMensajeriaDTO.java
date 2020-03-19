package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ConfiguracionMensajeriaDTO {
    @NotNull
    @JsonProperty("remitente")
    private String remitente;
    @NotNull
    @JsonProperty("aliasRemitente")
    private String aliasRemitente;

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getAliasRemitente() {
        return aliasRemitente;
    }

    public void setAliasRemitente(String aliasRemitente) {
        this.aliasRemitente = aliasRemitente;
    }
}
