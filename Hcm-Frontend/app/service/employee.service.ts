import { HttpClient } from '@angular/common/http';// HTTP requests bhejne ke liye.
import { Injectable } from '@angular/core';// Is class ko service banane ke liye jo inject ho sake.
import { Employee } from '../model/employee.model';
import { Observable } from 'rxjs';
import { HttpClientModule } from '@angular/common/http';
//HTTP requests asynchronous hote hain,
// yani yeh background mein chalenge aur jab response aayega tab
// result milta hai. 
//Observable asynchronous operations ko handle karne ke liye use hota hai.
import { ApiResponse } from '../model/api.response';
//Structured format mein response ko receive karne ke liye,
// taaki aapko status code, message, aur result mile.


@Injectable({//Yeh line batati hai ki yeh class ek service hai jo application mein kahin bhi use ki ja sakti ha

  providedIn: 'root'//Matlab yeh service pura application mein ek hi instance (singleton) mein available hogi.
})


export class EmployeeService {

  
  private apiUrl = 'http://localhost:8083/api/employees';

  constructor(private http: HttpClient) {}


  // Create
  createEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(`${this.apiUrl}/create`, employee);
  }

  // Read
  getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.apiUrl);
  }

  getEmployeeById(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.apiUrl}/${id}`);
  }

  // Update
  updateEmployee(id: number, employee: Employee): Observable<ApiResponse> {
    return this.http.put<ApiResponse>(`${this.apiUrl}/update/${id}`, employee);
  }

  // Delete
  deleteEmployee(id: number): Observable<string> {
    return this.http.delete(`${this.apiUrl}/delete/${id}`, { responseType: 'text' });
  }
  

  // //getArchived Employees//
  // getArchivedEmployees():Observable<Employee[]>{
  //   return this.http.get<Employee[]>(`${this.apiUrl}`);
  // }
}
