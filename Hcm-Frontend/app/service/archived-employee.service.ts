import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee.model';
@Injectable({
  providedIn: 'root'
})
export class ArchivedEmployeeService {

  private apiUrl = 'http://localhost:8083/archives';

  constructor(private http:HttpClient) { }

  getArchivedEmployees() : Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.apiUrl}`);
  }

  getArchivedEmployeeById(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.apiUrl}/${id}`);
  }
}
