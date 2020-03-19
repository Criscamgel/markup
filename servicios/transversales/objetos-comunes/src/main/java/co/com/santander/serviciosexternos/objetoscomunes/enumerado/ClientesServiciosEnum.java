package co.com.santander.serviciosexternos.objetoscomunes.enumerado;

public enum ClientesServiciosEnum {
    DICTUM(1),
    DECEVAL(2),
    EVIDENTE_MASTER(3),
    INCOME(4),
    LEGAL_CHECK(5),
    MAREIGUA(6),
    MFT(7),
    QUANTO3(8),
    RECONOCER(9),
    TRANSFIRIENDO(10),
    UBICA(11),
    VIGIA(12),
    ACCESO_DATOS_EXTERNOS(13),
    ACCESO_DATOS_CALCULADORA(14);

    private Integer idCliente;

    ClientesServiciosEnum(Integer idCliente){
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
