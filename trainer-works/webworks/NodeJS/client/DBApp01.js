const {MongoClient} = require("mongodb"); 
const url ='mongodb://localhost:27017'; 

MongoClient.connect(url, {useNewUrlParser: true})
    .then(conn => conn.db('sapientdb'))
    .then(db => db.collection('emps'))
    .then(emps => emps.findOne())
    .then(emp => console.log(emp))
    .then(err => console.log(err));
    
