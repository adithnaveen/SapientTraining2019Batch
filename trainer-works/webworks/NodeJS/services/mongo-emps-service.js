// perform CRUD operations with MongoDB 
// ./service/mongo-emps-service.js 


const {MongoClient, ObjectId} = require('mongodb');
const url ="mongodb://localhost"; 

const  requiredFields = ['firstname', 'email', 'phone', 'city']; 

module.exports.getEmployeeById = async (id) =>{
    if(!id || typeof id !=='string'){
        throw "Sorry Id supplied is not a string"
    }

    try{
        const _id = ObjectId(id); 
        const conn  = await MongoClient.connect(url, {useNewUrlParser : true}); 
        const emps = conn.db("sapientdb").collection("emps"); 
        const emp = await emps.findOne({_id}); 
        conn.close; 
        return emp; 
    }catch(err){
        throw err; 
    }
}

module.exports.addNewEmp = async(emp) =>{
    // need to check if its object 
    // check the missing fields 

    const conn  = await MongoClient.connect(url, {useNewUrlParser : true}); 
    const emps = conn.db("sapientdb").collection("emps"); 
    const response = await emps.insertOne(emp); 
    conn.close; 
    emp._id = response.insertedId; 
    return emp; 

} 

module.exports.updateEmployee = async (emp) =>{}
module.exports.deleteEmployee = async(id) => {}
// sort by city, desc 
module.exports.getAllRecords = async(options={}) => {}