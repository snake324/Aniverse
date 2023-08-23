import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimedetailsComponent } from './animedetails.component';

describe('AnimedetailsComponent', () => {
  let component: AnimedetailsComponent;
  let fixture: ComponentFixture<AnimedetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AnimedetailsComponent]
    });
    fixture = TestBed.createComponent(AnimedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
