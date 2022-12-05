function showComparisonScores() {
		
	var votes = Number(document.getElementById("votes").value);
	var candidate = Number(document.getElementById("candidates").value);
	var answer = document.getElementById("answer");
	
		// For each candidates
		for (var i = 1; i <= candidate; i++) {
			// Calculate comparison score for candidate
			var calc = votes / i;
			var calc = i + ". candidate: " + calc.toFixed(0) + "<br/>";
			
		// Show scores
		answer.innerHTML += calc;
		}
}