import { Component, OnInit } from '@angular/core';
import { Employee } from '../../../model/employee.model';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { EmployeeService } from '../../../service/employee.service';
import { ArchivedEmployeeService } from '../../../service/archived-employee.service';
@Component({
  selector: 'app-archived-employee-list',
  standalone: true,
  imports: [
    
    HttpClientModule,
    RouterModule,
    CommonModule
  ],
  templateUrl: './archived-employee-list.component.html',
  styleUrl: './archived-employee-list.component.css'
})
export class ArchivedEmployeeListComponent implements OnInit{

  archivedEmployees: Employee[] = [];

  constructor (private archivedEmployeeService: ArchivedEmployeeService) {}

  ngOnInit(): void {
      this.archivedEmployeeService.getArchivedEmployees().subscribe((data:Employee[]) => {
              console.log(data);
              this.archivedEmployees=data;
            }
      )
  }

}
