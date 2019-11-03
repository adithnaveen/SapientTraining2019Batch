import React, { Component } from 'react';

import 'bootstrap/dist/css/bootstrap.css';

class EmployeeForm extends Component {
    state = {
        name: '',
        email: '',
        phone: '',
        picture: '',
        formError: {
            name: 'Name is required',
            email: 'Email is required',
            phone: 'Phone is required'
        }, 
        errorMessages : null 


    }

    validateForm = (formError) =>{
        let valid = true; 
        Object.values(formError).
            forEach(err => valid = (valid 
                    && err.length===0 )); 

        return valid; 
    }


    submitHandler = (event) => {
        
        // by this the default form submission shall be stopped... 
        event.preventDefault();

        let {formError} = this.state; 
        console.log(formError);
        
        if(this.validateForm(formError)){
            alert("Form Submitted... "); 
        }else {
            let errorMessages = Object.values(formError).
                map((err, index) => 
                  err.length ===0 ? null : <li key={index}>{err}</li>
            )
                this.setState({errorMessages}); 
        }
    }

    inputHandler = (evt) => {
        // console.log(evt.target);

        // console.log(evt.target.name);
        // console.log(evt.target.value);

        let { name, value } = evt.target;
        let { formError } = this.state;

        switch (name) {
            case 'name':
                if(!value ||  value.length===0){
                    formError.name="NAME IS REQUIRED!"
                } else if(value.length < 5 || value.length > 20){
                    formError.name="Sorry Name should be between 5 to 20 chars"; 
                }else{
                    formError.name =""; 
                }
                break;
            case 'email':
                if(!value | value.length===0){
                    formError.email = "Email is required"; 
                }else if(!value.match
                    (/^([\w]+)@([\w]+)[.]([\w]{2,})$/i)){
                    formError.email = "Sorry Invalid Email"; 
                }else {
                    formError.email =''; 
                }
                break;
            case 'phone':
                if(!value || value.lengh ===0){
                    formError.phone="Phone Number Required"; 
                }else if(!value.match(/\d{10,12}/)){
                    formError.phone="Invalid Phone Number";
                }else {
                    formError.phone = ''; 
                }
                break;
            default:
                break;
        }

        this.setState ({[name] :value, formError}); 
    }



    render() {
        return (

            <div className="row">
                <div className="col">
                    <h2>Add New Employee </h2>

                    <form className="form" onSubmit={this.submitHandler}>

                        <div className="form-group row">
                            <label className="control-label col-md-4">
                                Name :
                            </label>
                            <div className="col-md-8">
                                <input type="text"
                                    className="form-control"
                                    name="name"
                                    value={this.state.name}
                                    onChange={this.inputHandler} />
                            </div>
                        </div>

                        <div className="form-group row">
                            <label className="control-label col-md-4">
                                Email :
                            </label>
                            <div className="col-md-8">
                                <input type="text"
                                    className="form-control"
                                    name="email"
                                    value={this.state.email}
                                    onChange={this.inputHandler} />
                            </div>
                        </div>



                        <div className="form-group row">
                            <label className="control-label col-md-4">
                                Phone :
                            </label>
                            <div className="col-md-8">
                                <input type="text"
                                    className="form-control"
                                    name="phone"
                                    value={this.state.phone}
                                    onChange={this.inputHandler} />
                            </div>
                        </div>



                        <div className="form-group row">
                            <label className="control-label col-md-4">
                                Picture :
                            </label>
                            <div className="col-md-8">
                                <input type="text"
                                    className="form-control"
                                    name="picture"
                                    value={this.state.picture}
                                    onChange={this.inputHandler} />
                            </div>
                        </div>

                        <button className="btn btn-primary">Save</button>

                    </form>

                </div>

                <div className="col">
                    <h3>Current State</h3>
                    <pre>{JSON.stringify(this.state)}</pre>
                </div>
<hr /> 
                <ul>
                    {this.state.errorMessages}
                </ul>
            </div>


        );
    }
}

export default EmployeeForm;