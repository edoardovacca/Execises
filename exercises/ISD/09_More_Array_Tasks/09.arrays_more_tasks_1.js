var wordArray = ["Actions speak louder than words", "All for one and one for all.",
        "Don't fire until you see the whites of their eyes.", "Give him an inch and he'll take a mile.", "He who hesitates is lost."];
var randomNumber =  Math.floor(Math.random() * 4);  

var outputText= document.getElementById("pOutput");
outputText.innerHTML= wordArray[randomNumber];

// End