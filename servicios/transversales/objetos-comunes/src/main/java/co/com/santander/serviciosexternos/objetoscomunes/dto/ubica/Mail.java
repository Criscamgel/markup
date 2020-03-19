package co.com.santander.serviciosexternos.objetoscomunes.dto.ubica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Mail")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Mail {
	 private String NoReportes;
	 private String PrimerReporte;
	 private String UltimoReporte;
	 private String Correo;
	 //private String _pos;


	 // Getter Methods 
	 @XmlElement(name = "NoReportes")
	 public String getNoReportes() {
	  return NoReportes;
	 }
	 
	 @XmlElement(name = "PrimerReporte")
	 public String getPrimerReporte() {
	  return PrimerReporte;
	 }
	 
	 @XmlElement(name = "UltimoReporte")
	 public String getUltimoReporte() {
	  return UltimoReporte;
	 }
	 
	 @XmlElement(name = "Correo")
	 public String getCorreo() {
	  return Correo;
	 }
	 
//	 @XmlElement(name = "pos")
//	 public String get_pos() {
//	  return _pos;
//	 }

	 // Setter Methods 

	 public void setNoReportes(String NoReportes) {
	  this.NoReportes = NoReportes;
	 }

	 public void setPrimerReporte(String PrimerReporte) {
	  this.PrimerReporte = PrimerReporte;
	 }

	 public void setUltimoReporte(String UltimoReporte) {
	  this.UltimoReporte = UltimoReporte;
	 }

	 public void setCorreo(String Correo) {
	  this.Correo = Correo;
	 }

//	 public void set_pos(String _pos) {
//	  this._pos = _pos;
//	 }
	}