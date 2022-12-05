function processName() {
  // read value of name from the input field
  var name = document.getElementById("name").value;

  // show it with "ALL CAPS" using toUpperCase()
  var nameUpperCase = name.toUpperCase();
  document.getElementById("upperCase").innerHTML =
    "With upper case letters: " + nameUpperCase;

  // show it with  "all small letters" using toLowerCase()
  var nameLowerCase = name.toLowerCase();
  document.getElementById("lowerCase").innerText =
    "With lower case letters: " + nameLowerCase;

  //tell how many characters are there (length, includes also all spaces)
  var characterCount = name.length;
  document.getElementById("length").innerHTML =
    "Character count: " + characterCount;
  // tell, whether the input string contains the word 'muumi'
  if (name.indexOf("muumi") == true) {
    document.getElementById("contains").innerHTML =
      "Does contain the text muumi.";
  } else {
    document.getElementById("contains").innerHTML =
      "Doesn't contain the text muumi.";
  }
  // tell the first character using charAt()
  var nameInitial = name.charAt(0);
  document.getElementById("firstCharacter").innerHTML =
    "First character: " + nameInitial;

  // tell which ones are the first three characters using subStr().
  var nameFirstLetters = name.substr(0, 3);
  document.getElementById("manyCharacters").innerHTML =
    "First three characters: " + nameFirstLetters;
}
