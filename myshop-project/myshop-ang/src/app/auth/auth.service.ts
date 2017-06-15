import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/of';
import { AuthInfo, ANONYMOUS } from './auth-info'

@Injectable()
export class AuthService {

  constructor() { }

  getAuthInfo():Observable<AuthInfo> {
      return Observable.of(ANONYMOUS);
  }


}
