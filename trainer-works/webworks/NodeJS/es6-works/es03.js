let names =["sandeep", "udit", "shashank", "anurag"];

// to get the first character 
let chars = names.map((value) => value.charAt(0)); 

console.log(chars); 




let indexPosition = 
    names.findIndex((value) => value ==='udit'); 

console.log("Value found @ " + indexPosition);
