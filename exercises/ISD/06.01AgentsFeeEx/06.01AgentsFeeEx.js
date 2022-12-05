function calculateFee() {
		
	// Read value from the input field
		var price = Number(document.getElementById("price").value);

	// Calculate fee, save the result to a variable
		var fee = price * 0.0344;
		
	// if the fee is under minimum, update it
		if (fee<2400) {
			fee=2400;
		}

	// Write the answer on the page, to the fee div, as content of the div
		document.getElementById("fee").innerHTML="Real state agent's fee is " + fee.toFixed(2) + " euros";
}


//output exaple: Real state agent's fee is 2400.00 euros
//The fee is 3.44% selling price but always at least 2 400 euros.