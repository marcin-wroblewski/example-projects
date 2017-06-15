import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/of';
import { Product } from './product'

@Injectable()
export class ProductService {

    constructor(private http: Http) { }

    getProducts(): Observable<Product[]> {
        const url = 'products';
        return this.http.get(url).map(response => response.json() as Product[]);
    }

    addToBasket(product: Product): Observable<Response> {
        const url = "basket/add";
        return this.http.post(url, product);
    }

    getBasket(): Observable<any[]> {
        const url = "basket";
        return this.http.get(url)
            .map(response => {
                let basket = response.json();
                return basket;
            });
    }

}
