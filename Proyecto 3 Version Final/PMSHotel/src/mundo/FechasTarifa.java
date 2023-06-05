package mundo;

import java.util.Date;

public class FechasTarifa {
	
	private Date FechaIni;
	private Date FechaFin;
	private Double Cambio;
	private String ID;
	
	public FechasTarifa(String id, Date fechaIni, Date fechaFin, Double cambio) {
		
		this.FechaIni = fechaIni;
		this.FechaFin = fechaFin;
		this.Cambio = cambio;
		this.ID = id;
	}
	
	
	
	public Date getFechaIni() {
		return FechaIni;
	}
	public void setFechaIni(Date fechaIni) {
		FechaIni = fechaIni;
	}
	public Date getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}
	public Double getCambio() {
		return Cambio;
	}
	public void setCambio(Double cambio) {
		Cambio = cambio;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
	

}
