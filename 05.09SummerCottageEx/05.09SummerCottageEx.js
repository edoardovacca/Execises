function calculateRent() {
		
		 // TODO
		 // get rent		
		var rent = Number(document.getElementById("rent").value);
		//get participants
		var participants = Number(document.getElementById("participants").value);
		//get rent per person
		var rentPerson = rent / participants;
		//make text appear: Rent per participants is 60.00 euros.
		document.getElementById("answerDiv").innerHTML="Rent per participants is " + rentPerson.toFixed(2) + " euros.";
}

