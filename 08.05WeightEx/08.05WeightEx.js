//make program that tells 10% loss of weight from original weight each month

/*function showWeightGoals() { 
    // read the original weight to a variable 
    // calculate how many kgs one should get lighter each week = weight * 0.1 / 7
    // initialize output text variable to start from empty text: "" 
    // it will be used later to gather all the output lines. (String can hold also line breaks) 
    
    // for (var i = 1; i <= 7; i++) { 
     	// give the weight variable a new value which is weight after last
        // measurement reduced by the how much to lose this week.
        // add this week’s text + line break to the output text variable 
    } 

    
    // write the whole output text to the HTML page at once 

}*/	

function showWeightGoals() {
		// TODO
		var weight = Number(document.getElementById("weight").value);
		var weeklyLoss = weight * 0.1 / 7;
		var answer = document.getElementById("answer");

		for (var i = 1; i <= 7; i++) {
			var weight = weight - weeklyLoss;
			answer.innerHTML += "After " + i +". week " + weight.toFixed(1) + " kg<br/>";
		}

}