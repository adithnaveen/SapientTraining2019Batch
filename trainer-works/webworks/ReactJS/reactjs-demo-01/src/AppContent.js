import React, { Component } from 'react';

class AppContent extends Component {

    // this is a function 
    btnHandler = () => {
        console.log("Button clicked " + this);
    }

    newHandler = () => {
        console.log("new Handler");
        
    }
    constructor(){
        super(); 
        console.log("Consutructor Called");
        this.btnHandler = this.btnHandler.bind(this); 
        this.newHandler = this.newHandler.bind(this); 
    }
    render() { 
        return (
            <div>
                <h3>This is a content Area </h3>
                <button onClick={this.btnHandler}> Button 1</button>
                <button onClick={this.newHandler}> Button 2</button>
            </div>
          );
    }
}
 
export default AppContent;