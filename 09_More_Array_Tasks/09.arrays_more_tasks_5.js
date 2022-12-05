//WORK IN PROGRESS NOT YET FINISHED

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
var pOutput = document.getElementById("pOutput");
var answer = "";
var count = "";
//array per contare ogni count prima del reset
var times = [];
var percentage = "";
bloodTypes.sort();

for (i = 0; i < bloodTypes.length; i++) {
  count = 0;
  for (var j = 0; j < bloodTypes.length; j++) {
    if (bloodTypes[i] == bloodTypes[j]) {
      count++;
    } else {
      i += count;
      j += count;
      times.push(count);
      break;
    }
  }
}

for (var k = 0; k < times.length; k++) {
  percentage = (times[k] * 100) / bloodTypes.length;
  answer += percentage + "&percnt; " + bloodTypes[k + times[k] + 1] + "<br />";
}

pOutput.innerHTML = answer;
