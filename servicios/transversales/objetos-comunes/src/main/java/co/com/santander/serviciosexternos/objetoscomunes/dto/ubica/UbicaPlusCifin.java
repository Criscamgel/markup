package co.com.santander.serviciosexternos.objetoscomunes.dto.ubica;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UbicaPlusCifin")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UbicaPlusCifin {
	
	private String generoTercero;
	private ArrayList<Telefono> telefonos;
	private ArrayList<Celular> celulares;
	private ArrayList<Mail> mails;

	// Getter Methods
	
	@XmlElement(name = "GeneroTercero")
	public String getGeneroTercero() {
		return generoTercero;
	}
	
	@XmlElement(name = "Telefonos")
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}
	
	@XmlElement(name = "Celulares")
	public ArrayList<Celular> getCelulares() {
		return celulares;
	}
	
	@XmlElement(name = "Mails")
	public ArrayList<Mail> getMails() {
		return mails;
	}

	// Setter Methods

	public void setGeneroTercero(String GeneroTercero) {
		this.generoTercero = GeneroTercero;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void setCelulares(ArrayList<Celular> celulares) {
		this.celulares = celulares;
	}

	public void setMails(ArrayList<Mail> mails) {
		this.mails = mails;
	}

	@Override
	public String toString() {
		String info = "" ;
		info.concat("UbicaPlusCifin [generoTercero=" + generoTercero);
		
		return "UbicaPlusCifin [generoTercero=" + generoTercero + ", telefonos=" + telefonos + ", celulares="
				+ celulares + ", mails=" + mails + "]";
	}
	
}
