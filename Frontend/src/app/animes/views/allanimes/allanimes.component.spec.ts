import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllanimesComponent } from './allanimes.component';

describe('AllanimesComponent', () => {
  let component: AllanimesComponent;
  let fixture: ComponentFixture<AllanimesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AllanimesComponent]
    });
    fixture = TestBed.createComponent(AllanimesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
