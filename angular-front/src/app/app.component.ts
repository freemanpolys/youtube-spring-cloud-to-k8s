import {Component, OnInit} from '@angular/core';
import {CountryService} from './country.service';
import {Country} from './contry.entity';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'angular-front';
  public  country : Country;
  public flagBase64;
  public population;
  public languages : any[];

  constructor(private countryService: CountryService,private domSanitizer: DomSanitizer) {
  }

  ngOnInit(): void {
    this.countryService.getCountry().subscribe( res => {
      this.country = res.result;
      this.flagBase64 = this.domSanitizer.bypassSecurityTrustUrl(this.country.flagBase64);

    });

    this.countryService.getPopulation().subscribe( res => {
      this.population = res.result["population"];
      console.log("====== " + JSON.stringify(this.population));
    });

    this.countryService.getLang().subscribe( res => {
      this.languages = res.result;
      console.log("====== " + JSON.stringify(this.languages));
    });


  }
}
