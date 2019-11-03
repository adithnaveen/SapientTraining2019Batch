// src/middlewares/logAction.js

// A middleware function, when configured with a redux store,
// gets called by Redux, which supplies a reference to the store
export function logAction(store) {
    return function (dispatch) {
        return function (action) {
            dispatch(action);
        }
    }
}

export default (store) => (dispatch) => (action) => {
    console.log('>>>> Inside the logAction middleware, store is', store, ', dispatch is', dispatch, ' and action is', action)
    dispatch(action);
}