import { Component } from '@angular/core';
import { CitiesService, City } from '../cities.service';

@Component({
  selector: 'app-city-tabs',
  standalone: true,
  imports: [],
  templateUrl: './city-tabs.component.html',
  styleUrl: './city-tabs.component.css'
})
export class CityTabsComponent {
  constructor(
    private citiesService: CitiesService,
  ) {}
  
  cities: City[] = this.citiesService.cities;
  
  currentCity: City = this.cities[0];

  changeCityWithId(id: number) {
    this.currentCity = this.cities[id];
  }
}
