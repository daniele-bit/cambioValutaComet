package it.sirfin.convertiConioComet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.sirfin.convertiConioComet.dto.ListaGenericaDto;
import it.sirfin.convertiConioComet.dto.TransazioneDto;
import it.sirfin.convertiConioComet.model.Transazione;
import it.sirfin.convertiConioComet.service.TransazioneService;

@CrossOrigin("*")
@RestController
public class TransazioneController 
{
	@Autowired
	TransazioneService transazioneService;
	
	@RequestMapping("/transazione")
	@ResponseBody
	ListaGenericaDto<Transazione> aggiungiTransazione(@RequestBody TransazioneDto dto)
	{
		return transazioneService.aggiungiTransazione(dto.getTransazione());
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	void cancellaTransazione(@RequestBody TransazioneDto dto)
	{
		transazioneService.delete(dto.getTransazione());
	}
}
