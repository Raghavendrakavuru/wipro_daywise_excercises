function pair<T,U>(first:T,second:U):[T,U]{
    
    return [first,second];
}

let output1= pair<number,string>(3,"string");
console.log(output1);
let output2= pair<boolean,number>(true,65.43);
console.log(output2);