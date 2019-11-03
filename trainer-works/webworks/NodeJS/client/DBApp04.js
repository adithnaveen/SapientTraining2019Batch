const {getEmployeeById} = require('../services/mongo-emps-service'); 

const id  ="5d51999826eaf744d0535d9d" ; 

getEmployeeById(id)
    .then(data => console.log(data))
    .catch(err => console.log(err)); 
    