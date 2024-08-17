import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { Recruitment } from '../../../model/recruitment.model';
import { RecruitmentService } from '../../../service/recruitment.service';
import { Employee } from '../../../model/employee.model';
import { error } from 'jquery';

@Component({
  selector: 'app-edit-recruitment',
  standalone: true,
  imports: [
    HttpClientModule,
    RouterModule,
    CommonModule,
    FormsModule
  ],
  templateUrl: './edit-recruitment.component.html',
  styleUrl: './edit-recruitment.component.css'
})
export class EditRecruitmentComponent implements OnInit {
  recruitment : Recruitment= new Recruitment();

  constructor(private route: ActivatedRoute, private router:Router,private recruitmentService: RecruitmentService) { }

  ngOnInit(): void {
      //get the recruitment id from  route parameters
      const recruitmentId=this.route.snapshot.params['id'];
      this.recruitmentService.getRecruitmentById(recruitmentId).subscribe(data=>{
        this.recruitment = data;
      });
  }

  //Updating the recruitment details//
  updateRecruitment(): void{
    this.recruitmentService.updateRecruitment(this.recruitment.recruitmentId,this.recruitment).subscribe(()=>{
      alert("recruitment updated succesfully!");
      this.router.navigate(['/recruitments']);
    },error=>{
      alert("failed to update Recruitment !");
      console.log(error);
    });
  }
}
