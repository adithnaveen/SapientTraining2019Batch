
// version 1.0 stateful way 
/*

import React, { Component } from 'react';
function loading (OldComponent ){
    // the new component return can be statefull or stateless 
    // this is statefull as it is extending from Component class 
    
    return class NewComponent extends Component{

        render (){

            let output = <OldComponent {... this.props} />

            if(this.props.contacts.length ===0){
                output =<p className="text-center">Loading... Please wait</p>
            }
            return output; 
        }
    }
}

export default loading; 
*/ 




// version 2.0 (stateless way )


import React from 'react';

// so far we are checking if lenght is 0, what if the object i is 
// null or not supplied 

function isEmpty(data){
    if(data && data instanceof Array){
        return data.length ===0; 
    }

    // if data is been defined and its not an array 
    if(data){
        return Object.keys(data).length ===0;
    }
    return false; 
}

// version 2.0 
/* 
const loading = (OldComponent) =>   (props) =>{
        let output = <OldComponent {... props} />

        if(isEmpty(props.contacts)){
            output =<p className="text-center">Loading... Please wait</p>
        }
        return output; 
}; 
 
 */
// versopm 3.0 
// this is used for carrier function (look in the file ContactList.js )
// in the end 

const loading = (property) =>  (OldComponent) =>   (props) =>{
    let output = <OldComponent {... props} />

    if(isEmpty(props[property])){
        output =<p className="text-center">Loading... Please wait</p>
    } 
    return output; 
}; 


export default loading; 