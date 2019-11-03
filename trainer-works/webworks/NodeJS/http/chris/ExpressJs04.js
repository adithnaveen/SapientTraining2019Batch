// create the folder structure appropriately. 
// and in index.html not it is absolute path / and 
// in the index html it is written as public but in 
// reality the folder is called static 

const express = require('express')
const path = require('path')
const app = express(); 

// this will be alias for static folder  
app.use("/public", express.static(path.join(__dirname, 'static'))); 

app.get("/", (req, res) =>{
    res.sendFile(path.join(__dirname, 'static', 'html', 'index.html'));
})

app.listen(3000); 