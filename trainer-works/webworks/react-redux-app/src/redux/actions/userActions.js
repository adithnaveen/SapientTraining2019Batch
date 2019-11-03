import axios from 'axios';
import { REGISTER_USER, LOGIN_USER, LOGOUT } from './types';

const baseUrl = 'http://localhost:4000/';

export const registerNewUser = (user) => async (dispatch) => {
    let { data } = await axios.post(baseUrl + 'customers', user);
    dispatch({ type: REGISTER_USER, userInfo: data });
}

export const login = (loginDetails) => async (dispatch) => {
    let { data } = await axios.post(baseUrl + 'login', loginDetails);
    dispatch({ type: LOGIN_USER, userInfo: data });
}

export const logout = () => (dispatch) => {
    dispatch({ type: LOGOUT });
}