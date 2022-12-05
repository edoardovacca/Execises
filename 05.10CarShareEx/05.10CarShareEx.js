/*The group went to the summer cottage sharing a car. Make a program that calculates the fuel costs per person. 
The program asks for driven kilometers, fuel consumption per 100 km, price per litre and participant count.*/

function calculateCosts() {

		//TODO
		//get km
		var kilometers = Number(document.getElementById("kilometers").value);
		//get consumption
		var consumption = Number(document.getElementById("consumption").value)/100;
		//get price
		var price = Number(document.getElementById("price").value);
		//get participants
		var participants = Number(document.getElementById("participants").value);
		//get costs per person
		var costs = (kilometers * consumption * price) / participants;
		//make text appear: Fuel costs per participant is 2.73 euros.
		document.getElementById("answerId").innerHTML= "Fuel costs per participant is " + costs.toFixed(2) + " euros."
}