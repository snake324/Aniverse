import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupbuttonComponent } from './signupbutton.component';

describe('SignupbuttonComponent', () => {
  let component: SignupbuttonComponent;
  let fixture: ComponentFixture<SignupbuttonComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SignupbuttonComponent]
    });
    fixture = TestBed.createComponent(SignupbuttonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
