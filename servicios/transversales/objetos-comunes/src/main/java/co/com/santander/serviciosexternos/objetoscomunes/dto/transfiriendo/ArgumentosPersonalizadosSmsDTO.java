package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ArgumentosPersonalizadosSmsDTO {
    @NotNull
    @JsonProperty("nit")
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
