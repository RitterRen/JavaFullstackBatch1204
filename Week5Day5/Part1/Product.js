class Product {
    constructor(name, category, price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    // Method to display product information
    displayInfo() {
        console.log(`Product Name: ${this.name}`);
        console.log(`Category: ${this.category}`);
        console.log(`Price: $${this.price.toFixed(2)}`); // Converts number to a string with two decimal places
    }
}