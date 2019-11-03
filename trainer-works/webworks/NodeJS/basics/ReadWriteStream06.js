const fs = require("fs"); 

// to read and write the files in the form of chunks 

const readStream = fs.createReadStream("./files/eclipse-inst-win64.exe", "UTF-8"); 
const writeStream = fs.createWriteStream("./files/newsample.txt", 'UTF-8'); 

// of this is it does not read the entire file in 1 go rather it 
// will be taken in chunks 

readStream.on("data", (chunk) => {
    console.log(chunk);
    writeStream.write(chunk); 
})