package it.sirfin.convertiConioComet.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.sirfin.convertiConioComet.model.Transazione;
import it.sirfin.convertiConioComet.service.TransazioneService;

@Service
public class TransazioneServiceImpl implements TransazioneService
{
	List<Transazione> transazioni = new ArrayList();

	@Override
	public List<Transazione> aggiungiTransazione(Transazione transazione) 
	{
		transazione=cambioValuta(transazione);
		this.transazioni.add(transazione);
		return this.transazioni;
	}

	private Transazione cambioValuta(Transazione transazione) {
		transazione.setValutaDollaro(transazione.getValuta()*1.21);
		return transazione;
	}
	
	
	
}
