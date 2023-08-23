import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddnewanimeformComponent } from './addnewanimeform.component';

describe('AddnewanimeformComponent', () => {
  let component: AddnewanimeformComponent;
  let fixture: ComponentFixture<AddnewanimeformComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddnewanimeformComponent]
    });
    fixture = TestBed.createComponent(AddnewanimeformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
