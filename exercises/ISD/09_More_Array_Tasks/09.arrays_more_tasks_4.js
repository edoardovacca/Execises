var lotteryNumbers = [];
var answer = document.getElementById("pOutput");
answer.innerHTML = "";
var randomNumber = "";
var flag = false;

var i = lotteryNumbers.length; //initialization while loop
while (i < 7) {
  //condition while loop-- it should stops when there are 7 elements in the array

  randomNumber = Math.floor(Math.random() * 39 + 1); //generates random number
  //for loop
  for (var j = 0; j < lotteryNumbers.length; j++) {
    //for loop for checking each time if generated number is different from all the elements of the array

    if (randomNumber === lotteryNumbers[j]) {
      flag = true;
    }
  } //end of for loop

  //if flag is false add to array
  if (flag === false) {
    lotteryNumbers.push(randomNumber);
    i++; //incrementation while loop
  }
} //end of while loop

//for loop for writing array
for (var k = 0; k < lotteryNumbers.length; k++) {
  answer.innerHTML += lotteryNumbers[k] + " ";
}
