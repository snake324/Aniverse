import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditdetailsbuttonComponent } from './editdetailsbutton.component';

describe('EditdetailsbuttonComponent', () => {
  let component: EditdetailsbuttonComponent;
  let fixture: ComponentFixture<EditdetailsbuttonComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditdetailsbuttonComponent]
    });
    fixture = TestBed.createComponent(EditdetailsbuttonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
