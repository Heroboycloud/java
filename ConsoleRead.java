public class ConsoleRead{
 public static void main(String[] args){

  String name = System.console().readLine("What is your name? "); 
  System.out.println("Hello, " + name.toUpperCase());
  System.out.println("Envirinment Path: " + System.getenv());

}

}
