import './index.css';
import 'bootstrap/dist/css/bootstrap.css';


import { createStore } from 'redux';

// reducer is a function, which takes current state from the store 
// since we dont have the store we set to initialState, which is the 
// default value, action is what is been dispatch with UI 

const initialState = ['Naveen', 'Vinod'];

const reducer = (state = initialState, action) => {
  console.log(action.type);
  switch(action.type){
    
    // once after this is  done goto browser in console 
    // 1. store.getState();
    // 2. action1={type:'ADD_NAME', data:'Kanchan'}
    // 3. store.dispatch(action1); 
    // 4.  store.getState(); -> would update the store 
    case 'ADD_NAME' :
      console.log("Data got for storing " + action.data);
      
      return [...state, action.data]; 
    
    // once after this is  done goto browser in console 
    // 1.store.getState() 
    // 2. action2 ={type:'DELETE_NAME', data:1}
    // 3.  store.dispatch(action1); 
    // 4.  store.getState(); -> would update the store 
    case 'DELETE_NAME' :
      let names = [...state]; 
      names.splice(action.data, 1); 
      return names; 
    default: 
      return state; 
  }
  
}
const store = createStore(reducer);
// store is the local variable here, this has to be put in global scope 
// for this with put it in browsers window. 
window['store'] = store;


const submitHandler = (evt) => {
  // dont have to submit the form 
  evt.preventDefault(); 
  const name  =document.getElementById("name").value ; 
  const action = {type:'ADD_NAME', data : name}; 
  store.dispatch(action); 
  document.getElementById("name").value =''; 
  document.getElementById("name").focus(); 
}

document.getElementById('frmName').onsubmit = submitHandler; 


const updateList = () => {
  let names = store.getState(); 
  let list = names.map((name, index) => 
    '<li class="list-group-item">'
      + '<button class="btn btn-danger" onclick="deleteName('+
        index 
      +')" > &times;</button>'
    +name+'</li>'); 

  let listItems = list.join(''); 
  document.getElementById('namesList').innerHTML = listItems; 
    
}

updateList(); 
store.subscribe(updateList); 



window['deleteName'] = (index) => {
  const action = {type:'DELETE_NAME', data: index}; 
  store.dispatch(action); 
}