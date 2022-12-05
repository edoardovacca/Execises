// Define a function (1.) which gets the length of the doctor's visit as a parameter and returns the maximum Kela reimbursement.
function calculateReimbursement(time) {
  var timeLenght = parseInt(time);
  if (timeLenght <= 10) {
    return 8.0;
  } else if (timeLenght <= 20) {
    return 11.0;
  } else if (timeLenght <= 30) {
    return 13.5;
  } else if (timeLenght <= 45) {
    return 16.5;
  } else {
    return 21.0;
  }
}

// Define a function (3.)
function calculate() {
  // Read values from the input fields
  var visitLenght = document.getElementById("length").value;
  var doctorsFee = document.getElementById("doctorsFee").value;
  var reimbursement = "";
  // Call the function (1.) which calculates and returns Kela reimbursement
  var reimbursement = calculateReimbursement(visitLenght).toFixed(2);

  // Write the answer on the page, to the answer div, as content of the div
  document.getElementById("answer").innerHTML =
    "Length of visit is " +
    visitLenght +
    " minutes.<br>Kela reimbursement is " +
    reimbursement +
    " euros.";
}
