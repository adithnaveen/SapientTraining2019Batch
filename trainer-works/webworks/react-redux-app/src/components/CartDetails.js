import React, { Component } from 'react';
import { connect } from 'react-redux';
import { placeOrder } from '../redux/actions/cartActions';

class CartDetails extends Component {

    componentDidMount() {
        let { lineItems, history } = this.props;
        if (!lineItems || lineItems.length === 0) {
            history.push('/products'); // programatically changes the route path
        }
    }
 
    render() {
        let list = null;
        let { lineItems } = this.props;
        let someStyle = { maxHeight: "30px" };

        if (lineItems && lineItems instanceof Array) {
            list = lineItems.map(({ product, quantity }, index) => (
                <tr key={product.id}>
                    <td>{index + 1}</td>
                    <td>
                        <img src={product.picture} style={someStyle} />
                        {product.description}</td>
                    <td>{product.unit_price}</td>
                    <td>{quantity}</td>
                    <td>{product.discount}%</td>
                    <td>{(product.unit_price * quantity) * (100 - product.discount) / 100}</td>
                </tr>
            ));
        }

        return (
            <div>
                <h3>Your cart contains...</h3>
                <table className="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th>Sl.no</th>
                            <th>Product description</th>
                            <th>Unit price</th>
                            <th>Quantity</th>
                            <th>Discount</th>
                            <th>Amount</th>
                        </tr>
                    </thead>
                    <tbody>
                        {list}
                    </tbody>
                </table>
                <button className="btn btn-success"
                    onClick={this.submitHandler}>Place order</button>
            </div>
        );
    }

    submitHandler = () => {
        let { loggedInUser, lineItems, placeOrder, history } = this.props;
        if (loggedInUser !== null) {
            placeOrder(lineItems, loggedInUser.token); // thunk action
            window.swal('My Basket', 'Order placed successfully', 'success')
            history.push('/');
        }
        else {
            history.push('/login');
        }
    }
}

const stateAsProps = (reducers) => ({
    lineItems: reducers.cartReducer.lineItems,
    loggedInUser: reducers.customerReducer.loggedInUser
});

const dispatchAsProps = { placeOrder };
export default connect(stateAsProps, dispatchAsProps)(CartDetails);