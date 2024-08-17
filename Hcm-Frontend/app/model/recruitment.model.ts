import { min } from "rxjs";

export class Recruitment{
    recruitmentId: string;
    noOfVacancies: number;
    skillRequired: string;
    minYearOfExperience: number;
    deptID: number;
    deptName: string;
    constructor(
        recruitmentId:string='',
        noOfVacancies: number=0,
        skillRequired: string='',
        minYearOfExperience: number=0,
        deptID: number=0,
        deptName: string='',

    ){
        this.recruitmentId=recruitmentId;
        this.noOfVacancies=noOfVacancies;
        this.skillRequired=skillRequired;
        this.minYearOfExperience=minYearOfExperience;
        this.deptID=deptID;
        this.deptName=deptName;
    }

}