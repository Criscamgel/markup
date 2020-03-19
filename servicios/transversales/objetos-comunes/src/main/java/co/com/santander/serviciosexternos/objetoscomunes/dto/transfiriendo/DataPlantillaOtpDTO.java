package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class DataPlantillaOtpDTO {
    @NotNull
    @JsonProperty("plantilla")
    private String plantilla;
    @NotNull
    @JsonProperty("cuerpo")
    private String cuerpo;
    @NotNull
    @JsonProperty("perfil")
    private String perfil;

    public String getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(String plantilla) {
        this.plantilla = plantilla;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
