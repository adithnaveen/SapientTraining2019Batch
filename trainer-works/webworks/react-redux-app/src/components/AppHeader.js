import React, { PureComponent } from 'react';
import { Link } from 'react-router-dom';
import { connect } from 'react-redux';
import { logout } from '../redux/actions/userActions';

// PureComponent's lifecycle function called shouldComponentUpdate() 
// conditionally retuns false, making sure, that the render() happens
// only if there is any change in the state or props from the parent.
// Also, you cannot override this lifecycle method in the subclass.
class AppHeader extends PureComponent {

    render() {

        let output;
        let { loggedInUser } = this.props;
        if (!loggedInUser) {
            output = (<div className="form-inline">
                <Link to='/login'
                    className="btn btn-outline-success">Login</Link>

                <Link to='/register'
                    className="btn btn-outline-success">Register</Link>
            </div>);
        }
        else {
            output = (<div className="form-inline">
                Hello, {loggedInUser.name}
                <button className="btn btn-outline-danger"
                    onClick={() => {
                        this.props.logout();
                        this.props.history.push('/login');
                    }}>Logout</button>
            </div>);
        }

        return (
            <nav className="navbar navbar-default">
                <a href="#" className="navbar-brand">PMS-Store</a>
                {output}
            </nav>
        );
    }
}

const stateAsProps = (store) => ({
    loggedInUser: store.customerReducer.loggedInUser
});
export default connect(stateAsProps, { logout })(AppHeader);