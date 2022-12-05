function calculateReimbursement(time) {
  var timeLenght = parseInt(time);
  if (timeLenght <= 10) {
    return 8;
  } else if (timeLenght <= 20) {
    return 11;
  } else if (timeLenght <= 30) {
    return 13.5;
  } else if (timeLenght <= 45) {
    return 16.5;
  } else {
    return 21;
  }
}

function patientPay(fee, maximumReimbursement) {
  var fixedAmmount = 15.9;
  var paidAmmount = parseInt(fee) + fixedAmmount - maximumReimbursement;
  return paidAmmount;
}

function calculate() {
  // Read values from the input fields
  var visitLenght = parseInt(document.getElementById("length").value);
  var doctorsFee = parseInt(document.getElementById("doctorsFee").value);
  var reimbursement = "";
  var totalPay = "";
  // Call the function (1.) which calculates and returns Kela reimbursement
  var reimbursement = calculateReimbursement(visitLenght).toFixed(2);
  // Call the function (2.) which calculates amount left for the customer to pay
  var totalPay = patientPay(doctorsFee, reimbursement).toFixed(2);
  // Write the answer on the page, to the answer div, as content of the div
  document.getElementById("answer").innerHTML =
    "Doctor's fee is " +
    doctorsFee.toFixed(2) +
    " euros.<br>Kela reimbursement is " +
    reimbursement +
    " euros.<br>Office Fee is 15.90 euros.<br>Customer needs to pay " +
    totalPay +
    " euros.";
}
//only doctorsFee has .toFixed(2) in the end because reimbursement and totalPay already has them when defined
