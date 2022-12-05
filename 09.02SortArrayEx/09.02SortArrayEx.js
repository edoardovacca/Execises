/*First, sort the given array in reverse alphabetical order (z-a). 
After that, write all the array element values into the browser console. 
Each value should be displayed on a separate line.*/

var array = ["Milk", "Bread", "Juice", "Eggs", "Butter", "Salt", "Oranges", "Apples"];

function sortArray() {
    // TODO
    array.sort();
    array.reverse();
    for(var i = 0; i < array.length; i++){
        console.log(array[i]);
    }

}