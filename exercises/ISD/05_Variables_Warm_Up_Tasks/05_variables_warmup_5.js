// 05_variables_warmup_5 JavasScript code

//Complete the program so that it shows the account balance at the end of the first year and at the end of the second year when the user clicks the button.

function calculate() {
    //get starting balance
    var startingBalance = Number(document.getElementById("txtStartingBalance").value);
    //get interest rate not as percentage but as decimal
    var interestRate = Number(document.getElementById("txtInterestRate").value) *.01;
    //first year balance
    var firstYear = startingBalance + startingBalance * interestRate;
    //second year balance
    var secondYear = firstYear + firstYear * interestRate;
    //make text appear - need a break tag to make the output to be printed on two lines.
    document.getElementById("pOutput").innerHTML="1. year: " + firstYear.toFixed(2) + "<br/>" + "2. year: " + secondYear.toFixed(2);
}