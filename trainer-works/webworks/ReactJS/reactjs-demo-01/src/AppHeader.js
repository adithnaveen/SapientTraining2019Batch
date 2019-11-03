import React, { Component, Fragment } from 'react';

class AppHeader extends Component {

    
    render() { 
        console.log(this);
        console.log("-----------------------");
        console.log(this.props);
        
        
        // keep our data in <div> and retun 
        // or in reactjs we have fragment 
        return ( 

            <Fragment>
                <h1>This is our Header In {this.props.company}</h1>
                <h1>Header Created By  {this.props.createdBy}</h1>

                <hr /> 
            </Fragment>

         );
    }
}
 
export default AppHeader;