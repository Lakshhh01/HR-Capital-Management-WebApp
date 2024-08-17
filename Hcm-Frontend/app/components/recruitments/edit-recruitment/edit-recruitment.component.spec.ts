import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditRecruitmentComponent } from './edit-recruitment.component';

describe('EditRecruitmentComponent', () => {
  let component: EditRecruitmentComponent;
  let fixture: ComponentFixture<EditRecruitmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditRecruitmentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditRecruitmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
