const readline = require('readline'); 

const rl =
     readline.createInterface
        ({input:process.stdin, output:process.stdout}); 

// we want getnerate 2 random numbers 
 
let num1 = Math.round((Math.random() * 20)); 
let num2 = Math.round((Math.random() * 20)); 

let answer = num1 + num2; 

rl.question(`What is sum of ${num1} + ${num2}?\n`, (userInput) => {
    if(parseInt(userInput) === answer){
        rl.close(); 
    }else {
        rl.setPrompt("Sorry Wrong Answer \n"); 
        rl.prompt(); 
        rl.on("line", (userInput) => {
            if(parseInt(userInput) === answer){
                rl.close(); 
            }else {
                rl.setPrompt(`again its wrong ${userInput} try again`); 
                rl.prompt(); 
            }
        })
    }
})

rl.on("close", ()=>{
    console.log("You are correct...");
})
