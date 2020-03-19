package co.com.santander.datos.calculadora.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author brian.gomez
 *
 */
@Entity
@Table(name = "usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_aliado", referencedColumnName = "id")
    private Aliado aliado;

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "fecha")
    private Timestamp fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Aliado getAliado() {
        return aliado;
    }

    public void setAliado(Aliado aliado) {
        this.aliado = aliado;
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
}
