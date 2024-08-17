import { Department } from "./department.model";
export class Employee {
  empId: number;
  empName: string;
  salary: number;
  gender: string;
  email: string;
  dob: string;
  address: string;
  coreskill: string;
  experienceInYears: number;
  department: Department;

  constructor(
    empId: number = 0, // default value
    empName: string = '',
    salary: number = 0,
    gender: string = '',
    email: string = '',
    dob: string = '',
    address: string = '',
    coreskill: string = '',
    experienceInYears: number = 0,
    department: Department = new Department(0, 'no department', 'no manager')
  ) {
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.gender = gender;
    this.email = email;
    this.dob = dob;
    this.address = address;
    this.coreskill = coreskill;
    this.experienceInYears = experienceInYears;
    this.department = department;
  }
}





/*IMP:these variables should be same as springbootentity class variables */
