import { Component } from '@angular/core';
import { Employee } from '../../../model/employee.model';
import { OnInit } from '@angular/core';
import { EmployeeService } from '../../../service/employee.service';
import { Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-create-employee',
  standalone: true,
  imports: [
    RouterModule,
    FormsModule,
    HttpClientModule
  ],
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  employee: Employee = new Employee();
  submitted = false;

  constructor(private employeeService: EmployeeService, private router: Router) {}

  ngOnInit(): void {}

  onSubmit() {
    this.submitted = true;
    this.employeeService.createEmployee(this.employee).subscribe(
      data => {
        console.log(data);
        this.router.navigate(['/employee']);
      },
      error => console.log(error)
    );
  }
}
