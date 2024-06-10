/* A java pr9gram to calculate interest
* params include principal, rate and time
*/
import java.util.Scanner;
import java.util.Random;

public class Interest{
// whatever bro
/* 
Thjs is java i mean what could go wrong??

*/
public static void Randomize(int s){
Random random = new Random();
int no= random.nextInt(s) + 1;
System.out.println("Random number: " + no);

}


public static void findInterest(float principal, int rate, int time){
/*float principal;
int rate;
int time;
*/
float interest;
interest =  principal * rate * time;

System.out.print("The Interest is $");
System.out.println(interest/100);

}


public static void Goodbye(){
System.out.println("Goodbye!! Thanks fot using the app...");
}


public static void main(String[] args){
Scanner in = new Scanner(System.in);
float principal;
int rate;
int time;
//float interest;

System.out.println("=======Interest Calculator in java======");
System.out.print("Enter principal: ");
principal =  in.nextInt();
System.out.print("Enter Rate: ");
rate =  in.nextInt();
System.out.print("Enter time: ");
time =  in.nextInt();

findInterest(principal,rate,time);
System.out.println("Hey, Enter your numbet: ");
int r_no= in.nextInt();
Randomize(r_no);
Goodbye();

}


}
