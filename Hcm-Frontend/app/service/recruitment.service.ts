import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Recruitment } from '../model/recruitment.model';
import { Observable } from 'rxjs';
import { ApiResponse } from '../model/api.response';

@Injectable({
  providedIn: 'root'
})
export class RecruitmentService {

  private apiUrl = 'http://localhost:8083/recruitment';

  constructor(private http : HttpClient) { }

  // Create
  createrecruitment(recruitment: Recruitment): Observable<string> {
    return this.http.post<string>(`${this.apiUrl}/create`, recruitment, { responseType: 'text' as 'json' });
}


  // Read
  getRecruitments(): Observable<Recruitment[]> {
    return this.http.get<Recruitment[]>(this.apiUrl);
  }

  getRecruitmentById(id: string): Observable<Recruitment> {
    return this.http.get<Recruitment>(`${this.apiUrl}/${id}`);
  }

  // Update
  updateRecruitment(id: string, recruitment: Recruitment): Observable<ApiResponse> {
    return this.http.put<ApiResponse>(`${this.apiUrl}/update/${id}`, recruitment);
  }

  // Delete
  deleteRecruitment(id: string): Observable<string> {
    return this.http.delete(`${this.apiUrl}/delete/${id}`, { responseType: 'text' });
  }
  


}
