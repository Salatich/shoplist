import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Router, Resolve} from '@angular/router';
import {DataService} from "./data.service";
import { Observable } from 'rxjs/Observable';
import {IList} from "../models/IList";

@Injectable()
export class ListsDataResolveService  implements Resolve<any>{
  constructor(private dataService: DataService) {}

  resolve(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): Observable<IList[]>{
    return this.dataService.getLists();
  }

}
