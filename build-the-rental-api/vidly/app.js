console.log('before');
let result=sayHello();
console.log(result);
console.log('after');

function sayHello()
{
    setTimeout(()=>{
        console.log('hello');
    },2000);
    return;
}