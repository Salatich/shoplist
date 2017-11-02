import {Component, OnInit} from '@angular/core';
import {IList} from "../IList";
import {IItem} from "../IItem";
import {DataService} from "../services/data.service";

@Component({
  selector: 'app-list-creating',
  templateUrl: './list-creating.component.html',
  styleUrls: ['./list-creating.component.css'],
  providers: [DataService]
})
export class ListCreatingComponent implements OnInit {

  savedTitle: boolean = false;
  listTitle: string;
  item: string;
  items: IItem[] = [];


  list: IList = new IList();

  constructor(private dataService: DataService) {
  }

  ngOnInit() {
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
    console.log(JSON.stringify(this.list));
    this.dataService.postData(this.list)
      .subscribe((data) => {
      console.log(data);
      });
  }

  saveListTitle(event){
    if (event.keyCode === 13 ){
      this.savedTitle = true;
    }
  }


}
