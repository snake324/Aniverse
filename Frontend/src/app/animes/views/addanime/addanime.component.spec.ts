import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddanimeComponent } from './addanime.component';

describe('AddanimeComponent', () => {
  let component: AddanimeComponent;
  let fixture: ComponentFixture<AddanimeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddanimeComponent]
    });
    fixture = TestBed.createComponent(AddanimeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
