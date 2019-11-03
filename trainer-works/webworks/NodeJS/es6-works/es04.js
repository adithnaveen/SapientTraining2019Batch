let nums = [10, 20, 30, 40, 50]; 

console.log(nums);
// .. is spread operator, which is basically used 
// to append the value 
let anotherNums = [100, 200, ... nums]; 

console.log(anotherNums);
// both num2 and nums are pointing to 
// same location(Memory)
let num2 = nums; 
console.log("checking num2 and nums5 " + (num2===nums));

num2.push(999); 

console.log(num2);
console.log(nums);


let p1 = {name: "Harish", email :"harish@ps.com"}; 
console.log(p1);

let p2 = {city: "Bengaluru", ...p1, country : "India"}; 
console.log(p1);
console.log(p2);

// this will not refer to same object rahter, to a 
// seperate copy. 
let p3 =  {... p1};
console.log(p3);

console.log(p1 === p3);

let  xx1 = "10"; 
let  xx2 = "10";  
console.log(xx1 === xx2);

 








