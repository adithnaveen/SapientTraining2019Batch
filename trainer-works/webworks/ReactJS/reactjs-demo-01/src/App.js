// console.log("Hello To React Js"); 
import React, { Component } from 'react';


import AppHeader from './AppHeader';
import AppFooter from './AppFooter'
import AppComponent from './AppComponent';
import AppConent from './AppContent'; 

class App extends Component {
    render() {
        const message = "Hello World From ";
        const name = "Naveen Kumar";

        const footerProps = {
            website: 'http://ps.com', 
            company:"Publicis Sapient", 
            year : 2019 
        }
 
        return (
            <div className="App">
                <AppHeader
                     company="Sapient Technologies" 
                     createdBy="Naveen Kumar"  />
                <AppComponent />

                <AppConent />

               {/*  <div>
                    <h1>{message}, {name}</h1>
                    <h2>This is from ReactJS </h2>
                </div> */}
              {/*   <AppFooter 
                    website={footerProps.website} 
                    company={footerProps.company} 
                    year={footerProps.year}  />
 */}
                <AppFooter {...footerProps} /> 
            </div>
        );
    }
}

export default App; 