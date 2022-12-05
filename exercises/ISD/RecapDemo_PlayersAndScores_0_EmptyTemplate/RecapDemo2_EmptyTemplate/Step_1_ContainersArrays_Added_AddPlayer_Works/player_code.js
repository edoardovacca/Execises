var names = [];
var scores = [];

function addPlayer() {
  //get input from id="txtName" and id="txtScore". givenScore for now accepts also non numbers
  var givenName = document.getElementById("txtName");
  var givenScore = document.getElementById("txtScore");
  var uppercaseName = "";
  //might want to add capital letter maybe on name(s) and surname(s) (?)
  //to do that take out empty spaces before and after the given name, then make it all lowercase
  //then split it into name and surname using the space in between the two as the splitting point
  var fullNameTrimmed = givenName.value.trim();
  fullNameTrimmed = fullNameTrimmed.toLowerCase();
  var splitName = fullNameTrimmed.split(" ");
  for (var i = 0; i < splitName.length; i++) {
    //first part is to make the first letter upper case, then you add the remaining of the string otherwise you'll just have the first letter.
    //the empty space is there to not have the full name display as NameSurname but as Name Surname
    uppercaseName +=
      splitName[i].charAt(0).toUpperCase() + splitName[i].substr(1) + " ";
    //this next line is for removing the space at the end of the surname
    uppercaseName = uppercaseName.trim();
  }
  //add given values to the corresponding array
  names.push(uppercaseName);
  scores.push(givenScore.value);
  //empty input fields
  givenName.value = "";
  givenScore.value = "";
}
