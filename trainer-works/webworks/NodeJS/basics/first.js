const sum = (num1, num2) =>  num1 + num2; 
const PI =3.14; 

class MyBusinessLogic {
    constructor(name){
        console.log("Object Created... ");
        this.name = name; 
    }
} 

// version 1 
// module.exports.sum = sum ; 
// module.exports.PI = PI ; 
// module.exports.MyBusinessLogic = MyBusinessLogic; 

// version 2
// module.exports = {sum: sum, PI:PI, MyBusinessLogic: MyBusinessLogic}; 

// version 3 (ES6)
module.exports = {sum , PI , MyBusinessLogic }; 
