import React, { useState } from 'react'
import './index.css'

export default function CityTabs() {
  const cities: City[] = [
    {cityName: "London", description: "London is the capital city of England."},
    {cityName: "Paris", description: "Paris is the capital of France."},
    {cityName: "Tokyo", description: "Tokyo is the capital of Japan"},
  ];
  const [activeCity, setActiveCity] = useState<City>(cities[0]);

  return (
    <div className="tab-component">
        <div className="tabs">
            {cities.map(city => (
                <button
                    key={city.cityName}
                    className={`tab-button ${activeCity === city ? 'active' : ''}`}
                    onClick={() => setActiveCity(city)}
                >
                    {city.cityName}
                </button>
            ))}
        </div>
        <div className="tab-content">
          <h1>{activeCity.cityName}</h1>
          <p>{activeCity.description}</p>
        </div>
    </div>
  )
}

interface City {
    cityName: string;
    description: string;
}
