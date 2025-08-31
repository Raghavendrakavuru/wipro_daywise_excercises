class Box<T>
{
  value:T;

constructor(value:T){
    this.value=value;
    }
   getValue():T {
    return this.value;
      } 
}
const b1=new Box(33);
const b2=new Box("Raghavendra");
console.log(b1);
console.log(b2);