/* 
let h1 = document.createElement("h1"); 
h1.setAttribute("id", "heading"); 
h1.innerHTML = "Testing  DOM with Java Script"; 
document.getElementById("root").append(h1); 


let count = 1; 
setInterval(() => {
    
    let h1 = document.getElementById("heading"); 
    h1.innerHTML = "Testing  DOM with Java Script"; 
    console.log("Updating H1 " + (count ++) +" times ");
    
}, 1000);
 */


import React, { Component } from 'react';
import ReactDOM from 'react-dom'; 

const MyHeading = (props) => (
    <h3>My Custom Heading Goes here </h3>
);

class App extends Component {
    state = {
        title: "Hello World!!!"
    }
    count = 1;

    componentDidMount(){
        setInterval(() => {
            let {title} = this.state; 

            if(this.count %5 ==0){
                if(title=="Hello World!!!"){
                    title = "React JS Virtual DOM"
                }else {
                    title = "Hello World!!!"
                }
            }

            this.setState({title}, () => console.log("Update " + (this.count ++ ) + "times")); 
        }, 1000);
    }


    render() {
        return (
            <div>
                <h1>{this.state.title} </h1>
            </div>
        );
    }
}

ReactDOM.render(<App />, document.getElementById("root")); 