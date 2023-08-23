import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteanimebuttonComponent } from './deleteanimebutton.component';

describe('DeleteanimebuttonComponent', () => {
  let component: DeleteanimebuttonComponent;
  let fixture: ComponentFixture<DeleteanimebuttonComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeleteanimebuttonComponent]
    });
    fixture = TestBed.createComponent(DeleteanimebuttonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
