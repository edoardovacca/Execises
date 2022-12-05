//The body mass index is BMI = weight / (height/100.0 * height/100.0)

/*Weight less than normal weight	18.4 or less
Normal weight	18.5 - 24.9
Overweight	25.0 or more*/

//output example: Body Mass Index (BMI) is 27.78 (Overweight)

function calculateBMI() {

  //TODO
  //get weight
  var weight = Number(document.getElementById("weight").value);
  //get height 
  var height = Number(document.getElementById("height").value);
  //get bmi
  var bmi = weight / (height/100.0 * height/100.0);

  //make if else
  if (bmi <= 18.4) {
      var outputText = "Body Mass Index (BMI) is " + bmi.toFixed(2) + " (Weight less than normal weight)";
  } else if (bmi >= 25.0) {
      var outputText = "Body Mass Index (BMI) is " + bmi.toFixed(2) + " (Overweight)";
  } else {
      var outputText = "Body Mass Index (BMI) is " + bmi.toFixed(2) + " (Normal weight)";  
  }
  
		document.getElementById("answer").innerHTML=outputText;
}
