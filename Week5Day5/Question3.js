"use strict";

class Vehicle {
    constructor(name, engine, speed) {
        this.name = name;
        this.engine = engine;
        this.speed = speed;
    }

    info() {
        console.log(this.name + " has engine " + this.engine + " max speed is " + this.speed);
    }
}

class Car extends Vehicle {
    constructor(name, engine, speed, wheels, brake) {
        super(name, engine, speed);
        this.wheels = wheels;
        this.brake = brake;
    }

    honk() {
        console.log("HONK !");
    }

    static isTesla(car) {
        return car.brake;
    }
}

const tesla = new Car("tesla", 4, 1000, 4, true);
console.log(Car.isTesla(tesla));

