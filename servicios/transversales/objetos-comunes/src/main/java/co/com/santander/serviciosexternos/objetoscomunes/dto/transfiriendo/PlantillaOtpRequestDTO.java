package co.com.santander.serviciosexternos.objetoscomunes.dto.transfiriendo;

import co.com.santander.serviciosexternos.objetoscomunes.dto.RequestHeaderDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class PlantillaOtpRequestDTO {
    @NotNull
    @JsonProperty("requestHeader")
    private RequestHeaderDTO requestHeaderDTO;

    @NotNull
    @JsonProperty("requestBody")
    private PlantillaOtp requestBody;

    public RequestHeaderDTO getRequestHeaderDTO() {
        return requestHeaderDTO;
    }

    public void setRequestHeaderDTO(RequestHeaderDTO requestHeaderDTO) {
        this.requestHeaderDTO = requestHeaderDTO;
    }

    public PlantillaOtp getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(PlantillaOtp requestBody) {
        this.requestBody = requestBody;
    }

    public class PlantillaOtp{
        @NotNull
        @JsonProperty("id")
        private String id;
        @NotNull
        @JsonProperty("data")
        private DataPlantillaOtpDTO data;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public DataPlantillaOtpDTO getData() {
            return data;
        }

        public void setData(DataPlantillaOtpDTO data) {
            this.data = data;
        }

        public PlantillaOtp() {
        }
    }

}
