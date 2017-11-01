import { Component, OnInit } from '@angular/core';
import {IList} from "../IList";
// import {dataService} from "../services/data.service"

@Component({
  selector: 'app-list-creating',
  templateUrl: './list-creating.component.html',
  styleUrls: ['./list-creating.component.css']
})
export class ListCreatingComponent implements OnInit {

  list:IList;

  listName:string = '';
  item:string = '';
  items:string[] = [];

  constructor() { }

  ngOnInit() {
  }


  addItem(){
    this.item && this.items.push(this.item);
    this.item = '';

  }
  saveList(){
    this.list.name = this.listName;
    this.list.body = this.items;
  }


}
