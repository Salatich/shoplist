import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {IList} from "../models/IList";

@Component({
  selector: 'app-lists',
  templateUrl: './lists.component.html',
  styleUrls: ['./lists.component.scss'],
  // providers: [DataService]
})
export class ListsComponent implements OnInit {

  public lists: IList[];

  constructor(private route: ActivatedRoute) { }

  ngOnInit() {
    this.lists = this.route.snapshot.data['lists'];
  }

}
