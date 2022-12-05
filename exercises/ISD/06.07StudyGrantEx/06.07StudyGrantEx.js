function showStudyGrant() {
	//get age
	var age = Number(document.getElementById("age").value);
	//get parents
	var parents = document.getElementById("withParents").value;

	/*make if else statement in the following way:
		if age>=20 and parents="y" then outputText="The student grant is 136.70 euros."
		if else age>=20 and parents="n" then outputText="The student grant is 335.20 euros."
		else output="Ask Kela."*/

		if (age >= 20 && parents == "y") {
			var outputText = "The study grant is 136.70 euros.";
		} else if (age >= 20 && parents == "n") {
			var outputText = "The study grant is 335.20 euros.";
		} else {
			var outputText = "Ask Kela.";
		}
	//make text appear
	document.getElementById("answer").innerHTML=outputText;
}
	