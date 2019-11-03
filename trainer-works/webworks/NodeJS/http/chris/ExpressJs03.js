//npm install express 
const express = require("express"); 
const app = express(); 


// this is called routes 
app.get("/", (req, res) =>{
    res.send("Hello World"); 
}); 

app.get("/example", (req, res) =>{
    res.send("example Route called... ");
})

app.get("/example/:name/:age", (req, res) =>{
    // this is path params 
    console.log(req.params); 
    // http://localhost:3000/example/naveen/35?city=bengaluru&state=karunadu
    console.log(req.query); 
    console.log("With Query Param " +req.query.city);
    
    // you can have only 1 res.send, if you have twice it will give error 
    // res.send("Exmaple with route params... "); 
    //http://localhost:3000/naveen/35 
    res.send("Name : " + req.params.name +", Age: " + req.params.age)
}); 
app.listen(3000); 