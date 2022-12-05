function calculateSalary(hours, hourlySalary) {
  // calculate salary
  var salary = hours * hourlySalary;
  // return the gross salary with the return statement
  return salary.toFixed(2);
}

function showGrossSalary() {
  // assign the input field value to the variable hours
  // assign the second input field value to the variable hourlySalary
  // call the calculateSalary function
  // write the answer on the html page
  var givenHours = Number(document.getElementById("hours").value);
  var givenHourySalary = Number(document.getElementById("hourlySalary").value);
  var grossSalary = calculateSalary(givenHours, givenHourySalary);
  document.getElementById("answer").innerHTML =
    "Gross salary is " + grossSalary + " euros.";
}
