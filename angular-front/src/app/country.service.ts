import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CountryService {
  private LANG_POPULATIN_BASE_URL = "srvlapo";
  constructor(private http: HttpClient) {}

  getCountry(): Observable<any> {
    console.log(environment.apiUrl + "srvcfla/country");
    return this.http.get<any>(environment.apiUrl + "srvcfla/country")
  }

  getPopulation(): Observable<any> {
    console.log(environment.apiUrl + "srvlapo/population");
    return this.http.get<any>(environment.apiUrl + "srvlapo/population")
  }

  getLang(): Observable<any> {
    console.log(environment.apiUrl + "srvlapo/lang");
    return this.http.get<any>(environment.apiUrl + "srvlapo/lang")
  }
}
