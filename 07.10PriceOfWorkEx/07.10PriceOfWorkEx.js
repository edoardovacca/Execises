function modifyTitle() {
  // Read value of title from the input field
  var givenTitle = document.getElementById("title").value;
  // Call allCapsTitleTrimmed() function
  var fixedText = allCapsTitleTrimmed(givenTitle);
  document.getElementById("title").value = fixedText;
}

function allCapsTitleTrimmed(text) {
  // Removes any empty white space from the beginning or the end of the text
  var trimText = text.trim();
  // Changes the text given to it to be ALL CAPS
  var upperText = trimText.toUpperCase();
  // Return the changed text
  return upperText;
}

function calculate() {
  var startTime = document.getElementById("startTime").value;
  var endTime = document.getElementById("endTime").value;
  var givenDate = document.getElementById("date").value;
  var startHour = "";
  var startMinutes = "";
  var totalStartMinutes = "";
  var endHour = "";
  var endMinutes = "";
  var totalEndMinutes = "";
  var workLength = "";
  var totalPrice = "";
  var fee = "";
  var workdaysFee = 48;
  var sundayFee = 72;
  var outputText = document.getElementById("answer");
  var weekday = "";
  // Calculate length of the work as minutes.
  startTime = startTime.split(":");
  startHour = parseInt(startTime[0], 10) * 60;
  startMinutes = parseInt(startTime[1], 10);
  totalStartMinutes = startHour + startMinutes;
  endTime = endTime.split(":");
  endHour = parseInt(endTime[0], 10) * 60;
  endMinutes = parseInt(endTime[1], 10);
  totalEndMinutes = endHour + endMinutes;
  workLength = totalEndMinutes - totalStartMinutes;
  // If it is not Sunday  (Call isSunday() function)
  if (isSunday(givenDate) == false) {
    //Calculate and show price of the repair work during the workdays
    fee = workdaysFee.toFixed(2);
    totalPrice = ((workLength * fee) / 60).toFixed(2);
    weekday = "workdays ";
  } else {
    //otherwise
    //Calculate and showprice of the repair work on Sundays
    fee = sundayFee.toFixed(2);
    totalPrice = ((workLength * fee) / 60).toFixed(2);
    weekday = "Sundays ";
  }
  outputText.innerHTML =
    "Length of the work was " +
    workLength +
    " minutes.<br/>The hourly price is during the " +
    weekday +
    fee +
    " euros.<br/>The price of this repair work is " +
    totalPrice +
    " euros.";
}

// The function gets the date text in the format "dd.MM.yyyy".
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
