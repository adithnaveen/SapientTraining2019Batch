const {getAllContacts}  = require('../services/file-contact-service'); 

let options = {pageNum : 2, pageSize : 4 }; 

getAllContacts(options, (err, data) => {
    if(err){
        console.log(err);
    }else{
        console.log(data);
    }
})