package co.com.santander.serviciosexternos.objetoscomunes.dto.mareigua;

public class ClienteMareiguaResponseDTO {
	
	private int codRespuesta;
    private String respuestaServicio;
    private String mensajeError;

    public int getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(int codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    public String getRespuestaServicio() {
        return respuestaServicio;
    }

    public void setRespuestaServicio(String respuestaServicio) {
        this.respuestaServicio = respuestaServicio;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public ClienteMareiguaResponseDTO() {
    }

    public ClienteMareiguaResponseDTO(int codRespuesta, String respuestaServicio, String mensajeError) {
        this.codRespuesta = codRespuesta;
        this.respuestaServicio = respuestaServicio;
        this.mensajeError = mensajeError;
    }
    
}
