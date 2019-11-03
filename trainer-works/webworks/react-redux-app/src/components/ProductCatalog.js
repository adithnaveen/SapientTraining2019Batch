import React, { Component } from 'react';
import ProductInfo from './ProductInfo';
import { connect } from 'react-redux'; // connects react components with redux store
import { fetchProducts } from '../redux/actions/productActions';

class ProductCatalog extends Component {
    render() {
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

    componentDidMount() {
        let { key, value } = this.props.match.params;
        this.props.fetchProducts(key, value); // trigger to thunk action
    }
}

const stateAsProps = (store) => ({
    products: store.productsReducer.products // this.props.products
});

const actionsAsProps = { fetchProducts };

export default connect(stateAsProps, actionsAsProps)(ProductCatalog);