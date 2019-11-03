/// to show event driver programming with nodejs 

// events is the implicit module available in nodejs 
const EventEmitter = require("events");
const eventEmitter = new EventEmitter();

// these are listeners 
eventEmitter.on("myjob", () => {
    console.log("Sample Event is invoked... ");
});

eventEmitter.on("maths", (num1, num2) => {
    console.log(num1 + num2);
})
eventEmitter.emit("myjob");
eventEmitter.emit('maths', 10,20); 

class Person extends EventEmitter {
    constructor(name, salary){
        super(); 
        this.__name = name; 
        this.__salary = salary; 
    }

    get name(){
        return this.__name; 
    }
    set name(name){
        this.__name = name; 
    }

    get salary(){
        return this.__salary; 
    }
    set salary(salary){
        this.__salary = salary; 
    }
}

let  person1 = new Person("Sourajit", 1212); 
let  person2 = new Person("Himanshu", 2233); 

person1.on("person", () => {
    console.log("Person Name :" + person1.__name);
    console.log("Person Salary " + person1.__salary);
})

person2.on("person", () => {
    console.log("Person Name :" + person2.__name);
    console.log("Person Salary " + person2.__salary);
})

person1.emit("person"); 
person2.emit("person"); 




