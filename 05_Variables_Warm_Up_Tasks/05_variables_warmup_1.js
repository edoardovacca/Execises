// 05_variables_warmup_1 JavasScript code

/*The template page looks as below. Complete the program so that it shows an email address as below when the user clicks the button. 
The email address format is the following: givenName.surname@myy.haaga-helia.fi
Assign the email address to a variable before displaying it.*/

function showEmail() {
	//get name
    var name = document.getElementById("txtGivenName").value;
	//get surname 
    var surname = document.getElementById("txtSurname").value;
	//make the paragraph says the complete email
    document.getElementById("pOutput").innerHTML = name + "." + surname + "@myy.haaga-helia.fi";
}
