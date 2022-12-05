	function tellInfractionFine() {
		//get driving speed
		var drivingSpeed = Number(document.getElementById("drivingSpeed").value);
		//get speed limit
		var speedLimit = Number(document.getElementById("speedLimit").value);
		//get speeding
		var speeding = drivingSpeed - speedLimit;
		//get var outputText
		var outputText;
		
		if (speedLimit >= 10 && speedLimit <= 60 && drivingSpeed > speedLimit && speeding <= 15) {
					outputText = "infraction fine is 85 euros.";

			} else if (speedLimit >= 10 && speedLimit <= 60 && speeding > 15 && speeding <= 20) {
					outputText = "infraction fine is 115 euros.";
		
			} else if (speedLimit >= 70 && speedLimit <= 120 && drivingSpeed > speedLimit && speeding <= 15) {
					outputText = "infraction fine is 70 euros.";
		
			} 	else if (speedLimit >= 70 && speedLimit <= 120 && speeding > 15 && speeding <= 20) {
					outputText = "infraction fine is 100 euros.";

			} else if (speeding > 20) {
					outputText = "Income-based unit fine.";

			} else {
					outputText = "No speeding, no fine";
		}
		document.getElementById("answer").innerHTML= outputText;
	}


         
