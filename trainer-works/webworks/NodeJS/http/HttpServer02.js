const http = require("http");
const fs = require("fs"); 
/* 
http.createServer((req, res) => {
    const readStreamIndex = fs.createReadStream("./static/index.html"); 
    // its the responsibility of header to tell what kind of file 
    res.writeHead(200, {'content-type' :"text/html"}); 
    readStreamIndex.pipe(res); 
}).listen(3000);  */

http.createServer((req, res) => {
    const readStreamIndex = fs.createReadStream("./json/employee.json"); 
    res.writeHead(200, {'content-type' :"application/json"}); 
    readStreamIndex.pipe(res); 
}).listen(3000); 