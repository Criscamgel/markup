package co.com.santander.datos.calculadora.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 
 * @author brian.gomez
 *
 */
@Entity
@Table(name = "aliado")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aliado implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre_aliado")
    private String nombreAliado;

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "fecha")
    private Timestamp fecha;

    @OneToOne(mappedBy = "aliado")
    private Usuario usuario;

    @OneToMany(mappedBy = "aliado", fetch = FetchType.EAGER)
    private List<Parametro> parametros;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAliado() {
        return nombreAliado;
    }

    public void setNombreAliado(String nombreAliado) {
        this.nombreAliado = nombreAliado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(List<Parametro> parametros) {
        this.parametros = parametros;
    }
}
