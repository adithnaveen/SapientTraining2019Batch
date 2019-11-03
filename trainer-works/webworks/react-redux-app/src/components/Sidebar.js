import React, { PureComponent } from 'react';
import { connect } from 'react-redux';
import axios from 'axios';
import { FETCH_CATEGORIES, FETCH_BRANDS } from '../redux/actions/types';
import loading from '../hoc/loading';
import { fetchBrands, fetchCategories, fetchProducts } from '../redux/actions/productActions';
import CartInfo from './CartInfo';
import { Link } from 'react-router-dom';

let SubPanel = ({ data, path, fetchProducts }) => (
    <ul className="list-group">
        {
            data.map((d, i) =>
                <li className="list-group-item" key={i}
                    onClick={() => { fetchProducts(path, d) }}>
                    <Link to={'/products/' + path + '/' + d}
                    >{d}</Link>
                </li>)
        }
    </ul>
);
SubPanel = connect(null, { fetchProducts })(loading('data')(SubPanel));

let Panel = ({ title, data, path, fetchProducts }) => (
    <div>
        <h3 className="text-center lead">{title}</h3>
        <SubPanel path={path} data={data} />
    </div>
);

class Sidebar extends PureComponent {
    render() {
        console.log('this.props.fetchProducts is', this.props.fetchProducts)
        return (
            <div>
                <Panel title="Categories" path="category" data={this.props.categories} />
                <Panel title="Brands" path="brand" data={this.props.brands} />
                <br />
                <p className="text-center lead">
                    <Link to="/" >All products</Link>
                </p>
                <CartInfo />
            </div>
        );
    }

    componentDidMount() {
        // these props are added to this component by the "connect" HOC
        this.props.fetchBrands();
        this.props.fetchCategories();
    }
}

const stateAsProps = (store) => ({
    categories: store.productsReducer.categories,
    brands: store.productsReducer.brands,
});

// the connect() registers "fetchCategories" and "fetchBrands" as 
// two functions in the "props" of the Component supplied
// const dispatchAsProps = (dispatch) => ({
//     fetchCategories: () => {
//         axios.get('http://localhost:4000/categories')
//             .then(resp => dispatch({ type: FETCH_CATEGORIES, categories: resp.data }));
//     },
//     fetchBrands: () => {
//         axios.get('http://localhost:4000/brands')
//             .then(({ data }) => dispatch({ type: FETCH_BRANDS, brands: data }));
//     }
// });

// this is an object with thunk actions, invoked by thunk middleware
const dispatchAsProps = { fetchBrands, fetchCategories, fetchProducts };
export default connect(stateAsProps, dispatchAsProps)(Sidebar);