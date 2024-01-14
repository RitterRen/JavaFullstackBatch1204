import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CitiesService {
  cities: City[] = [
    {
      name: "Paris",
      description: "Paris is the capital of England"
    },
    {
      name: "Guangzhou",
      description: "Guangzhou has a lot of delicious food and province."
    },
    {
      name: "Tokyo",
      description: "I want to go to Tokyo !"
    }
  ];

  constructor() { }
}

export interface City {
  name: string,
  description: string,
}
