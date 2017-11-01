import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-creating',
  templateUrl: './list-creating.component.html',
  styleUrls: ['./list-creating.component.css']
})
export class ListCreatingComponent implements OnInit {

  items:string[] = [];

  constructor() { }

  ngOnInit() {
  }


  addItem(item:string){
    item && this.items.push(item);
  }


}
