const http = require("http");

const server = http.createServer((req, res) => {

    /*     res.write("Hello World from NodeJS"); 
    res.end(); 
    */

    // if you are using root domin 
    if (req.url === "/") {
        res.write("Hello World from NodeJS");
        res.end();
    } else {
        res.write("You are looking for sub domain data ");
        res.end();
    }
})

server.listen(3000); 