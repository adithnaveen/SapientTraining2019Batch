const {addNewEmp} = require("../services/mongo-emps-service"); 

const emp = {
    "firstname" :"Praneeth", 
    "email":"praneeth@ps.com", 
    "phone":"+90121290927", 
    "city" :"Begnaluru"
}; 

addNewEmp(emp)
    .then(id => console.log("Id Generated : " + id ))
    .catch(err => console.log(err)); 
    