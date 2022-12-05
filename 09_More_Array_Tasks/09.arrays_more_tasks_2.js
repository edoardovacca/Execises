function showBloodType() {
  var bloodTypes = [
    "A+",
    "O-",
    "AB+",
    "O+",
    "AB+",
    "AB+",
    "O-",
    "AB+",
    "O-",
    "AB+",
  ];

  var digitText = document.getElementById("txtDigit").value;
  var outputText = document.getElementById("pOutput");
  var numberBloodTypes = "";

  for (var i = 0; i < bloodTypes.length; i++) {
    if (digitText === bloodTypes[i]) {
      //calculate percentage
      numberBloodTypes++;
      percentage = (numberBloodTypes * 100) / bloodTypes.length;
    }
  }

  outputText.innerHTML = digitText + " " + percentage + " percent";
}
