import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeContigenciaComponent } from './home-contigencia.component';

describe('HomeContigenciaComponent', () => {
  let component: HomeContigenciaComponent;
  let fixture: ComponentFixture<HomeContigenciaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeContigenciaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeContigenciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
