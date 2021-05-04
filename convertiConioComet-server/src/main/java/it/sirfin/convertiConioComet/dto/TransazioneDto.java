package it.sirfin.convertiConioComet.dto;

import it.sirfin.convertiConioComet.model.Transazione;

public class TransazioneDto {
	Transazione transazione = new Transazione();

	public TransazioneDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transazione getTransazione() {
		return transazione;
	}

	public void setTransazione(Transazione transazione) {
		this.transazione = transazione;
	}

	@Override
	public String toString() {
		return "TransazioneDto [transazione=" + transazione + "]";
	}
	
}
