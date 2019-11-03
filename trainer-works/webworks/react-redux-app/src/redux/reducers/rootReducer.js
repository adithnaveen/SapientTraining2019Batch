import { combineReducers } from 'redux';
import productsReducer from './productsReducer';
import cartReducer from './cartReducer';
import ordersReducer from './ordersReducer';
import customerReducer from './customerReducer';

// combine multiple reducers into one
export default combineReducers({
    productsReducer,
    cartReducer,
    ordersReducer,
    customerReducer
}); 