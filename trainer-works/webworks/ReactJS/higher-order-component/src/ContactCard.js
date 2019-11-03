// imr 
// this will be a stateless component 

import React from 'react';

const ContactCard = ({ contact }) => (
    <div className="card" style={{width:"400px", height:"140px", padding:"10px", margin:"10px"}}>
        <div className="row">
            <div className="col-md-4">
                <img src={contact.picture} className="card-img" alt={contact.name}
                    style={{ width: 100, height: 100 }}/>
            </div>

            <div className="col-md-8">

                <div className="card-body">
                    <h4 className="card-title">{contact.name}</h4>
                    <div className="card-text">{contact.email}</div>
                    <div className="card-text">{contact.phone}</div>
                </div>
            </div>
        </div>

    </div>
);

export default ContactCard; 