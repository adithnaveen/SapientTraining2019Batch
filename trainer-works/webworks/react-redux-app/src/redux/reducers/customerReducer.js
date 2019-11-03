import { REGISTER_USER, LOGIN_USER, LOGOUT } from "../actions/types";

const initialState = {
    loggedInUser: null
};
export default (state = initialState, action = {}) => {

    switch (action.type) {
        case REGISTER_USER:
        case LOGIN_USER:
            return { ...state, loggedInUser: action.userInfo };
        case LOGOUT:
            return { ...state, loggedInUser: null }
        default:
    }
    return { ...state }
};