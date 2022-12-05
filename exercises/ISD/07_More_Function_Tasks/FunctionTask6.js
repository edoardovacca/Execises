/*Define a new function called getGreetingWithAge, that is given a name and year of birth (yob) as arguments. DONE
The function will NOT display anything to console nor to the web page. 
But it will return the greeting, e.g. "Hello Anne! You are 19 years old this year." to whoever was the caller code. DONE
Now make the displayGreetingWithAge function to call the getGreetingWithAge, 
and after the call returns, displayGreetingWithAge will print the greeting to the console.
Use the same test input as earlier. 
But make sure the getGreetingWithAge is not printing/showing/displaying anything to the console.
*/

function getGreetingWithAge(name, yob) {
  const d = new Date();
  let year = d.getUTCFullYear();
  var age = year - yob;
  return "Hello " + name + "! You are " + age + " years old this year.";
}

function displayGreetingWithAge(name, yob) {
  var output = getGreetingWithAge(name, yob);
  console.log(output);
}

var mike = "Mike";
var mikeYob = 1989;
var anne = "Anne";
var anneYob = 2002;
var joe = "Joe";
var joeYob = 2010;

displayGreetingWithAge(joe, joeYob);
displayGreetingWithAge(anne, anneYob);
displayGreetingWithAge(mike, mikeYob);
