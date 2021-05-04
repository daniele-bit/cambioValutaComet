package it.sirfin.convertiConioComet.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import it.sirfin.convertiConioComet.dto.ListaGenericaDto;
import it.sirfin.convertiConioComet.model.Transazione;
import it.sirfin.convertiConioComet.service.TransazioneService;

@Service
public class TransazioneServiceImpl implements TransazioneService
{
	List<Transazione> transazioni = new ArrayList();

	@Override
	public ListaGenericaDto<Transazione> aggiungiTransazione(Transazione transazione)
	{
		transazione = cambioValuta(transazione);
		this.transazioni.add(transazione);
		ListaGenericaDto<Transazione> listaGenerica = new ListaGenericaDto<>();
		listaGenerica.setLista(transazioni);
		return listaGenerica;
	}

	private Transazione cambioValuta(Transazione transazione)
	{
		transazione.setValutaDollaro(transazione.getValuta() * 1.21);
		return transazione;
	}

	@Override
	public ListaGenericaDto<Transazione> delete(Transazione transazione)
	{
		this.transazioni.remove(transazione);
		ListaGenericaDto<Transazione> dtoRes = new ListaGenericaDto<>();
		dtoRes.setLista(this.transazioni);
		return dtoRes;
	}
	
	//commento per merge

}
