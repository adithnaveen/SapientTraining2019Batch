// perform CRUD operations with file 

const fs = require("fs");
const path = require("path");

const fileName = path.join(__dirname, "../data/data.json");

let data = [];
// this is needed when user is inserting the record 
const requiredFields = ["firstname", "email", "phone", "city"];

if (fs.existsSync(fileName)) {
    data = JSON.parse(fs.readFileSync(fileName, "UTF-8"));
}


class ContactService {
    constructor() { }

    // iterate with each element and check it the 
    // id is found then return 
    getContactById(id) {
        console.log("Get Contact By Id" + id);
    }


    /// splice
    deleteContactById(id) {
        console.log("Delete Contact By Id " + id);
    }

    // delete + add 
    updateContact(contact) {
        console.log("Update Contact " + contact);

    }
    addNewContact(contact, callBackFn) {


        if (!callBackFn || typeof callBackFn != 'function') {
            let err = {
                code: 1001, message:
                    "Sorry, please have callabck supplied"
            };
            callBackFn(err);
            return;
        }

        if (!contact || typeof contact != 'object') {
            let err = { code: 1002, message: "Sorry Please pass Object" };
            callBackFn(err);
            return;
        }

        // checking required fields 
        const missingfields = [];
        requiredFields.forEach(field => {
            if (!(field in contact)) {
                missingfields.push(field);
            }
        });

        if (missingfields.length) {
            let err =
            {
                code: 1003,
                message: "Please Pass Mandatory fileds Missing "
                    + missingfields.join(", ") + " fields "
            };
            callBackFn(err);
            return;
        }

        if (data.length === 0) {
            contact._id = 1;
        } else {
            contact._id = data.length + 1;
        }

        console.log("Generated Contact Id " + contact._id);

        // the array is appended with element contact 
        data.push(contact);

        // write the data to file 
        fs.writeFile(fileName, JSON.stringify(data), (err) => {
            if (err) {
                callBackFn(err);
                return;
            }

            // success 
            callBackFn(null, { ...contact });
        })









    }

    getAllContacts(options, callBackFn) {

        if (!callBackFn || typeof callBackFn !== 'function') {
            throw new "Sorry callback is not supplied, so not executed";
        }

        // if you are assigining with = then it will be 
        // default value 

        setTimeout(() => {
            let { pageNum = 1, pageSize = 10 } = options;

            if (typeof pageNum !== 'number' || typeof pageSize !== 'number') {
                let err = { code: 1003, message: "Please enter PageNum and Page Size as number" };
                callBackFn(err);
                return;
            }

            // since arrars start from '0'
            let begin = (pageNum - 1) * pageSize;
            let end = begin + pageSize;

            let newData = data.slice(begin, end);
            callBackFn(null, newData);

        }, 0);

    }

}

module.exports = new ContactService();