
let sum=0;
function sumNumbers(...args){
    for(let i=0;i<args.length;i++){
        sum=sum+args[i];
    }
return sum;
}
 console.log(sumNumbers(1,2,3,4));