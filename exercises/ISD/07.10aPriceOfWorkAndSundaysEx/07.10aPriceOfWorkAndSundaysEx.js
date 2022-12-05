function calculate() {
  // Read date text from the input field
  var givenDay = document.getElementById("date").value;

  // If it is not Sunday  (Call isSunday() function with a date text as a parameter)
  if (isSunday(givenDay) == false) {
    //Show price of the repair work per hour during the workdays
    document.getElementById("answer").innerHTML =
      "<p>Date " +
      givenDay +
      "(work day).<br>The price of this repair work is  48 euros per hour.</p>";
    //otherwise
  } else {
    //Show price of the repair work per hour on Sundays
    document.getElementById("answer").innerHTML =
      "<p>Date " +
      givenDay +
      " (Sunday)<br>The price of this repair work is 72 euros per hour.</p>";
  }
}
// The function returns Boolean value true if the date is for a Sunday, otherwise false.
function isSunday(dateText) {
  // Split the given dateText into day, month and year parts using the substr() method
  var day = dateText.substr(0, 2);
  var month = dateText.substr(3, 2);
  var year = dateText.substr(6, 4);
  // Create a new Date object to a variable
  var asDate = new Date();
  // Get the day of the week with its getDay() method. Sunday is number 0 .
  asDate.setDate(day);
  asDate.setMonth(month - 1);
  asDate.setFullYear(year);
  var weekDay = asDate.getDay();
  // If day of the week is Sunday
  if (weekDay == 0) {
    // return Boolean value true
    return true;
  } else {
    // otherwise
    // return Boolean value false
    return false;
  }
}
