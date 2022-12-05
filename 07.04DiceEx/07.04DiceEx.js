function randomInteger(from, to) {
  // Return randomizedNumber between 'from' and 'to'.
  var randomNumber = Math.floor(Math.random() * to + from);
  return randomNumber;
}

function rollTheDice() {
  // Call the function randomInteger(from, to) with parameter values 1 and 6.
  // Assign the return value of the function to the variable.
  var diceValue = randomInteger(1, 6);
  //Insert the value of the variable diceValue into the HTML div element whose id is 'dice'.
  document.getElementById("dice").innerHTML = diceValue;
}
