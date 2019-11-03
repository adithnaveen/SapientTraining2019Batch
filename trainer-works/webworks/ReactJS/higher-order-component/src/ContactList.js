import React from 'react';
import ContactCard from './ContactCard';
import loading from './loading';

let ContactList = ({contacts}) => {
    let list = contacts.map(c => <ContactCard contact={c} key ={c.id} />); 

    return <div>
        {list}
    </div>

}; 

// version 1
// export default ContactList; 

// version 2
// this is the HOC 
// export default loading(ContactList); 
// version 3.0 
// this is called carrier function 

export default loading('contacts')(ContactList); 
// example 
// const fun1 = (param1 ) => (param2) => ret_val; 
// the way it is called.. 


// loading("asd")("jkl")("pqr")

