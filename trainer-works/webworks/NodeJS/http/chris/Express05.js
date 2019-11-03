// to do a post request with express js 

const express = require("express"); 
const path = require("path"); 
const app = express(); 

// we need new module here called body parser 
// npm install body-parser
const bodyParser=require("body-parser") ; 

// we use middle ware 
// it allows us to parse the form
// we dont complecated stuffs like images etc 
app.use(bodyParser.urlencoded({extended:false})); 

app.get("/", (req, res) =>{
    // c:\yourfolder\static\html\postform.html
    res.sendFile(path.join(__dirname, 'static', 'html', 'postform.html'));
}); 

app.post("/", (req, res) =>{
    console.log(req.body);
    // db work goes here 

    res.send("successfully posted... "); 
}); 

app.listen(3000); 