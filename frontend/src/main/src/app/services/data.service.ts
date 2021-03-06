import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {Response, Headers} from '@angular/http';
import {IList} from '../models/IList';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';


@Injectable()
export class DataService {

  constructor(private http: Http){ }

  postList(obj: IList){

    const body = JSON.stringify(obj);

    let headers = new Headers({ 'Content-Type': 'application/json;charset=utf-8' });

    return this.http.post('http://localhost:8080/create/list', body, { headers: headers })
      .map((resp:Response)=>resp.json())
      .catch((error:any) =>{return Observable.throw(error);});
  }
  getLists(): Observable<IList[]>{
    let headers = new Headers({ 'Content-Type': 'application/json;charset=utf-8' });

    return this.http.get('http://localhost:8080/get/lists', { headers: headers })
      .map((resp:Response)=>resp.json())
      .catch((error:any) =>{return Observable.throw(error);});

  }
}
