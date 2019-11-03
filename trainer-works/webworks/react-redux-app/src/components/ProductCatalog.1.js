import React, { Component } from 'react';
import ProductInfo from './ProductInfo';
import loadingHoc, { loading } from '../hoc/loading';
import sort from '../hoc/sort';
import { connect } from 'react-redux'; // connects react components with redux store
import axios from 'axios';
import { FETCH_PRODUCTS } from '../redux/actions/types';

class ProductCatalog extends Component {

    render() {
        console.log('ProductCatalog.render() called.')
        let list = null;
        if (this.props.products && this.props.products instanceof Array) {
            list = this.props.products.map(p => (
                <div className="col-sm-4" key={p.id}>
                    <ProductInfo product={p} />
                </div>
            ));
        }

        return (
            <div className="row">
                {list}
            </div>
        );
    }
}

// what is actually exported from here is not the 'ProductCatalog' component,
// but the return value of the loadingHoc(..) function

// export default loading('products')(ProductCatalog);
// export default sort('products', 'unit_price')(ProductCatalog);
// export default loading('products')(sort('products', 'name')(ProductCatalog))
// export default sort('products', 'unit_price')(loading('products')(ProductCatalog))

// this is a function that recieves the reducers from the store,
// and returns the required state from those reducers. The return value
// from this function will now be stored in the "props" of the class
// supplied to the connect HOC.
const stateAsProps = (reducers) => ({
    products: reducers.productsReducer.products // this.props.products
});

// this is a function that gets the 'dispatch' function from the store,
// so that we can perform a dispatch(action) from here. We can shift this
// logic to a more reusable 'thunk' actions.
const actionsAsProps = (dispatch) => {

    // this is invoked when the 'connect' is called
    // What if we want to have a refresh button?
    // check the Sidebar.js for an alternate solution
    axios.get('http://localhost:4000/products')
        .then(({ data }) => {
            dispatch({
                type: FETCH_PRODUCTS, // redux standard property 'type'
                products: data // payload
            });
        });
    return {};
};

export default connect(stateAsProps, actionsAsProps)(loading('products')(ProductCatalog));