import { ADD_TO_CART, PLACE_ORDER } from "../actions/types";

const initialState = {
    lineItems: [
    ] // lineItem = product + quantity
};

export default (state = initialState, action = {}) => {

    switch (action.type) {
        case PLACE_ORDER:
            return { ...state, lineItems: [] };
        case ADD_TO_CART:
            let tmp = [...state.lineItems];
            let id = action.lineItem.product.id;
            let index = tmp.findIndex(item => item.product.id === id);
            if (index >= 0) {
                tmp[index].quantity++;
            }
            else {
                tmp.push(action.lineItem);
            }
            return { ...state, lineItems: tmp };

    }

    return { ...state }
};