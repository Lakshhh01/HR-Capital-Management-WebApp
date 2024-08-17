import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { Recruitment } from '../../../model/recruitment.model';
import { RecruitmentService } from '../../../service/recruitment.service';

@Component({
  selector: 'app-recruitment-list',
  standalone: true,
  imports: [
    HttpClientModule,
    RouterModule,
    CommonModule
  ],
  templateUrl: './recruitment-list.component.html',
  styleUrl: './recruitment-list.component.css'
})
export class RecruitmentListComponent implements OnInit{

  recruitments: Recruitment [] = [];

  constructor(private recruitmentService: RecruitmentService,private router:Router){ }

  ngOnInit(): void {
      this.recruitmentService.getRecruitments().subscribe((data:Recruitment[])=>{
        console.log(data);
        this.recruitments=data;
      });
  }

  deleteRecruitment(rId:string):void {
        // console.log("delete employee button clicked..");
        if(confirm("Are you sure you want to delete this entry?"))
          {
            this.recruitmentService.deleteRecruitment(rId).subscribe(
              (Response)=>{
                alert("Recruitment Deleted Successfully!!");
                console.log("Recruitment deleted successfully!");
                this.recruitments=this.recruitments.filter((recruitment=>recruitment.recruitmentId!==rId))
              },
              (error)=>{
                alert("Something went wrong!!");
                console.log("error deleteing recruitment..",error);
              }
            );
          }


  }
  updateRecruitment(recruitmentId: string): void {
    console.log("update recruitment button clicked..");
    this.router.navigate(['/edit-recruitment',recruitmentId]);
  }


}
