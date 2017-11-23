import {IItem} from "./IItem";

export class IList {
  public name: string;
  public items: IItem[];

  constructor(name: string = '', items: IItem[] = []) {
    this.name = name;
    this.items = items;
  }

}


