import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Purchase} from '../commmon/purchase';
import {Product} from '../common/product';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {
  private purchaseUrl="http://localhost:8084/api/checkout/purchase";
  constructor(private http: HttpClient) {}

  placeOrder(purchase: Purchase): Observable<any> {
    return this.http.post<Purchase>(this.purchaseUrl, purchase);
  }

}
