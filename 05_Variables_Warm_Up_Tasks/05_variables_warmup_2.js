// 05_variables_warmup_2 JavasScript code

/*Complete the program so that it shows the sum of the given numbers as below when the user clicks the button. 
Assign the sum to a variable before displaying it.*/

function add(){
    //get first number
    var firstNumber = Number(document.getElementById("txtFirst").value);
    //get second number
    var secondNumber = Number(document.getElementById("txtSecond").value);
    //make sum
    var sum = firstNumber + secondNumber;
    //make text appear
    document.getElementById("pOutput").innerHTML=firstNumber + "+" + secondNumber + "=" + sum;
}
