
 
let listPersons = [
  {
    name: "Vishal",
    age: 30,
    residence: "vizag",
  },
  {
    name: "Markus",
    age: 22,
     residence: "hydeabad",
  },
  {
    name: "deva",
    age: 12,
    residence: "tanuku",
  },
  {
   name: "ramana",
  age: 34,
 residence: "guntur",
  }
]

// <----excercise 9----->
//  for(let i = 0; i < listPersons.length; i++) {
//     if(listPersons[i].age>=18)
//     {
//         listPersons[i].status = "major";
//     }else
//     {
//         listPersons[i].status = "minor";
//     }
 
   
//  }
 
// console.log(listPersons);
listPersons.map(i=>{
  if(i.age>=18){
    i.status="Adult";
  }
  else{
    i.status="Minor";
  }
});
console.log(listPersons);
 
