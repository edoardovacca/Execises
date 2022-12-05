function displayGreetingWithAge(name, yob) {
  const d = new Date();
  let year = d.getUTCFullYear();
  var age = year - yob;
  return console.log(
    "Hello " + name + "! You are " + age + " years old this year."
  );
}

var mike = "Mike";
var mikeYob = 1989;
var anne = "Anne";
var anneYob = 2002;
var joe = "Joe";
var joeAge = 2010;

displayGreetingWithAge(mike, mikeYob);
displayGreetingWithAge(anne, anneYob);
displayGreetingWithAge(joe, joeAge);
