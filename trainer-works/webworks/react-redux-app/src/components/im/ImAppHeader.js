import React, { PureComponent } from 'react';
import { Link } from 'react-router-dom';
import { connect } from 'react-redux';
import { logout } from '../redux/actions/userActions';

// PureComponent's lifecycle function called shouldComponentUpdate() 
// conditionally retuns false, making sure, that the render() happens
// only if there is any change in the state or props from the parent.
// Also, you cannot override this lifecycle method in the subclass.
class ImAppHeader extends PureComponent {

    render() {

        return (
            <div className="container">
                <nav className="navbar navbar-default">
                    <a href="#" className="navbar-brand">IM-PMS-Store</a>
                </nav>
                <h1>IM Login Goes here </h1>
            </div>
        );
    }
}

export default (ImAppHeader);