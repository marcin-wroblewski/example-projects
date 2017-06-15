import { Component, OnInit } from '@angular/core';
import { Product } from './product/product';
import { ProductService } from './product/product.service';
import { AuthInfo, ANONYMOUS } from './auth/auth-info';
import { AuthService } from './auth/auth.service';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
    products: Product[] = [];
    basket: any[] = [];
    authInfo: AuthInfo = ANONYMOUS;

    constructor(private productService: ProductService, private authService: AuthService) { }

    ngOnInit(): void {
        this.productService.getProducts().subscribe(products => this.products = products);
        this.updateBasket();
    }

    addToBasket(product: Product) {
        this.productService.addToBasket(product).subscribe(response => { this.updateBasket() });
    }

    updateBasket() {
        this.productService.getBasket().subscribe(basket => {
            this.basket = basket
        });
    }
}
