"use strict"

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

const productList = [];
productList.push(new Product("M&M", "Snacks", 1.99));
productList.push(new Product("Table", "Furniture", 199));
productList.push(new Product("Kale", "Vegetables", 2.49));

function populateTable() {
    const tableBody = document.getElementById('productTable').getElementsByTagName('tbody')[0];
    tableBody.innerHTML = '';

    const headerHtml = `
        <tr>
            <th>Product Name</th>
            <th>Product Category</th>
            <th>Product Price</th>
            <th>Action</th>
        </tr>`;
    const firstRow = tableBody.insertRow();
    firstRow.innerHTML = headerHtml;

    productList.forEach(product => {
        let row = tableBody.insertRow();
        let nameCell = row.insertCell(0);
        let categoryCell = row.insertCell(1);
        let priceCell = row.insertCell(2);
        let actionCell = row.insertCell(3);

        nameCell.textContent = product.name;
        categoryCell.textContent = product.category;
        priceCell.textContent = `$${product.price}`;
        actionCell.innerHTML = '<button onclick="deleteProduct(this)">Delete</button>';
    });
}

// Event listener for form submission
document.getElementById('addProductForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    // Retrieve the values from the form
    const name = document.getElementById('product-name').value;
    const category = document.getElementById('product-category').value;
    const price = document.getElementById('product-price').value;

    // Add the new product
    addProduct(name, category, price);

    // Clear the form fields
    document.getElementById('product-name').value = '';
    document.getElementById('product-category').value = '';
    document.getElementById('product-price').value = '';
});

// Function to delete product
window.deleteProduct = function(button) {
    // Find the row the button is in
    const row = button.parentNode.parentNode;
    const index = row.rowIndex - 1; // Adjust for header row
    productList.splice(index, 1); // Remove the product from the array
    populateTable(); // Re-populate the table
};

// Function to add a new product
function addProduct(name, category, price) {
    productList.push(new Product(name, category, price));
    populateTable(); // Re-populate the table
}

populateTable();

