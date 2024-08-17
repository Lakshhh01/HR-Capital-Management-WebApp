import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
//STEP -2 for routing the components
//import approutingmodule and all the componenst created
//Now got to->(step-3 home.component.html)
// import { AppRoutingModule } from './app.routes';
import { FooterComponent } from './components/footer/footer.component';
import { EmployeeHomepageComponent } from './components/employee/employee-homepage/employee-homepage.component';
import { CreateEmployeeComponent } from './components/employee/create-employee/create-employee.component';
import { FormsModule } from '@angular/forms';  // Import FormsModule
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { TrainingsHomepageComponent } from './components/trainings/trainings-homepage/trainings-homepage.component';
import { EmployeeListComponent } from './components/employee/employee-list/employee-list.component';
import { ArchivedEmployeeListComponent } from './components/employee/archived-employee-list/archived-employee-list.component';
import { EditEmployeeComponent } from './components/employee/edit-employee/edit-employee.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { EditRecruitmentComponent } from './components/recruitments/edit-recruitment/edit-recruitment.component';
import { RecruitmentListComponent } from './components/recruitments/recruitment-list/recruitment-list.component';
// import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    // HttpClient,
    HttpClientModule,
    RouterOutlet,
    NavbarComponent,
    FormsModule,
    HomeComponent,
    FooterComponent,
    AboutComponent,
    ContactComponent,
    EmployeeHomepageComponent,
    CreateEmployeeComponent,
    EmployeeListComponent,
    EditEmployeeComponent,
    ArchivedEmployeeListComponent,
    RecruitmentListComponent,
    EditRecruitmentComponent,
    TrainingsHomepageComponent,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'hcm-project-frontend';
}


