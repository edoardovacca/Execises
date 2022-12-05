// Randomize the pips once

// Set the count to be one (now you have randomized once)

// Repeat as long as (pips are not equal) 


    // Randomize again
    
    // Increment counter by one


// Write the answer (including the count) to the html page (answer div)



/*Make a program that randomizes two dice pips until both pips are the same. 
At the end the program tells how many randomization rounds were needed. */

/*Initialize the count variable to be zero. That variable is used to count the randomization rounds.
Make a loop inside of which you randomize the two pips values until they will be the same. Use the while loop.*/

var i = 1;
var pips1 = Math.round((Math.random() * 5) + 1);
var pips2 = Math.round((Math.random() * 5) + 1);

while (pips1 !== pips2) {
    pips1 = Math.round((Math.random() * 5) + 1);
    pips2 = Math.round((Math.random() * 5) + 1);
    i++
}
document.getElementById("answer").innerHTML= "Same dice pips: " + pips1 + " and " + pips2 + "<br/>" + "There were " + i + " randomizations rounds until we got the same pips.";