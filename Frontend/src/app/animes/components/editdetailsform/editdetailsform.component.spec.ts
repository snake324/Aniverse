import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditdetailsformComponent } from './editdetailsform.component';

describe('EditdetailsformComponent', () => {
  let component: EditdetailsformComponent;
  let fixture: ComponentFixture<EditdetailsformComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditdetailsformComponent]
    });
    fixture = TestBed.createComponent(EditdetailsformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
