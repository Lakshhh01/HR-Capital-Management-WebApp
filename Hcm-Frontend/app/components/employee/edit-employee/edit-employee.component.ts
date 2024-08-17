import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router, RouterModule } from '@angular/router';
import { Employee } from '../../../model/employee.model';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { EmployeeService } from '../../../service/employee.service';
import { FormsModule,NgForm } from '@angular/forms';
@Component({
  selector: 'app-edit-employee',
  standalone: true,
  imports: [
    HttpClientModule,
    CommonModule,
    RouterModule,
    FormsModule
  ],
  templateUrl: './edit-employee.component.html',
  styleUrl: './edit-employee.component.css'
})
export class EditEmployeeComponent implements OnInit{
   employee:Employee= new Employee();

  constructor(private route: ActivatedRoute,private router : Router, private employeeService: EmployeeService) {}

ngOnInit(): void {

   // Get the employee ID from the route parameters
   const employeeId = this.route.snapshot.params['id'];
   this.employeeService.getEmployeeById(employeeId).subscribe(data => {
     this.employee = data;
   });
}

 // Update the employee details
 updateEmployee():void{
  this.employeeService.updateEmployee(this.employee.empId,this.employee).subscribe(()=>{
    alert("Employee updated successfully!!");
    this.router.navigate(['/employees']); //navigate back to employee-list page

  },error=>{
    alert("error in updating employee!");
    console.log(error);
  });
 }
  
}
