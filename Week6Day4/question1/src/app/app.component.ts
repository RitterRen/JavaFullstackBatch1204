import { Component } from '@angular/core';
import { Product } from './models/product.interface';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'question1';

  products: Array<Product> = []; // 初始产品数组

  handleAdd(product: Product): void {
    this.products.push(product);
  }

  handleDelete(index: number): void {
    this.products.splice(index, 1);
  }
}
