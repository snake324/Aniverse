import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailcardsComponent } from './detailcards.component';

describe('DetailcardsComponent', () => {
  let component: DetailcardsComponent;
  let fixture: ComponentFixture<DetailcardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetailcardsComponent]
    });
    fixture = TestBed.createComponent(DetailcardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
