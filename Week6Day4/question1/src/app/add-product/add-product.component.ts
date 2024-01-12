import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Output() productAdded = new EventEmitter<{ name: string, category: string, price: number }>();

  addProduct(name: string, category: string, price: number): void {
    this.productAdded.emit({ name, category, price: +price });
  }
}
