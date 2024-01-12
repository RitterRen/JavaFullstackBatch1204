import { Component, Input, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product.interface';

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})
export class ProductTableComponent implements OnInit {
  @Input() products: Array<Product> = [
    { name: 'M&M', category: 'Snacks', price: 1.99 },
    { name: 'Table', category: 'Furniture', price: 199 },
    { name: 'Kale', category: 'Vegetables', price: 2.49 }
  ];

  constructor() { }

  ngOnInit(): void {
  }

  deleteProduct(index: number): void {
    this.products.splice(index, 1);
  }

}
