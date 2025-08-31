let arr1=[1,2,3,4,5];
let sum=0;

 const summation=(arr1)=>{

    for(let i = 0; i < arr1.length;i++){
      sum=sum+arr1[i];
    
    }
   return sum;
}

console.log(summation(arr1));
