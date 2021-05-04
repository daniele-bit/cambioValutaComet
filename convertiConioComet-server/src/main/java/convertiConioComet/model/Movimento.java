package convertiConioComet.model;

import java.time.LocalDate;

public class Movimento {

	private LocalDate data;
	private String descrizione;
	private double importoEuro;
	private double importoDollari;
	

	public Movimento() {
		super();
		
	}
	public Movimento(LocalDate data, String descrizione, double importoEuro, double importoDollari) {
		super();
		this.data = data;
		this.descrizione = descrizione;
		this.importoEuro = importoEuro;
		this.importoDollari = importoDollari;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getImportoEuro() {
		return importoEuro;
	}
	public void setImportoEuro(double importoEuro) {
		this.importoEuro = importoEuro;
	}
	public double getImportoDollari() {
		return importoDollari;
	}
	public void setImportoDollari(double importoDollari) {
		this.importoDollari = importoDollari;
	}
	
	
	
	
}
