import { NgModule, NgModuleDecorator } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { provideRouter } from '@angular/router';
// STEP- 1-> 
// define routes: for routing the component to theier respective pages//
//Now got to step-2-> app.component.ts
import { CreateEmployeeComponent } from './components/employee/create-employee/create-employee.component';
import { EmployeeHomepageComponent } from './components/employee/employee-homepage/employee-homepage.component';
// import { BrowserModule } from '@angular/platform-browser';
import { HomeComponent } from './components/home/home.component';
import { AppComponent } from './app.component';
import { EmployeeService } from './service/employee.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { EmployeeListComponent } from './components/employee/employee-list/employee-list.component';
import { TrainingsHomepageComponent } from './components/trainings/trainings-homepage/trainings-homepage.component';
import { ArchivedEmployeeListComponent } from './components/employee/archived-employee-list/archived-employee-list.component';
import { RecruitmentListComponent } from './components/recruitments/recruitment-list/recruitment-list.component';
import { EditEmployeeComponent } from './components/employee/edit-employee/edit-employee.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { EditRecruitmentComponent } from './components/recruitments/edit-recruitment/edit-recruitment.component';
import { CreateRecruitmentComponent } from './components/recruitments/create-recruitment/create-recruitment.component';
export const routes: Routes = [

    {path:'',redirectTo: '/home',pathMatch:'full'},
    {path:'home',component:HomeComponent},
    {path:'employee',component:EmployeeHomepageComponent},
    {path:'add',component:CreateEmployeeComponent},
    {path:'view',component:EmployeeListComponent},
    {path:'edit-employee/:id',component:EditEmployeeComponent},
    {path:'archives',component:ArchivedEmployeeListComponent},
    {path:'recruitments',component:RecruitmentListComponent},
    {path:'edit-recruitment/:id',component:EditRecruitmentComponent},
    {path:'create-recruitment',component:CreateRecruitmentComponent},
    {path:'trainings',component:TrainingsHomepageComponent},
    {path:'about',component:AboutComponent},
    {path:'contact',component:ContactComponent}
];

@NgModule({
    imports:[
        // HttpClient,
        HttpClientModule,
        FormsModule,
        RouterModule.forRoot(routes)],
    exports:[RouterModule],
    providers:[EmployeeService],
    // bootstrap:[AppComponent]
})

export class AppRoutingModule { }

