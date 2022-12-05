function processName() {
  // read value of name from the input field
  var name = document.getElementById("name").value;

  // show it with "ALL CAPS" using toUpperCase()
  var nameUpperCase = name.toUpperCase();
  document.getElementById("upperCase").innerHTML =
    "With upper case letters: " + nameUpperCase;

  // show it with  "all small letters" using toLowerCase()
  var nameLowerCase = name.toLowerCase();
  document.getElementById("lowerCase").innerHTML =
    "With lower case letters: " + nameLowerCase;

  //tell how many characters are there (length, includes also all spaces)
  //use variable.lenght
  var nameLength = name.length;
  document.getElementById("length").innerHTML =
    "Character count: " + nameLength;
}
