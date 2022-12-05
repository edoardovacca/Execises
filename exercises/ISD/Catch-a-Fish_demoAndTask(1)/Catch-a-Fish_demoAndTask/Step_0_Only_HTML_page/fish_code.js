var speciesArray = ["Pike", "Salmon", "Salmon", "Trout"];
var lengths = [40, 71, 76, 22];
var weights = [4.925, 3.675, 5.4, 1.51];

// ----------------------------------------------------------------------------
function addFish() {
  var newSpecies = document.getElementById("txtSpecies").value;
  var newLength = Number(document.getElementById("txtLength").value);
  var newWeight = Number(document.getElementById("txtWeight").value);
  speciesArray.push(newSpecies);
  lengths.push(newLength);
  weights.push(newWeight);
  document.getElementById("txtSpecies").value = "";
  document.getElementById("txtLength").value = "";
  document.getElementById("txtWeight").value = "";
}

// ----------------------------------------------------------------------------
function listAllCatch() {
  var outputText = "";
  for (var i = 0; i < speciesArray.length; i++) {
    outputText +=
      i +
      1 +
      ". " +
      speciesArray[i] +
      ", length: " +
      lengths[i] +
      ", weight: " +
      weights[i] +
      "<br />";
  }
  document.getElementById("pOutput2").innerHTML = outputText;
}

// ----------------------------------------------------------------------------
function showAverageWeight() {
  var outputText;
  var totalSum = 0;
  for (var i = 0; i < weights.length; i++) {
    totalSum += weights[i];
  }
  outputText = totalSum / weights.length;
  document.getElementById("pOutput3").innerHTML = outputText + " kg";
}

// ----------------------------------------------------------------------------
function findFish() {
  var outputText = "";
  var givenSpecies = document.getElementById("txtSpeciesSearched").value;
  var fishIndex = [];
  for (var i = 0; i < speciesArray.length; i++) {
    if (givenSpecies == fishIndex[i]) {
      fishIndex.push(i);
    }
  }
  for (var j = 0; j < fishIndex.length; j++) {
    outputText +=
      j +
      1 +
      ". " +
      speciesArray[j] +
      ", length: " +
      lengths[j] +
      ", weight: " +
      weights[j] +
      "<br />";
  }
  // Updating the View
  document.getElementById("pOutput4").innerHTML = outputText;
}

// ----------------------------------------------------------------------------
function maxWeightFreshmanWay() {
  var outputText = "";
  var max = weights[0];
  for (var i = 0; i < weights.length; i++) {
    if (max < weights[i]) {
      max = weights[i];
    }
  }
  outputText = max;
  // Updating the View
  document.getElementById("pOutput5").innerHTML = outputText;
}

// ----------------------------------------------------------------------------
function maxWeightUsingIndex() {
  var outputText = "";
  var max = weights[0];
  var maxIndx = [];
  for (var i = 0; i < weights.length; i++) {
    if (max < weights[i]) {
      max = weights[i];
      maxIndx.push(i);
    }
  }
  for (var j = 0; j < maxIndx.length; j++) {
    outputText +=
      j +
      1 +
      ". " +
      speciesArray[j] +
      ", length: " +
      lengths[j] +
      ", weight: " +
      weights[j] +
      "<br />";
  }
  // Updating the View
  document.getElementById("pOutput5").innerHTML = outputText;
}

// ------------ library function for converting kg to lbs ---------------------
function convertKgToLbs(kilograms) {
  var finalLbs = kilograms / 0.454;
  return finalLbs;
}

// ----------------------------------------------------------------------------
function fishSpeciesReport() {
  // Read input
  var speciesSearched = document.getElementById("txtSpeciesSearched").value;
  var found = false;
  var count = 0;
  var outputText = "";

  for (var i = 0; i < speciesArray.length; i++) {
    if (speciesSearched === speciesArray[i]) {
      found = true;
      count++;
      outputText =
        outputText +
        speciesArray[i] +
        ": " +
        lengths[i] +
        "cm, " +
        weights[i] +
        "kg.<br />";
    }
  }

  if (found === false) {
    outputText = outputText + speciesSearched + " not found!";
  } else {
    outputText = outputText + count + " " + speciesSearched + "(s)";
  }

  // Updating the View
  document.getElementById("txtSpeciesSearched").value = "";
  document.getElementById("pOutput5").innerHTML = outputText;
}
