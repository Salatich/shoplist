export class IItem {
  public description: string

  constructor(description: string = '') {
    this.description = description;
  }

  clean() {
    this.description = '';
  }
}


