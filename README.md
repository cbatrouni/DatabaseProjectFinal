# DatabaseProjectFinal

This project was to teach myself how to use and manipulate a database. I used MAMPS PHPMyAdmin to create a local server database on my computer.
In Intellij, I created a program that logs into the database and can access the table 'users' where accounts are stored. As of now, the user can create
a new log in and the information will be updated to the server. Soon, however, I will be implementing a way to log in where the program checks the inserted
log in information (i.e. username and password) by storing the values of the 'users' table into an array. Then, the inserted info is compared against the 
array. It will first check the usernames against the username array. IF and ONLY IF a username matches, it will then check passwords.
