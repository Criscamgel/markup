import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeConInteresComponent } from './home-con-interes.component';

describe('HomeConInteresComponent', () => {
  let component: HomeConInteresComponent;
  let fixture: ComponentFixture<HomeConInteresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeConInteresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeConInteresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
