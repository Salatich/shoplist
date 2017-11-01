import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCreatingComponent } from './list-creating.component';

describe('ListCreatingComponent', () => {
  let component: ListCreatingComponent;
  let fixture: ComponentFixture<ListCreatingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListCreatingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListCreatingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
