import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MylistsComponent } from './mylists.component';

describe('MylistsComponent', () => {
  let component: MylistsComponent;
  let fixture: ComponentFixture<MylistsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MylistsComponent]
    });
    fixture = TestBed.createComponent(MylistsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
