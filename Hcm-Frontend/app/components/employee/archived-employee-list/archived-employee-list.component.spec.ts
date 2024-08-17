import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArchivedEmployeeListComponent } from './archived-employee-list.component';

describe('ArchivedEmployeeListComponent', () => {
  let component: ArchivedEmployeeListComponent;
  let fixture: ComponentFixture<ArchivedEmployeeListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ArchivedEmployeeListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ArchivedEmployeeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
