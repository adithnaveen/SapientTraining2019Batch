import React from 'react';
// here instead of the class extends Component 
// use function 

import './AppFooter.css'
export default function AppFooter(props){
    return (
        <div>
            <p className="app-footer">This is my Footer</p>
            <p>Website : {props.website}</p>
            <p>Company : {props.company}</p>
            <p>Year :  {props.year} </p>
        </div>
    ); 
}