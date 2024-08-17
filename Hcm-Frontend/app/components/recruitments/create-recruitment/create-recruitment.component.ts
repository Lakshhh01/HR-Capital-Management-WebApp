import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { routes } from '../../../app.routes';
import { Route, Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { Recruitment } from '../../../model/recruitment.model';
import { RecruitmentService } from '../../../service/recruitment.service';

@Component({
  selector: 'app-create-recruitment',
  standalone: true,
  imports: [
    HttpClientModule,
    CommonModule,
    RouterModule,
    FormsModule
  ],
  templateUrl: './create-recruitment.component.html',
  styleUrls: ['./create-recruitment.component.css']
})
export class CreateRecruitmentComponent implements OnInit {

  recruitment : Recruitment = new Recruitment();
  submitted=false;

  constructor(private recruitmentService: RecruitmentService,private router: Router){}

  ngOnInit(): void {  }

  onSubmit(){
    this.submitted=true;
    this.recruitmentService.createrecruitment(this.recruitment).subscribe(data=>{
      console.log(data);
      this.router.navigate(['/recruitments']);
    },error=>console.log(error)
  );
  }
}
