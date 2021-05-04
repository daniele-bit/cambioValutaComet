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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		result = prime * result + ((valutaDollaro == null) ? 0 : valutaDollaro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transazione other = (Transazione) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		if (valutaDollaro == null) {
			if (other.valutaDollaro != null)
				return false;
		} else if (!valutaDollaro.equals(other.valutaDollaro))
			return false;
		return true;
	}
	
	
}
