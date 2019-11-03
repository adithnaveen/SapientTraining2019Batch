import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css'; 

import ContactCard from "./ContactCard";
class App  extends Component {
  state = {  }
  render() { 
    

    const contact = {
      "id":101, 
      "name" :"Naveen Kumar", 
      "email":"naveen@probits.in", 
      "phone" :"9900524255", 
      "picture" :"https://avatars2.githubusercontent.com/u/8098738?s=460&v=4"
    }; 

    const contacts =[
      {
        "id":101, 
        "name" :"Naveen Kumar", 
        "email":"naveen@probits.in", 
        "phone" :"9900524255", 
        "picture" :"https://avatars2.githubusercontent.com/u/8098738?s=460&v=4"
      }, 
      {
        "id":102, 
        "name" :"praneeth Kumar", 
        "email":"praneeth@probits.in", 
        "phone" :"909090909", 
        "picture" :"https://avatars2.githubusercontent.com/u/8098738?s=460&v=4"
      }, 
      {
        "id":103, 
        "name" :"Himanshu ", 
        "email":"Himanshu@probits.in", 
        "phone" :"7897897897", 
        "picture" :"https://avatars2.githubusercontent.com/u/8098738?s=460&v=4"
      }, 
      {
        "id":104, 
        "name" :"sourajit Kumar", 
        "email":"sourajit@probits.in", 
        "phone" :"1234561234", 
        "picture" :"https://avatars2.githubusercontent.com/u/8098738?s=460&v=4"
      }

    ]; 

    const contactCarsArray = contacts.map
      ( c => <ContactCard key={c.id} contact={c} />); 

      return (
        <div className="container">
          <h1 className="alert alert-info">Contacts With Arrays </h1>

          <ContactCard contact={contact} /> 
        
        <h1>Output from the map</h1>
        {contactCarsArray}
        </div>

      );


  }
}
 
export  default  App;