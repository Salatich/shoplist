import {Component, OnInit} from '@angular/core';
import {IList} from "../models/IList";
import {IItem} from "../models/IItem";
import {DataService} from "../services/data.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-creating',
  templateUrl: './list-creating.component.html',
  styleUrls: ['./list-creating.component.scss'],
  providers: [DataService]
})
export class ListCreatingComponent {

  savedTitle: boolean = false;
  listTitle: string;
  item: string;
  items: IItem[] = [];


  list: IList = new IList();

  constructor(private dataService: DataService, private router: Router) {
  }

  addItemOnKeypress(event){
    if (event.keyCode === 13 ){
      this.addItem();
    }
  }
  addItem() {
    this.item && this.items.push(
      new IItem(this.item)
    );
    this.item = '';

  }

  saveList() {
    this.list.name = this.listTitle;
    this.list.items = this.items;
    this.dataService.postList(this.list)
      .subscribe((data) => {
        console.log(data);
        this.router.navigate(['/']);
      });
  }

  saveListTitle(event){
    if (event.keyCode === 13 ){
      this.savedTitle = true;
    }
  }

  editListTitle(){
    this.savedTitle = false;
  }

  deleteItem(index){
    this.items.splice(index,1);
  }


}
