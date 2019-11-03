// to create a file and keep the data, for exception 
// show the message 

const fs = require("fs"); 

fs.writeFile("./files/sample.txt", "This is sample Data ",(err) => {
    if(err){
        console.log("File not saved ", err);
    } else {
        console.log("Data Stored Successfully... ");
        // can we write the code to see the contents of the file ???? 

        fs.readFile("./files/sample.txt", "UTF-8",  (err, data) => {
            if(err){
                console.log(err);
                
            }else{
                console.log(data);
            }
        })
    }
})