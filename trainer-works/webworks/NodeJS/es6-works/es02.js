// to show working of tags function s

function myTag(string, p1, p2){
    console.log("Strings " + string);
    console.log(p1, p2);
    console.log(arguments);   
    return "Sample Output"; 
}

let name="Himanshu"; 
let age = 24; 

let s1 = myTag `${name} is ${age} years old`
console.log(s1);

function myTag1(string, ... args){
    console.log(string);
    console.log(args);

    for(temp of args){
        console.log(temp);
        
    }
}

myTag1 `${name} is ${age} years old`
myTag("hello", name, age); 



