import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingsHomepageComponent } from './trainings-homepage.component';

describe('TrainingsHomepageComponent', () => {
  let component: TrainingsHomepageComponent;
  let fixture: ComponentFixture<TrainingsHomepageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TrainingsHomepageComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrainingsHomepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
