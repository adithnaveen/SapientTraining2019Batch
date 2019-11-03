import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';
import ContactForm from './ContactForm';
import ContactList from './ContactList';


class App extends Component {
    state = {
        contacts: [
            {
                "id": 1,
                "name": "Alysia D'Hooge",
                "gender": "Female",
                "email": "adhooge0@wikipedia.org",
                "phone": "1571022046",
                "picture": "http://kvinod.com/old_ci/randomdata/images/women/1.jpg"
            },
            {
                "id": 2,
                "name": "Ruby Tothe",
                "gender": "Male",
                "email": "rtothe1@usa.gov",
                "phone": "1983800201",
                "picture": "http://kvinod.com/old_ci/randomdata/images/men/2.jpg"
            },
            {
                "id": 3,
                "name": "Reinald Tace",
                "gender": "Male",
                "email": "rtace2@stanford.edu",
                "phone": "7704172788",
                "picture": "http://kvinod.com/old_ci/randomdata/images/men/3.jpg"
            },
            {
                "id": 4,
                "name": "Phoebe Kingsnod",
                "gender": "Female",
                "email": "pkingsnod3@yellowbook.com",
                "phone": "8137639930",
                "picture": "http://kvinod.com/old_ci/randomdata/images/women/4.jpg"
            }
        ]
    }

    addContact = (contact) => {
        let {contacts} = this.state;
        contacts.unshift(contact);
        this.setState({contacts});
    }

    deleteContact = (id) => {
        let {contacts} = this.state;
        let index = contacts.findIndex( c => c.id===id);
        if(index !== -1) {
            contacts.splice(index, 1);
            this.setState({contacts});
        }
    }

    render() {
        return (
            <div className="container">
                <h1 className="alert alert-info">Addressbook app - v1.0</h1>
                <div className="row">
                    <div className="col-md-5">
                        <ContactForm addContact={this.addContact} />
                    </div>
                    <div className="col-md-7">
                        <ContactList deleteContact={this.deleteContact} contacts={this.state.contacts} />
                    </div>
                </div>
            </div>
        );
    }
}

export default App; 