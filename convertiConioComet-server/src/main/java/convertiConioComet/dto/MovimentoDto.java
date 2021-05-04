package convertiConioComet.dto;

import convertiConioComet.model.Movimento;

public class MovimentoDto {
	private Movimento movimento;
	
	
	

	public MovimentoDto() {
		super();
	}
	

	public MovimentoDto(Movimento movimento) {
		super();
		this.movimento = movimento;
	}


	public Movimento getMovimento() {
		return movimento;
	}

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	
	

}
