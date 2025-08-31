class Util{
 constructor(){

 }
 getDate(){
    var today;
    let dd=String(today.getDate() + 1);;
    let mm=String(today.getMonth() + 1);
    let yyyy=today.getYear();
    return `$[dd]-$[mm]-$[yyyy]`;
}
   getPIValue(){
    return Math.PI
   }

   convertCF(celsius){
    return (celsius*9/5)+32;
   }
   getFibonacci(n){
    let fib1[]={0,1};
    let c;
    for(let i=0;i<=n;i++){
       console.log(a+"");
         c=a+b;
         a=b;
         b=c;
        
        
    }
   
    
   }
}
let b1=new Util();
console.log(b1.convertCF(20));

console.log(b1.getPIValue());
b1.getFibonacci(5);
console.log(b1.getDate());