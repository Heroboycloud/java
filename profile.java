/* This java program creates a user profile and saves it into a text file
* Parameters include name, age, email, phone number
*/
// First things First, import textio

import textio.TextIO;
public class profile{ // profile class

public static void main(String[] args){ // Main function to run program
String name; // user name
String email; // user email
String phone_num; // user phone number
int age; // user age
double salary; // user salary

TextIO.putln("Welcome to Profile creator");
TextIO.putln("Please fill your Profile======");
TextIO.putln();


TextIO.put("Name: ");
name= TextIO.getln();

TextIO.put("Age: ");
age= TextIO.getlnInt();

TextIO.put("Salary: ");
salary= TextIO.getlnDouble();

TextIO.put("Phone number: ");
phone_num= TextIO.getln();

TextIO.put("Email: ");
email= TextIO.getln();

TextIO.put("Thanks for filling Information... ");

/* Now, write to File */

TextIO.writeFile(name + ".txt");
TextIO.putln("Name: " + name);
TextIO.putln("Age: " + age);
TextIO.putln("Salary: " + salary);
TextIO.putln("Email: " + email);
TextIO.putln("Phone no: " + phone_num);

TextIO.writeStandardOutput();
TextIO.put("Thank you!!!!");

}




}
