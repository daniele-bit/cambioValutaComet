package it.sirfin.convertiConioComet.dto;

import java.util.ArrayList;
import java.util.List;

public class ListaGenericaDto<T> 
{
	List<T> lista = new ArrayList<T>();
	
	public ListaGenericaDto() {
		super();
	}

	public List<T> getLista() {
		return lista;
	}

	public void setLista(List<T> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListaGenericaDto [lista=" + lista + "]";
	}
	
}
