import React, { Component } from 'react';

import 'bootstrap/dist/css/bootstrap.css'; 
/*
// old style code 
    name  = document.regForm.name.value 
    email = document.regForm.email.value 
*/
class ContactForm extends Component {

    // onclick onSubmit 
    addNewContact = (event) => {
        console.log("Adding New Contact... ");

        const name = this.refs.name.value; 
        const email = this.refs.email.value; 
        const phone = this.refs.phone.value; 
        const picture = this.refs.picture.value; 
        
        const contact = {name, email, phone, picture}; 
        console.log(contact);

        this.refs.name.value = ""; 
        this.refs.email.value = ""; 
        this.refs.phone.value = ""; 
        this.refs.picture.value = ""; 

        // this will not submit the form 
        event.preventDefault(); 

    }

    
    render() {
        return (

        <div className="container">
            <h3>Add New Contact</h3>
            <h4>Uncontrolled form, data passed with refs </h4>
            {/* // http://somesite.com/contact  */}
            <form className="form" onSubmit={this.addNewContact}>

            <div className="form-group row">
                    <label className="control-label col-md-4">
                        Name :
                    </label>
                    <div className="col-md-8">
                        <input type="text" 
                            className="form-control" ref="name" />
                    </div>
                </div>

                <div className="form-group row">
                    <label className="control-label col-md-4">
                        Email Address  :
                    </label>
                    <div className="col-md-8">
                        <input type="text" 
                        className="form-control" ref="email" />
                    </div>
                </div>

                <div className="form-group row">
                    <label className="control-label col-md-4">
                        Phone Number :
                    </label>
                    <div className="col-md-8">
                        <input type="text"
                             className="form-control"
                             ref="phone" />
                    </div>
                </div>

                <div className="form-group row">
                    <label className="control-label col-md-4">
                        Picture :
                    </label>
                    <div className="col-md-8">
                        <input type="text" 
                            className="form-control"
                            ref="picture" />
                    </div>
                </div>

                    <button className="btn btn-danger">Save Data</button>

                </form>
            </div>


        );
    }
}

export default ContactForm;