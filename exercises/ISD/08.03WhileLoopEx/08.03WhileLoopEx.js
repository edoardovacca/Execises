// TODO: JavaScript code

/*Make a program that displays a confirm dialog box with the text "Do you want to continue?" again and again until the user clicks the Cancel button in the dialog box. 
If the user clicks the OK button in the dialog box, then the program shows an alert dialog box with the text "Hello!".
 After the user has closed the alert dialog box the program shows the confirm dialog box again. */

 // The alert() method displays a modal dialog box with a specified message, along with an OK button

 /*The confirm() method displays a modal confirm dialog box with a specified message, along with an OK and a Cancel button. 
 The method returns true if the user clicked OK, otherwise the method returns false. */

 //it must be a while loop!



 while (confirm("Do you want to continue?") == true) {
     alert("Hello!");
     
 }
