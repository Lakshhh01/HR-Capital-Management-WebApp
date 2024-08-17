import { Component } from '@angular/core';
import { CreateEmployeeComponent } from '../create-employee/create-employee.component';
import { RouterLink } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-employee-homepage',
  standalone: true,
  imports: [
    CreateEmployeeComponent,
    RouterLink,
    HttpClientModule, 
    // HttpClient
  ],
  templateUrl: './employee-homepage.component.html',
  styleUrl: './employee-homepage.component.css'
})
export class EmployeeHomepageComponent {

  
}
