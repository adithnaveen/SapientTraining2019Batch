import React, { Component } from 'react';
import { connect } from 'react-redux';
import { addToCart } from '../redux/actions/cartActions';

// stateless component, since the component has
// only a render function
const ProductInfo = ({ product, addToCart }) => (
    <div className="card" style={{ minHeight: '400px' }}>
        <img src={product.picture} alt={product.name} className="card-img-top" />
        <div className="card-body">
            <h5>{product.name}</h5>
            <p>{product.description}</p>
            <p>Rs.{product.unit_price}</p>
            <button className="btn btn-primary btn-block" onClick={
                () => { addToCart(product); }
            }>Add to cart</button>
        </div>
    </div>
);

export default connect(null, { addToCart })(ProductInfo);