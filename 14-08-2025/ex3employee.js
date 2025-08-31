class Employee{
     constructor (name, empid, salary)
     {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
     }
     getDetails()
     {
    // return [this.name,this.empid,this.salary];
     return 'Name; $ {this.name}, EmpId: ${this.empid}, Salary : ${this.salary}';
     }
}

let emp1= new Employee("deva",121,40000);
console.log(emp1);