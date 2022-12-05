function checkAge() {
		// assign the age input field value into a variable
		var age = Number(document.getElementById("age").value);
		var outputText;
		//if age smaller than 18
		if (age<18) {
			// assign text "Adolescents are not allowed to play." to a variable
			var outputText = "Adolescents are not allowed to play.";
		}			
		// otherwise 
			else {
			
			// assign text "Old enough to play." to a variable  
			var outputText = "Old enough to play.";
		}
		
		// Write the answer to the web page DOM, in the answer div, as the content
		document.getElementById("answer").innerHTML=outputText;
}