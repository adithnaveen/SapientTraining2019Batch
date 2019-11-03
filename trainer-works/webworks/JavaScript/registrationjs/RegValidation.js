
// all validations will go here 

// this function will call all other function for validation 
function fnValidateForm(){
	
	if(!fnValidateName())
		return false;
		
	if(!fnValidatePassword())
		return false;
	
	if(!fnValAddr())
		return false;
		
	if(!valSex())
		return false;
		
	if(!valQualification())
		return false;
		
	if(!valCountry())
		return false;
	
	if(!fnAreaInterest())
		return false;

	alert("Congrats you form is validate successfully\nWait for your username");
		return true;
}

function fnValidateName(){
	fname = document.regForm.userName.value 
	
	if(fname.length<6){
		alert("Sorry name cannot be less than 6 chars\nRe-Enter");
		return false;
		}
		
		if(fname.charAt(0)==" "){
			alert("Sorry name cannot have leading spaces");
			return false;
		}
		
		spl="1234567890.`~!@#$%^&*()_\\\'\"<>,/?";
		
		for(var i=0; i<spl.length; i++){
			if(fname.indexOf(spl.charAt(i))>=0){
				alert("Sorry you cannot have special characters or numbers in name");
				return false;
			}
		}
		return true;
}

// we will check for password is min of 8 chars
// password and confirm password is same (with length)
// password should contain atleast 1 spl char 
function fnValidatePassword(){
	passwd = document.regForm.usrPwd.value;
	
	if(passwd.length<6){
		alert("Sorry you cannot have password less than 6 characters");
		return false;
	}
	
	repasswd=document.regForm.cpwd.value
	
	if(passwd.length!=repasswd.length){
			alert("Sorry you password and repassword length mismatch");
			return false;
	}else{
		// confirm password and password length's are same check for each chars
		
		for(var i=0; i<passwd.length; i++){
			if(passwd.charAt(i)!=repasswd.charAt(i)){
					alert("Password and confirm password mismatch");
					return false;
				}// end if
		}// end for 
	}// end if
	
	
	// to check wheter the password has atleast one splecial char
	spl="1234567890.`~!@#$%^&*()_\\\'\"<>,/?";
	flag=false;
	
	for(var i=0; i<spl.length; i++){
			if(passwd.indexOf(spl.charAt(i))>=0){
					flag=true;
				}
		}
	
	if(flag)
		return true;
	else{
			alert("Password should contain atleast one spl character");
			return false;
		}
}


function fnValAddr(){
		address=document.regForm.addrs.value
		
		if(address.charAt(0) ==" "){
			alert("Sorry Address cannot have leading spaces");
			return false;
		}
		
		if(address.length<15){
			alert("Address should be of min 15 chars");
			return false;
			}
			
		return true;
}


function valSex(){
	s = document.regForm.sex
	for(var i=0; i<s.length;i++){
		if(s[i].checked)
			return true;
	}
	alert("Sorry please select your sex ");
	return false;
}


function valQualification(){
		qualification = document.regForm.qual
		
		if(qualification.selectedIndex<1){
			alert("Select your qualification from the list");
			return false;
		}
		return true;
}

function valCountry(){
	country = 	document.regForm.country
	if(country.selectedIndex<1){
			alert("Select country from list");
			return false;
		}
		return true;
	
}

function fnAreaInterest(){
	if(document.regForm.cb1.checked || document.regForm.cb2.checked ||
	   	document.regForm.cb3.checked || document.regForm.cb4.checked)
				return true;
				
	alert("Please Select area of Interest");
	return false;
}

function enableButton(){
	document.regForm.regbtn.disabled=false;
}

function disableButton(){
	document.regForm.regbtn.disabled = true;	
}






