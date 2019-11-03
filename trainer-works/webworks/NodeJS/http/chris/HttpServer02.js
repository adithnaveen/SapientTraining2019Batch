const http = require("http");
const fs = require("fs"); 

// version 1 

/* http.createServer((req, res) =>{
    const readStream = fs.createReadStream("./static/index.html"); 

    // header's responsiblilty to to tell what kind of res will go 
    res.writeHead(200, {'content-type' : 'text/html'}); 
    readStream.pipe(res); 

}).listen(3000); 
 */

 // to send the json file data to user which can be viewed in browser 
http.createServer((req, res) =>{
    const readStream = fs.createReadStream("./static/example.json"); 

    // header's responsiblilty to to tell what kind of res will go 
    res.writeHead(200, {'content-type' : 'application/json'}); 
    readStream.pipe(res); 

}).listen(3000); 