const fs = require("fs"); 
const zlib = require("zlib"); 

const gzip = zlib.createGzip(); 


const readStream = fs.createReadStream("./files/employees.txt"); 
const writeStream = fs.createWriteStream("./files/nemplolyees.txt.gz") ;

readStream.pipe(gzip).pipe( writeStream); 


