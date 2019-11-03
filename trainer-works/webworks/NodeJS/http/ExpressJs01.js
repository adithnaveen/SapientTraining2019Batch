// npm install exress 
const express = require("express"); 

const app = express(); 

app.get("/", (req, res) => {
    res.send("Hello World, from express "); 
})

app.get("/example", (req, res) => {
    res.send("Example Route Called... ")
})

// to show path param 
app.get("/example/:name/:age", (req, res) =>{
    // http://localhost:3000/example/naveen/29
    console.log("---------------------------------");
    console.log("Name :" + req.params.name);
    console.log("Age :" + req.params.age);

    console.log(req.query);
    // to invoke query params 
    //  http://localhost:3000/example/naveen/29?city=bengaluru&state=karanataka
    console.log("City :" + req.query.city);
    console.log("State :" + req.query.state);
    

    
    
})

app.listen(3000); 