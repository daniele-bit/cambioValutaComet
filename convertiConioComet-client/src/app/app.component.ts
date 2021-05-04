import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ListaGenericaDto } from './model/dto/ListaGenericaDto';
import { TransazioneDto } from './model/dto/TransazioneDto';
import { Transazione } from './model/Transazione';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  transazione:Transazione = new Transazione;
  transazioni:Transazione[]  = [];
  constructor(private _httpClient:HttpClient){}
  aggiungi(){
    let dto:TransazioneDto = new TransazioneDto();
    dto.transazione = this.transazione;
    console.log(dto);
    this._httpClient.post<ListaGenericaDto<Transazione>>("http://localhost:8080/transazione",dto)
    .subscribe(value=>{
      this.transazioni = value.lista;
      this.transazione = new Transazione();

    });
  }
  cancella(t:Transazione)
  {
    let dto:TransazioneDto = new TransazioneDto();
    dto.transazione = t;
    this._httpClient.post<ListaGenericaDto<Transazione>>("http://localhost:8080/delete", dto)
    .subscribe(value=>{
      this.transazioni=value.lista;
      //merge
    })
  }


  //COMMENTO PER MERGE
}
