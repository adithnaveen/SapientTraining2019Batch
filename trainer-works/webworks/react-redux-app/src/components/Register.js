import React, { Component, Fragment } from 'react';
import { connect } from 'react-redux';
import { registerNewUser } from '../redux/actions/userActions';

class Register extends Component {

    state = {
        name: '',
        email: '',
        phone: '',
        password: ''
    }

    changeHandler = ({ target }) => {
        this.setState({ [target.name]: target.value });
    }

    submitHandler = () => {
        this.props.registerNewUser({ ...this.state }); // thunk action
        this.props.history.push('/');
        // p1 = Object.assign({}, this.state);
    }

    render() {
        return (
            <Fragment>
                <div className="row">
                    <div className="col-sm-2"></div>
                    <div className="col-sm-8">
                        <h3>New users register here:</h3>

                        <div>
                            <div className="form-group">
                                <label htmlFor="name">Name</label>
                                <input type="text" className="form-control"
                                    onChange={this.changeHandler}
                                    value={this.state.name}
                                    id="name" name="name" autoFocus={true} />
                            </div>
                            <div className="form-group">
                                <label htmlFor="email">Email address</label>
                                <input type="email" className="form-control"
                                    onChange={this.changeHandler}
                                    value={this.state.email}
                                    id="email" name="email" />
                            </div>
                            <div className="form-group">
                                <label htmlFor="phone">Phone number</label>
                                <input type="tel" className="form-control"
                                    onChange={this.changeHandler}
                                    value={this.state.phone}
                                    id="phone" name="phone" />
                            </div>
                            <div className="form-group">
                                <label htmlFor="password">Password</label>
                                <input type="password" className="form-control"
                                    onChange={this.changeHandler}
                                    value={this.state.password}
                                    id="password" name="password" />
                            </div>

                            <button className="btn btn-primary"
                                onClick={this.submitHandler}>Submit</button>
                        </div>

                    </div>
                    <div className="col-sm-2"></div>
                </div>
            </Fragment>
        );
    }
}

export default connect(null, { registerNewUser })(Register);