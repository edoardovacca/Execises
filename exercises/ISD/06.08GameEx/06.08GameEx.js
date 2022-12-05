/*The game will randomize dice pips between 1-6. 
You can randomize the pips with var pips = Math.round( (Math.random( ) * 5) + 1 );
No pay if the randomized pips is 1, 3 or 5
The pips 2 and 4 return the set coins back 125% (=multiplied by 1.25)
The pips 6 returns the inserted bet 150%	*/

function play() {
		// Read value from the input field
		var bet = Number(document.getElementById("bet").value);

		// Randomize dice pips between 1-6
		var pips = Math.round( (Math.random( ) * 5) + 1 );

		// Calculate win base on pips
		if (pips == 1 || pips == 3 || pips == 5) {
			var outputText = "Pip was " + pips + " - no pay";
		} else if (pips == 2 || pips == 4) {
			var outputText = "Pip was " + pips + " - Paid back: " + bet * 1.25 + " euros";
		} else {
			var outputText = "Pip was " + pips + " - Paid back: " + bet * 1.50 + " euros";
		}

		// Write the answer on the page, to the answer div, as content of the div
		
		document.getElementById("answer").innerHTML = outputText;

}
