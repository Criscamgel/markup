package co.com.santander.datos.calculadora.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 * @author brian.gomez
 *
 */
@Entity
@Table(name = "parametro")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Parametro implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "valor_numerico")
    private double valorNumerico;

    @Column(name = "valor_texto")
    private String valorTexto;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name="id_aliado", nullable = false)
    private Aliado aliado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(double valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    public String getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    public Aliado getAliado() {
        return aliado;
    }

    public void setAliado(Aliado aliado) {
        this.aliado = aliado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
