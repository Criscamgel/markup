package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class PerfilMensajeriaDTO {
    @NotNull
    @JsonProperty("perfil")
    private String perfil;

    @NotNull
    @JsonProperty("canal")
    private String canal;

    @NotNull
    @JsonProperty("configuracion")
    private ConfiguracionMensajeriaDTO configuracion;

    @NotNull
    @JsonProperty("acceso")
    private AccesoMensajeriaDTO acceso;

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public AccesoMensajeriaDTO getAcceso() {
        return acceso;
    }

    public void setAcceso(AccesoMensajeriaDTO acceso) {
        this.acceso = acceso;
    }

    public ConfiguracionMensajeriaDTO getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(ConfiguracionMensajeriaDTO configuracion) {
        this.configuracion = configuracion;
    }

    public PerfilMensajeriaDTO() {
    }
}
