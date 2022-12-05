	// Define the array variable and index variable inside the script element, but NOT inside the function. 
	// Then they will be global and thus available for all functions to read from or write to.
	var names = [];
	var index = 0;
	

	function addName() {
		// Assign name from the input field to the array
		var givenName = document.getElementById("name");
		names.push(givenName.value);
		var allNames = "";
		// Increase the index by one
		
		// Go through the array in a for loop adding each name at the end of the namesText
		for(var i = 0; i < names.length; i++){
			
		// Write the names on the page, to the names div, as content of the div
			var divNameList = document.getElementById("nameList");
			var divAnswer = document.getElementById("answer");
						
			allNames += names[i] + " ";
			divNameList.innerHTML="Inserted names: " + allNames;
			

		// Empty the input field of name as that name was just put in the array
			givenName.value= "";

		// Empty the answer text
			divAnswer.innerHTML="";
		}
	}

	function makeDraw() {

		// Randomize the index of the winner
		var winningIndex = Math.floor(Math.random() * names.length);
		
		// Write the answer on the page, to the answer div, as content of the div
		document.getElementById("answer").innerHTML= "<br/> Winner is " + names[winningIndex]

	}