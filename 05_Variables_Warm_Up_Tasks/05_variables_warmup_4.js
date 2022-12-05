// 05_variables_warmup_4 JavasScript code

/*Complete the program so that it shows hours and minutes as below when the user clicks the button. 
Assign the calculation results (hours and minutes) to two separate variables.
Hint: Use the remainder operator here.*/

function showHoursAndMinutes() {
    //get minutes
    var minutes = Number(document.getElementById("txtMinutes").value);
    //make minutes into normal hours and minutes
    var hours = minutes / 60;
    var minutesLeft = minutes % 60;
    //make text appear
    document.getElementById("pOutput").innerHTML= hours.toFixed(0) + " h " + minutesLeft + " minutes";
}