// imr 
// this will be a stateless component 

import React from 'react';
import loading from './loading';

const ProductCard = ({ product }) => (
    <div className="card" style={{ width: "400px", height: "140px", padding: "10px", margin: "10px" }}>
        <div className="row">
            <div className="col-md-4">
                <img src={product.picture} className="card-img" alt={product.name}
                    style={{ width: 100, height: 100 }} />
            </div>

            <div className="col-md-8">

                <div className="card-body">
                    <h4 className="card-title">{product.name}</h4>
                    <div className="card-text">{product.quantity}</div>
                    <div className="card-text">{product.price}</div>
                </div>
            </div>
        </div>

    </div>
)

const  ProductList = ({ products }) => {
    let list = products.map(p => <ProductCard product={p} key={p.id} />);
    return (
        <div>
            {list}
        </div>
    );
}
export default loading('products')(ProductList); 