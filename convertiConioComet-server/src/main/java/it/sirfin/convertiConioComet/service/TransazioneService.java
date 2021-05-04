package it.sirfin.convertiConioComet.service;

import java.util.List;

import it.sirfin.convertiConioComet.dto.ListaGenericaDto;
import it.sirfin.convertiConioComet.model.Transazione;

public interface TransazioneService 
{
	ListaGenericaDto<Transazione> aggiungiTransazione(Transazione transazione);
}
