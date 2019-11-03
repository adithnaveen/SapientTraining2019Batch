const {MongoClient} = require("mongodb"); 
const url ="mongodb://localhost"; 

const  getOneEmployee = async() =>  {
    const conn = await MongoClient.connect(url, {useNewUrlParser: true}); 
    const db = conn.db("sapientdb"); 
    const emps = db.collection("emps"); 
    const emp = await emps.findOne({}); 
    console.log(emp);
    conn.close(); 
}

getOneEmployee() 
    .then(() => console.log("Done!!!"))
    .catch(err => console.log(err)); 


console.log("I'm as log in  last line... ");
