package co.com.santander.serviciosexternos.objetoscomunes.dto.ubica;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CIFIN")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UbicaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3189856222201038899L;

	private Tercero tercero;
	private String archivo;

	// Getter Methods
	
	@XmlElement(name = "Tercero")
	public Tercero getTercero() {
		return tercero;
	}

	public String get_archivo() {
		return archivo;
	}

	// Setter Methods

	public void setTercero(Tercero TerceroObject) {
		this.tercero = TerceroObject;
	}

	public void set_archivo(String archivo) {
		this.archivo = archivo;
	}
	
	@Override
	public String toString() {
		return String.format("%nUbicaResponse [Tercero=%s,%narchivo=%s]", tercero,
				archivo);
	}
}