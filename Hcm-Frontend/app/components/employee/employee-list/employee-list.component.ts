import { Component,NgModule,OnInit } from '@angular/core';
import { Employee } from '../../../model/employee.model';
import { EmployeeService } from '../../../service/employee.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RouterModule,Router } from '@angular/router';
import { NgModel } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-employee-list',
  standalone: true,
  imports: [
    HttpClientModule,
    RouterModule,
    CommonModule
  ],
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})

export class EmployeeListComponent implements OnInit{
  
  
  employees: Employee[] = [];

  constructor(private employeeService: EmployeeService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe((data: Employee[]) => {
      console.log(data); 
      this.employees = data;
    });
  }

  deleteEmployee(employeeId: number): void {
    // console.log("delete employee button clicked..");
    if(confirm("Are you sure you want to delete this entry?"))
    {
      this.employeeService.deleteEmployee(employeeId).subscribe(
        (Response)=>{
          alert("Employee Deleted Successfully!!");
          console.log("employee deleted successfully!");
          //yaha se wo employeeobject archived employees wale list k page pr jana chahiye//
          this.employees=this.employees.filter((employee=>employee.empId!== employeeId));
        },
        (error)=>{
          alert("Something went wrong!!");
          console.log("error deleteing employee..",error);
        }
      );
    }
  }

  updateEmployee(employeeId: number): void {
    console.log("update employee button clicked..");
    this.router.navigate(['/edit-employee', employeeId]);
  }
}