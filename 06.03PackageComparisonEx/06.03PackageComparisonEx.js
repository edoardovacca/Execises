/*Make a program for comparing two mobile phone subscription packages. 
The program asks for the amount of call time and the number of sent text messages, and tells which package would be cheaper.*/

/*The first package is an all-inclusive package where unlimited data, calls and text messages are covered by the monthly fee 29.90 euros. 
The second special package has unlimited data included in the monthly 19.90 euro fee 
but the calls are 0.069 euros per minute and text messages 0.069 euros a piece.*/

//output example :The All-inclusive package (29.90) is cheaper than the Special package (37.15)


function comparePackages() {
	
		// assign input field values into a variables
		var messages = Number(document.getElementById("textMessages").value);
		var callTime = Number(document.getElementById("callTime").value);

		// calculate the costs of the Special Package
		var secondMessages = messages * 0.069;
		var secondCalls = callTime * 0.069;
		var secondPackage = secondMessages + secondCalls + 19.90;
			

		// If the Special package is cheaper than the All-inclusive package 
		if (secondPackage < 29.90) {
			// assign text "The Special package (XX.XX) is cheaper than the All-inclusive package (29.90)"
			// to a variable
					var outputText = "The Special package (" + secondPackage.toFixed(2) + ") is cheaper than the All-inclusive package (29.90)"
		
		// otherwise
		} else {
		// assign text "The All-inclusive package (29.90) is cheaper than the Special package (XX.XX)"
			// to a variable
					var outputText = "The All-inclusive package (29.90) is cheaper than the Special package (" + secondPackage.toFixed(2) + ")";
		}
		
					// write the answer to the web page DOM, in the answer div, as the content
		document.getElementById("answer").innerHTML=outputText;
}