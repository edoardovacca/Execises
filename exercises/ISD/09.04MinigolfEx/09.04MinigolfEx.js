// Create an array with minigolf results of eight players 
var minigolf = [23, 19, 37, 20, 21, 30, 26, 24];
var answer = document.getElementById("answer");

function showResults() {
    // Sort the array
    minigolf.sort();

    // Assign the smallest result of to a variable
    var smallest = minigolf[0];

    // Assign the index of last array item to an variable
    // Assign the biggest result to a variable
    var biggest = minigolf[minigolf.length - 1]; 

    // Write the answer on the page, to the answer div, as content of the div
    answer.innerHTML= "The smallest result is " + smallest + " (winner). </br> The biggest result is " + biggest + ".";
}