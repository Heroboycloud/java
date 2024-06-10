import textio.TextIO;

public class Hello{
public static void main(String[] args) {
String username;

String greet;

greet="Hello ";
TextIO.put("Enter your name > ");
username= TextIO.getlnString();
TextIO.put(greet);
TextIO.putln(username);
}
}
