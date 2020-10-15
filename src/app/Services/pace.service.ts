import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Pace } from '../Pace/paceModel';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PaceService {

  private pacesUrl: string;
  

  constructor(private http: HttpClient) {  
    this.pacesUrl = 'http://localhost:8080/paces';
     
   }

  //get
  public findAllPaces(): Observable<Pace[]> {
    return this.http.get<Pace[]>(this.pacesUrl);
  }

  public save(pace: Pace) {
    return this.http.post<Pace>(this.pacesUrl, pace);
  }
}