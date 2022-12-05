0// 05_variables_warmup_3 JavasScript code

/*Complete the program so that it shows minutes as below when the user clicks the button. 
Assign the calculation result to a variable before displaying it.*/

function showMinutes() {
    //get hours and convert them in miuntes
    var hours = Number(document.getElementById("txtHours").value) * 60;
    //get minutes
    var minutes = Number(document.getElementById("txtMinutes").value);
    //sum total minutes
    var totalMinutes = hours + minutes;
    //show text
    document.getElementById("pOutput").innerHTML=totalMinutes + " minutes";
}