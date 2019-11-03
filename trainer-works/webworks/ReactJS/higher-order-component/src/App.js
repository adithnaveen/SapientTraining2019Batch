import React, { Component } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import ContactList from './ContactList';
import ProductList from './ProductCard'

// this program is to show the working of higher order component (HOC)
// here the rest point is invoked with 1500 ms delay 
// and the idea behind HOC is to create the proxy object and 
// give it to the invoker 

// or HOC takes a old component and returns a new component 


class App extends Component {

  state = {
    contacts: [],
    products: []
  }

  // version 1 (this is the old styel)
  /*  componentDidMount(){
      fetch("http://localhost:4000/contacts")
     .then(resp => resp.json())
     .then(data => this.setState({contacts: data})); 
   }
  */


  // since you have used the  call await you have to have the function 
  // marked as async 
  async componentDidMount() {

    // new style 
    // now we can ask javascript to await he promised to be resolved. 
    // resp is no longer a promise instead its a resolved value of promise 
    let resp = await fetch("http://localhost:4000/contacts");
    let contacts = await resp.json();

    this.setState({ contacts });

    // here you have put the contacts to products, 
    // assignment they have to create the a json data file for produts 
    // and for the same products have to be assigned. 
    this.setState({products : contacts}) ; 

  }

  render() {



    return (
      <div className="container">
        <h1 className="alert alert-warn">Higher Order Component Example</h1>
        <hr />

        <div className="row">
          <div className="col">
            <ContactList contacts={this.state.contacts} />
          </div>
         {  <div className="col">

            <ProductList products={this.state.products} />
          </div> }
        </div>


      </div>
    );
  }
}

export default App;
