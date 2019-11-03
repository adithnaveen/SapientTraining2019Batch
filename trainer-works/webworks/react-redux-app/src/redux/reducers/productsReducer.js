import { FETCH_PRODUCTS, FETCH_BRANDS, FETCH_CATEGORIES } from "../actions/types";

// whenever an action is 'dispatched' by a component
// Redux store will invoke this function (on all reducers),
// by supplying the current state associated with this reducer,
// along with the action itself. An action is an object that contains
// two properties: 1) type (describing what action to be done)
// 2) the payload (data) associated with action to be done.

// For example, { type: ADD_TO_CART, lineItem: { product: {...}, quantity: 2}}
// Another example, { type: REMOVE_FROM_CART, id: 22 }

const initialState = {
    products: [],
    categories: [],
    brands: []
}

// the reducer will recieve the current-state and the action-dispatched,
// and based on the action.type, the reducer is expected to return the
// modified state
export default (state = initialState, action = {}) => {
    console.log('from inside of productsReducer action is', action);
    switch (action.type) { // redux standrd property 'type' in an action
        case FETCH_PRODUCTS:
            return { ...state, products: action.products }
        case FETCH_BRANDS:
            return { ...state, brands: action.brands }
        case FETCH_CATEGORIES:
            return { ...state, categories: action.categories }
        default:
    }
    return { ...state };
}