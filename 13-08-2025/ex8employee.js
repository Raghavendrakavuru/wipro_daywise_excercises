var employeeList = [
  {
    name: "John Doe",empId:123,salary: 80000, role: "Manager",
  },
  {
    name: "Mark Freeman",empId:623,salary: 30000, role: "QA",
  },
  {
    name: "sam",empId:871,salary: 50000, role: "Developer",
  },
  {
    name: "Patricia  Dark",empId:244,salary: 60000, role: "Manager",
  },
];

var mgrSalary = employeeList.reduce((acc, emp) => {
  acc.push(emp.salary);
  return acc;
}, []);
 
console.log(onlyNames);