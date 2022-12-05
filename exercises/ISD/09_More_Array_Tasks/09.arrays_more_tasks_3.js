var names = [];
var ages = [];
var divTotalMembers = document.getElementById("divTotalMembers");
divTotalMembers.innerHTML = names.length + " members";
var answer = document.getElementById("answer");

function insertValue() {
  var txtName = document.getElementById("txtName");
  var txtAge = document.getElementById("txtAge");
  names.push(txtName.value);
  ages.push(txtAge.value);
  divTotalMembers.innerHTML = names.length + " members";
  txtName.value = "";
  txtAge.value = "";
}

function showMinors() {
  answer.innerHTML = "";
  var minorsList = "";
  for (var i = 0; i < ages.length; i++) {
    if (ages[i] < 18) {
      minorsList += names[i] + ", " + ages[i] + " years<br/>";
    }
  }
  answer.innerHTML += minorsList;
}

function showAdults() {
  answer.innerHTML = "";
  var adultList = "";
  for (var i = 0; i < ages.length; i++) {
    if (ages[i] >= 18) {
      adultList += names[i] + ", " + ages[i] + " years<br/>";
    }
  }
  answer.innerHTML += adultList;
}

function showOldestMember() {
  answer.innerHTML = "";
  var outputText = "";
  var max = ages[0];
  for (var i = 0; i < ages.length; i++) {
    if (ages[i] > max) {
      max = ages[i];
    }
  }
  for (var j = 0; j < ages.length; j++) {
    if (ages[j] == max) {
      outputText += names[j] + ", " + ages[j] + " years<br/>";
    }
  }

  answer.innerHTML = outputText;
}

function showYoungestMember() {
  answer.innerHTML = "";
  var outputText = "";
  var min = ages[0];
  for (var i = 0; i < ages.length; i++) {
    if (ages[i] < min) {
      min = ages[i];
    }
  }
  for (var j = 0; j < ages.length; j++) {
    if (ages[j] == min) {
      outputText += names[j] + ", " + ages[j] + " years<br/>";
    }
  }
  answer.innerHTML = outputText;
}
