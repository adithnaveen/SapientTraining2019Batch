import React, { Component } from 'react';
import ContactCard from './ContactCard';

class ContactList extends Component {

    render() {
        let list = this.props.contacts.map(
            c => <ContactCard contact={c} key={c.id} deleteContact={this.props.deleteContact} />)
        return (
            <div>
                <h3>Contact list</h3>
                {list}
            </div>
        );
    }
}

export default ContactList;