class Person {
   
    // you can have only one constructor 
/*     constructor(){
        this.name = "Naveen"; 
        this.email = "naveen@probits.in"; 
    }
 */    constructor(_name, _email){
        this.name = _name; 
        this.email = _email; 
    }

    printPerson(){
        console.log("Name " + this.name);
        console.log("Email " + this.email);
    }
}



let p1 = new Person(); 
console.log(p1);
console.log(typeof(p1));


let p2 = new Person("Naveen", "adith.naveen@gmail.com"); 
console.log(p2);

let p3 = new Person("Kumar"); 
console.log(p3);



console.log(typeof("hello"));
console.log(typeof(123));


