function fnParams(name1, name2, name3){
    console.log(name1, name2, name3);
    
}

fnParams ("Harry", "Potter", "Lisa"); 

// this function may take or may not take the params 
function fnParams1(... myParams){
    console.log(myParams);
}

fnParams1()

// category is mandatory 
function fnParams2(category, ...items){
    console.log(category);
    console.log(items);
    
}

fnParams2("electronics")
fnParams2("electronics", "laptop", "computer", "mouse")



