package co.com.santander.serviciosexternos.objetoscomunes.dto.income;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CIFIN")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class IncomeEstimatorDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3458339765870445L;
	
	
	@XmlElement
	private Tercero Tercero;
	private String archivo;


	/**
	 * @param tercero the tercero to set
	 */
	public void setTercero(Tercero tercero) {
		Tercero = tercero;
	}



	/**
	 * @return the tercero
	 */
	public Tercero getTercero() {
		return Tercero;
	}
	

	/**
	 * @return the archivo
	 */
	public String getArchivo() {
		return archivo;
	}



	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}



	@Override
	public String toString() {
		return String.format("%nIncomeEstimatorResponse [Tercero=%s,%narchivo=%s]", Tercero,
				archivo);
	}

	
}