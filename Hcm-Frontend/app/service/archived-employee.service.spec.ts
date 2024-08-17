import { TestBed } from '@angular/core/testing';

import { ArchivedEmployeeService } from './archived-employee.service';

describe('ArchivedEmployeeService', () => {
  let service: ArchivedEmployeeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArchivedEmployeeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
