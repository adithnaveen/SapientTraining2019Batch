import React, { Component, Fragment } from 'react';
import { login } from '../redux/actions/userActions';
import { connect } from 'react-redux';

class Login extends Component {

    state = {
        email: '',
        password: ''
    }

    changeHandler = ({ target }) => {
        this.setState({ [target.name]: target.value });
    }

    submitHandler = () => {
        this.props.login({ ...this.state }); // thunk action
        this.props.history.push('/');
    }

    render() {
        return (
            <Fragment>
                <div className="row">
                    <div className="col-sm-2"></div>
                    <div className="col-sm-8">
                        <h3>Existing users login here:</h3>

                        <div>
                            <div className="form-group">
                                <label htmlFor="email">Email address</label>
                                <input type="email" className="form-control"
                                    onChange={this.changeHandler}
                                    value={this.state.email}
                                    id="email" name="email" />
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

export default connect(null, { login })(Login);