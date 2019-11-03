import React, { Component } from 'react';



function isEmpty(data) {
    if (data && data instanceof Array) {
        return data.length === 0;
    }

    if (data) {
        return Object.keys(data).length === 0;
    }

    return false;
}

// In the actual component (ProductCatalog for example,) use as below:
// export default loadingHoc('products')(ProductCatalog)

// carrier function that returns a HOC (which is a function that returns a componet)
export default function (prop) { // current example, prop="products"
    return function (OldComp) {
        return class NewComp extends Component {
            render() {
                return (
                    isEmpty(this.props[prop]) ?
                        <h1 style={{maxHeight: "100px"}} className="text-center"><img src="https://cdn.cssauthor.com/wp-content/uploads/2018/06/Animated-Loading-%C3%97-1.gif" /></h1> :
                        <OldComp {...this.props} />
                );
            }
        }
    }
}


// carrier as ES6 arrow function, that returns a HOC
export const loading = (prop) => (OldComp) => (props) => (
    isEmpty(props[prop]) ?
        <h1 className="text-center">
        <img src="https://cdn.cssauthor.com/wp-content/uploads/2018/06/Animated-Loading-%C3%97-1.gif" />
        </h1> :
        <OldComp {...props} />
);

// import { loading } from '../hoc/loading';
// export default loading('products')(ProductCatalog);
// export default loading(['orders'])(MyOrdersComponent);

// redux usage:
// export default connect(stateAsProps, actionsAsProps)(ProductCatalog)