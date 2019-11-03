const {addNewContact}  = require("../services/file-contact-service"); 

const contact = {
    "firstname": "Himanshu",
    "lastname": "H",
    "gender": "Male",
    "email": "Himanshu@ps.com",
    "phone": "8185474903",
    "dob": "1977-01-25", 
    "city":" Bengaluru"
}; 

addNewContact(contact, (err, newContact) => {
    if(err){
        console.log("Error : " + JSON.stringify(err) );
    }else {
        console.log(newContact);
        
    }
})