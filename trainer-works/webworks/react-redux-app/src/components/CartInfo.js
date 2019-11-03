import React, { Component } from 'react';
import { connect } from 'react-redux';
import { Link } from 'react-router-dom';

class CartInfo extends Component {

    render() {

        let output = 'Your cart is empty!';
        let { lineItems } = this.props;
        if (lineItems && lineItems instanceof Array && lineItems.length > 0) {
            output = (
                <Link to="/view-cart">
                    <button className="btn btn-success">
                        {lineItems.length} &nbsp;
                        {lineItems.length === 1 ? 'item' : 'items'} &nbsp;
                        in your cart.
                    </button>
                </Link>
            );
        }

        return (
            <div className="text-center lead">
                {output}
            </div>
        );
    }
}

const stateAsProps = (reducers) => ({
    lineItems: reducers.cartReducer.lineItems
});
export default connect(stateAsProps)(CartInfo);