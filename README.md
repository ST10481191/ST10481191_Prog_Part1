Login System – Part 1 (PROG5121)
 Project Overview
This project is a console-based Java application that implements a registration and login system. The system allows a user to register by entering a username, password, and South African cell phone number, and then log in using those credentials.

The purpose of this project is to demonstrate:

Object-Oriented Programming (OOP)

Use of classes and methods

Input validation

Decision structures (if/else)

Console-based user interaction

 Technologies Used
Java (Apache NetBeans)

Console Application (no GUI)

 Project Structure
The project consists of the following files:

Login.java – Contains validation, registration, and login logic

Main.java – Handles user input and program execution

 Features Implemented
1. User Registration
Users are required to input:

Username

Password

South African cell phone number

2. Username Validation
The username must:

Contain an underscore (_)

Be no more than 5 characters long

Output:

Success: "Username successfully captured."

Failure: "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length."

3. Password Validation
The password must:

Be at least 8 characters long

Contain a capital letter

Contain a number

Contain a special character

Output:

Success: "Password successfully captured."

Failure: "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character."

4. Cell Phone Validation
The cell phone number must:

Include the South African international code (+27)

Be correctly formatted

Output:

Success: "Cell number successfully captured."

Failure: "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again."

5. Login Functionality
The system verifies the entered username and password against stored values.

Output:

Success: "Welcome , it is great to see you again."

Failure: "Username or password incorrect, please try again."

 Program Flow
User enters first name and last name

User registers with username, password, and phone number

System validates input

If valid, user details are stored

User attempts login

System checks credentials and returns a message

 Testing
Basic validation is performed using boolean methods:

checkUserName()

checkPasswordComplexity()

checkCellPhoneNumber()

These methods return true or false depending on whether the input meets the requirements.

 GitHub Commit History
The project includes a minimum of six commits as required:

Initial project setup in NetBeans

Created Login class and attributes

Implemented username validation method

Implemented password complexity validation

Implemented cell phone validation using regular expressions

Added registration and login functionality

📚 References (IIE Harvard Anglia Style)
Oracle. (2023) Java Documentation. Available at: https://docs.oracle.com/javase/8/docs/ (Accessed: 21 September 2026).

Oracle. (2023) Class Scanner. Available at: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html (Accessed: 21 September 2026).

GeeksforGeeks. (2023) Regular Expressions in Java. Available at: https://www.geeksforgeeks.org/regular-expressions-in-java/ (Accessed: 21 September 2026).

YouTube. (2020) JUnit Testing Tutorial. Available at: https://www.youtube.com/watch?v=MOhiM2SXZlo (Accessed: 21 September 2026).

YouTube. (2021) Java Maven and GitHub Setup. Available at: https://www.youtube.com/watch?v=oz0Qd5H4Onk(Accessed: 21 September 2026).

 Notes
This project uses a console-based interface only

No graphical user interface (GUI) components were used

The application follows the requirements provided in the assignment brief
