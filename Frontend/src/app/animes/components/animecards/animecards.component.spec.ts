import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimecardsComponent } from './animecards.component';

describe('AnimecardsComponent', () => {
  let component: AnimecardsComponent;
  let fixture: ComponentFixture<AnimecardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AnimecardsComponent]
    });
    fixture = TestBed.createComponent(AnimecardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
