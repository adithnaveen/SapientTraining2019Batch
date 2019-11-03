import React from 'react';

const ContactCard = ({ contact, deleteContact }) => {

    return (
        <div className="card" style={{ padding: '10px', margin: '10px' }}>
            <div className="row">
                <div className="col-md-4">
                    <img src={contact.picture} alt={contact.name}
                        className="card-img"
                        style={{ width: '100px', height: '100px' }} />
                </div>
                <div className="col-md-7">
                    <h5 className="card-title">{contact.name}
                    </h5>
                    <div className="card-text">{contact.email}</div>
                    <div className="card-text">{contact.phone}</div>

                </div>
                    <div className="col-md-1">
                        <button 
                            onClick={
                                ()=>{
                                    deleteContact(contact.id);
                                }
                            }
                            className="btn btn-link text-danger">x</button>
                    </div>
            </div>
        </div>
    );
}
export default ContactCard;