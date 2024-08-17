import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeHomepageComponent } from './employee-homepage.component';

describe('EmployeeHomepageComponent', () => {
  let component: EmployeeHomepageComponent;
  let fixture: ComponentFixture<EmployeeHomepageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployeeHomepageComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeHomepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
