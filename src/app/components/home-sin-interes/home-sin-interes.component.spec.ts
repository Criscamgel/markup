import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeSinInteresComponent } from './home-sin-interes.component';

describe('HomeSinInteresComponent', () => {
  let component: HomeSinInteresComponent;
  let fixture: ComponentFixture<HomeSinInteresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeSinInteresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeSinInteresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
