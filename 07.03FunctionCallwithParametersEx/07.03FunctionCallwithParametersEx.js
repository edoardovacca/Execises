/* each time a different image URL to the function.

In the first function call, pass the following string to the function:

"https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Finland.svg/250px-Flag_of_Finland.svg.png"

In the second function call, pass the following string to the function:

"https://upload.wikimedia.org/wikipedia/en/thumb/4/4c/Flag_of_Sweden.svg/250px-Flag_of_Sweden.svg.png"

In the third function call, pass the following string to the function:

"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/250px-Flag_of_Norway.svg.png".

TEMPLATES:
function addImage(imgUrl) {
  var image = document.createElement("img");
  image.src = imgUrl;
  var imageDiv = document.getElementById("images");    
  imageDiv.appendChild(image);
}
*/
//INSERT YOUR CODE HERE
var output = document.getElementById("images");

function addImage(imgUrl) {
  return "<img src='" + imgUrl + "'>";
}

var finland =
  "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Finland.svg/250px-Flag_of_Finland.svg.png";
var sweden =
  "https://upload.wikimedia.org/wikipedia/en/thumb/4/4c/Flag_of_Sweden.svg/250px-Flag_of_Sweden.svg.png";
var norway =
  "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/250px-Flag_of_Norway.svg.png";

output.innerHTML = addImage(finland) + addImage(sweden) + addImage(norway);
