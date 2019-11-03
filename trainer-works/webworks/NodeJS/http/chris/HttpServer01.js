// showing hello world using http server 
const http = require("http");

const server = http.createServer((req, res) => {
    /*  res.write('Hello World from NodeJs'); 
     // to send the response 
     res.end();  */

     // if you are using root doming 
    if (req.url === '/') {
        res.write('Hello World from NodeJs');
        // to send the response 
        res.end();
    }else{
        res.write("using some other domain..."); 
        res.end(); 
    }


});

server.listen('3000'); 