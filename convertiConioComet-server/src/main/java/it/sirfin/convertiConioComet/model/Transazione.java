package it.sirfin.convertiConioComet.model;

import java.time.LocalDate;

public class Transazione 
{
	private Double valuta;
	private Double valutaDollaro;
	private String descrizione;
	private LocalDate data;
	
	public Transazione() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Double getValuta() {
		return valuta;
	}
	
	public void setValuta(Double valuta) {
		this.valuta = valuta;
	}
	
	public Double getValutaDollaro() {
		return valutaDollaro;
	}
	
	public void setValutaDollaro(Double valutaDollaro) {
		this.valutaDollaro = valutaDollaro;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Transazione [valuta=" + valuta + ", valutaDollaro=" + valutaDollaro + ", descrizione=" + descrizione
				+ ", data=" + data + "]";
	}
	
	
}
