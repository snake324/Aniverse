import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddnewanimebuttonComponent } from './addnewanimebutton.component';

describe('AddnewanimebuttonComponent', () => {
  let component: AddnewanimebuttonComponent;
  let fixture: ComponentFixture<AddnewanimebuttonComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddnewanimebuttonComponent]
    });
    fixture = TestBed.createComponent(AddnewanimebuttonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
