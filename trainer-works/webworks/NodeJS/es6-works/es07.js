let p1 = {
    name: "Anjani", 
    city : "Bengaluru", 
    email : "anjani@ps.com"
}; 

console.log(p1);

let name1 = p1.name; 
let city1  = p1.city; 
let email1 = p1.email; 

console.log(name1);
console.log(city1);
console.log(email1);

let {name, city, email} = p1; 


console.log(name);
console.log(city);
console.log(email);


let {__name, __city} = p1 ; 
console.log(__name);
console.log(__city);

function sayHello({name, city}){
    console.log("Function - Name " + name);
    console.log("Function - City " + city);
}


function sayHello1(name, city){
    console.log("Function - Name " + name);
    console.log("Function - City " + city);
}

sayHello1( "Chris", "Bengaluru"); 


sayHello({name : "Chris", city : "Bengaluru"}); 
sayHello(p1); 




