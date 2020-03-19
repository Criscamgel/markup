/**
 * 
 */
package co.com.santander.serviciosexternos.objetoscomunes.dto.income;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author itac
 *
 */
@XmlRootElement(name = "IncomeEstimator")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class IncomeEstimator {
	@XmlElement
	private String IngresoEstimado;
	@XmlElement
	private String CapacidadPago;
	@XmlElement
	private String CapacidadEndeuda;
	@XmlElement
	private String CantProductosTotal;
	@XmlElement
	private String VlrInicialTotal;
	@XmlElement
	private String SaldoTotal;
	@XmlElement
	private String CuotaTotal;
	@XmlElement
	private String CantNoRotativo;
	@XmlElement
	private String VlrInicialNoRotativo;
	@XmlElement
	private String SaldoNoRotativo;
	@XmlElement
	private String CuotaNoRotativo;
	@XmlElement
	private String CantidadTdc;
	@XmlElement
	private String CupoTdc;
	@XmlElement
	private String SaldoTdc;
	@XmlElement
	private String CuotaTdc;
	@XmlElement
	private String Score;
	@XmlElement
	private String ProbaIncumplimiento;
	@XmlElement
	private String FechaAdicion;

	// Getter Methods

	public String getIngresoEstimado() {
		return IngresoEstimado;
	}

	public String getCapacidadPago() {
		return CapacidadPago;
	}

	public String getCapacidadEndeuda() {
		return CapacidadEndeuda;
	}

	public String getCantProductosTotal() {
		return CantProductosTotal;
	}

	public String getVlrInicialTotal() {
		return VlrInicialTotal;
	}

	public String getSaldoTotal() {
		return SaldoTotal;
	}

	public String getCuotaTotal() {
		return CuotaTotal;
	}

	public String getCantNoRotativo() {
		return CantNoRotativo;
	}

	public String getVlrInicialNoRotativo() {
		return VlrInicialNoRotativo;
	}

	public String getSaldoNoRotativo() {
		return SaldoNoRotativo;
	}

	public String getCuotaNoRotativo() {
		return CuotaNoRotativo;
	}

	public String getCantidadTdc() {
		return CantidadTdc;
	}

	public String getCupoTdc() {
		return CupoTdc;
	}

	public String getSaldoTdc() {
		return SaldoTdc;
	}

	public String getCuotaTdc() {
		return CuotaTdc;
	}

	public String getScore() {
		return Score;
	}

	public String getProbaIncumplimiento() {
		return ProbaIncumplimiento;
	}

	public String getFechaAdicion() {
		return FechaAdicion;
	}

	// Setter Methods

	public void setIngresoEstimado(String ingresoEstimado) {
		this.IngresoEstimado = ingresoEstimado;
	}

	public void setCapacidadPago(String CapacidadPago) {
		this.CapacidadPago = CapacidadPago;
	}

	public void setCapacidadEndeuda(String CapacidadEndeuda) {
		this.CapacidadEndeuda = CapacidadEndeuda;
	}

	public void setCantProductosTotal(String CantProductosTotal) {
		this.CantProductosTotal = CantProductosTotal;
	}

	public void setVlrInicialTotal(String VlrInicialTotal) {
		this.VlrInicialTotal = VlrInicialTotal;
	}

	public void setSaldoTotal(String SaldoTotal) {
		this.SaldoTotal = SaldoTotal;
	}

	public void setCuotaTotal(String CuotaTotal) {
		this.CuotaTotal = CuotaTotal;
	}

	public void setCantNoRotativo(String CantNoRotativo) {
		this.CantNoRotativo = CantNoRotativo;
	}

	public void setVlrInicialNoRotativo(String VlrInicialNoRotativo) {
		this.VlrInicialNoRotativo = VlrInicialNoRotativo;
	}

	public void setSaldoNoRotativo(String SaldoNoRotativo) {
		this.SaldoNoRotativo = SaldoNoRotativo;
	}

	public void setCuotaNoRotativo(String CuotaNoRotativo) {
		this.CuotaNoRotativo = CuotaNoRotativo;
	}

	public void setCantidadTdc(String CantidadTdc) {
		this.CantidadTdc = CantidadTdc;
	}

	public void setCupoTdc(String CupoTdc) {
		this.CupoTdc = CupoTdc;
	}

	public void setSaldoTdc(String SaldoTdc) {
		this.SaldoTdc = SaldoTdc;
	}

	public void setCuotaTdc(String CuotaTdc) {
		this.CuotaTdc = CuotaTdc;
	}

	public void setScore(String Score) {
		this.Score = Score;
	}

	public void setProbaIncumplimiento(String ProbaIncumplimiento) {
		this.ProbaIncumplimiento = ProbaIncumplimiento;
	}

	public void setFechaAdicion(String FechaAdicion) {
		this.FechaAdicion = FechaAdicion;
	}

	@Override
	public String toString() {
		return String.format(
				"%nIncomeEstimator [ingresoEstimado=%s,%nCapacidadPago=%s,%nCapacidadEndeuda=%s,%nCantProductosTotal=%s,%nVlrInicialTotal=%s,%nSaldoTotal=%s,%nCuotaTotal=%s,%nCantNoRotativo=%s,%nVlrInicialNoRotativo=%s,%nSaldoNoRotativo=%s,%nCuotaNoRotativo=%s,%nCantidadTdc=%s,%nCupoTdc=%s,%nSaldoTdc=%s,%nCuotaTdc=%s,%nScore=%s,%nProbaIncumplimiento=%s,%nFechaAdicion=%s]",
				IngresoEstimado, CapacidadPago, CapacidadEndeuda,
				CantProductosTotal, VlrInicialTotal, SaldoTotal, CuotaTotal,
				CantNoRotativo, VlrInicialNoRotativo, SaldoNoRotativo,
				CuotaNoRotativo, CantidadTdc, CupoTdc, SaldoTdc, CuotaTdc,
				Score, ProbaIncumplimiento, FechaAdicion);
	}


	
}