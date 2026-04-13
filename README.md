# ST10520375
This is my PoE- PROG5121

---

1) What is this project?

This is my POE (Portfolio of Evidence) for my PROG5121 (part 1). I had to make a user registration and login system using Java.
The system needs to check if usernames are correct , passwords are strong enough and cell phone numbers have the right format.

---

2) What my program does

When you run my program , it will do the following:

1. Ask for your first name and last name
2. Ask you to create a username
3. Ask you to create a password
4. Ask for your cell phone number
5. Check if everything is correct
6. If it is correct , it saves your details
7. Then it asks you to login with your username and password
8. If you type the right details , it says welcome with your name

---

3) The rules my program checks

	Username rules:
- Must contain an underscore (_)
- Must be 5 characters or less
- Example of good username: "jo_sm"
- Example of bad username: "johnsmith" (no underscore)

	Password rules:
- Must be at least 8 characters long
- Must have at least 1 capital letter
- Must have at least 1 number
- Must have at least 1 special character (! @ # $ % & *)
- Example of good password: "Pass123!"
- Example of bad password: "password" (no capital , no number , no special)

	Cell phone rules:
- Must start with + (international code)
- Must have numbers after the +
- Example of good phone: "+27731234567"
- Example of bad phone: "0831234567" (no + at start)

---

4) Example of my program working

	When you do everything right, this will show:
==============================
USER REGISTRATION SYSTEM
==============================
Enter first name: Nkululeko
Enter last name: Mahlangu
Create username (must have _ and be 5 or less chars): nkule_
Create password (8+ chars, 1 capital, 1 number, 1 special): Nkulee123!
Enter cell number (must start with + like +27731234567): +27731234567

	--- REGISTRATION RESULT ---
Username successfully captured.
Password successfully captured.
Cell phone number successfully added.

	--- LOGIN ---
Enter username: nkule_
Enter password: Nkulee123!

	--- LOGIN RESULT ---
Welcome Nkululeko Mahlangu it is great to see you again.

	When you make a mistake with username:
Create username (must have _ and be 5 or less chars): nkululekomah

	--- REGISTRATION RESULT ---
Username is not correctly formatted , please ensure that your username contains an underscore 
and is no more than five characters in length.

	When you make a mistake with password:
Create password (8+ chars, 1 capital, 1 number, 1 special): password

	--- REGISTRATION RESULT ---
Password is not correctly formatted; please ensure that the password contains at least eight 
characters , a capital letter , a number and a special character.

	When you make a mistake with cell phone:
Enter cell number (must start with + like +27731234567): 0831234567

	--- REGISTRATION RESULT ---
Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.


---

	What I learned from this project

1. How to use loops - I used for loops many times to check characters in strings
2. How to use if statements - I used if statements to check if things were true or false
3. How to make methods - I learned to break my code into small methods that each do one thing
4. How to use Scanner - I learned how to get input from the user
5. How to use GitHub - I learned how to upload my code and save different versions
6. How to test my code - I learned to test with good inputs and bad inputs

---

THANK YOU!
