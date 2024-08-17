export class Department {
    deptID: number=0;
    deptName: string='';
    deptManager: string='';
  
    constructor(
      deptID: number = 0,  // Default value
      deptName: string = '', // Default value
      deptManager: string = '' // Default value
    ) {
      this.deptID = deptID;
      this.deptName = deptName;
      this.deptManager = deptManager;
    }
  }
  