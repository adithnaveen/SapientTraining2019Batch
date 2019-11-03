import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import ContactList from './ContactList';

class App1 extends Component {
    state = {
        contacts: []
    }


    componentDidMount() {
        // to hit to the rest point 
        // fetch, jQuery, axios 

        fetch("http://localhost:4000/contacts")
            .then(resp => resp.json())
            .then(data => this.setState({ contacts: data }))

    }


    render() {


        return (
            <div>
                <h1 className="alert alert-info">Using Fetch For Getting Data From End Point</h1>

                <p>Number of Contacts : {this.state.contacts.length}</p>

                <div class="row">
                    <div class="col">
                        <ContactList contacts={this.state.contacts} />
                    </div>
                    <div class="col"></div>
                </div>
            </div>

        );
    }
}

export default App1;
