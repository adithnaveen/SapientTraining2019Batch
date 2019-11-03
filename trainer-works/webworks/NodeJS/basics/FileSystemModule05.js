// 1. rename the file to newsample.txt 
// 2. now lets append 
// 3. delete the file 
// 4. Delete the folder "files"



// removing the directory from the file 
const fs = require("fs");




// code which deletes all the files and removes the directory 
// at last 
fs.readdir("files", (err, files)=>{

    if(err){
        console.log(err);
        
    }else{
        for(let file of files){
            fs.unlink("./files/"+file, (err) => {
                if(err){
                    console.log(err);
                } else{
                    console.log("Files deleted successfully... ");
                    }
            } )
        }

        fs.rmdir("./files", (err) => console.log(err))
        
    }

})