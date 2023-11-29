// prime number

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number");
//         int n= sc.nextInt();
//         int flag=0;

//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==0)
//             System.out.println("prime number");
//         else
//         {
//             System.out.println("not prime number");
//         }

//     }
// }
// --------------------------------------------------------------------------------
// 1-100 prime number

// public class Main {
//     public static void main(String[] args) {
//         for(int j=1;j<=100;j++)
//         {
//             int flag=0;
//             for (int i = 2; i < j; i++)
//             {
//                 if (j % i == 0) {
//                     flag = 1;
//                     break;
//                 }
//             }
//             if (flag == 0)
//                 System.out.print(j+" ");
//         }
//     }
// }
// --------------------------------------------------------------------------------
// armstrong number

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number");
//         int n= sc.nextInt();
//         int b=n;
//         int rem;
//         int rev=0;

//         while(n>0)
//         {
//             rem=n%10;
//             rev=rev+rem*rem*rem;
//             n=n/10;
//         }
//         System.out.println(rev);

//         if(b==rev)
//             System.out.println("it is armstrong number");
//         else
//             System.out.println("it is not armstrong number");
//     }
// }
// ----------------------------------------------------------------------------
// 1)
// Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
// lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or
// 7. Provide a valid car number, Fails to provide a valid input then display that number is not a
// valid car number.
// Note : The input other than 4 digit positive number[includes negative and 0] is considered as
// invalid.
// Refer the samples, to read and display the data.
// Sample Input 1:
// Enter the car no:1234
// Sample Output 1:
// Lucky Number
// Sample Input 2:
// Enter the car no:1214
// Sample Output 2:
// Sorry its not my lucky number
// Sample Input 3:
// Enter the car no:14
// Sample Output 3:
// 14 is not a valid car number

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the car number");
//         int n=sc.nextInt();
//         int rem;
//         int total=0;


//         if(n<1000 || n>9999)
//         {
//             System.out.println(n+ " is not a valid car number");
//         }
//         else
//         {
//             while(n>0)
//             {
//                 rem=n%10;
//                 total=total+rem;
//                 n=n/10;
//             }
//             if (total % 3 == 0 || total % 5 == 0 || total % 7 == 0)
//             {
//                 System.out.println("Lucky Number");
//             }
//             else
//             {
//                 System.out.println("Sorry its not my lucky number");
//             }
//         }
//     }
// }
// ---------------------------------------------------------------------------------
// 2)
// XYZ Technologies is in the process of increment the salary of the employees. This
// increment is done based on their salary and their performance appraisal rating.
// If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
// If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
// If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
// Help them to do this, by writing a program that displays the incremented salary. Write a
// class “IncrementCalculation.java” and write the main method in it.
// Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to
// 5 (inclusive), then the output should be “Invalid Input”.
// Sample Input 1 :
// Enter the salary
// 8000

// Enter the Performance appraisal rating
// 3
// Sample Output 1 :
// 8800
// Sample Input 2 :
// Enter the salary
// 7500
// Enter the Performance appraisal rating
// 4.3
// Sample Output 2 :
// 9750
// Sample Input 3 :
// Enter the salary
// -5000
// Enter the Performance appraisal rating
// 6
// Sample Output 3 :
// Invalid Input

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the salary");
//         int salary=sc.nextInt();

//         System.out.println("Enter the Performance appraisal rating");
//         double a= sc.nextDouble();

//         if(a<1 || a>5 || salary<1)
//         {
//             System.out.println("invalid input");
//         }
//         else if(a>=1 && a<=3 )
//         {
//            salary=salary+(int)(0.1*salary);
//             System.out.println(salary);
//         }
//         else if(a>=3.1 && a<=4 )
//         {
//             salary=salary+(int)(0.25*salary);
//             System.out.println(salary);
//         }
//         else
//         {
//             salary=salary+(int)(0.3*salary);
//             System.out.println(salary);
//         }
//     }
// }
// ---------------------------------------------------------------------------------
// 3)
// Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
// to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
// Tanul should say “Palindrome”. If not, he should say “Not a Palindrome”. If the number is
// negative, print “Invalid Input”. Help Tanul by writing a program.
// Sample Input 1 :
// 21212
// Sample Output 1 :
// Palindrome
// Sample Input 2 :
// 6186

// Sample Output 2 :
// Not a Palindrome


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n= sc.nextInt();
//         int b=n;

//         if(n<0)
//         {
//             System.out.println("invalid input");
//         }
//         else {
//             int flag=0;
//             int rem;
//             int rev=0;
//             while (n > 0)
//             {
//                 rem = n % 10;
//                 rev = rev * 10 + rem;
//                 n = n / 10;
//             }

//             if (b == rev)
//                 System.out.println("palindrome");
//             else
//                 System.out.println("not a palindrome");
//         }
//     }
// }
// ----------------------------------------------------------------------------------
// 4)
// Problem Statement – To speed up his composition of generating unpredictable rhythms,
// Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help
// him out?
// Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
// Note
// Input 1 should be lesser than Input 2. Both the inputs should be positive.
// Range must always be greater than zero.
// If any of the condition mentioned above fails, then display “Provide valid input”
// Use a minimum of one for loop and one while loop
// Sample Input 1:
// 2
// 15
// Sample Output 1:
// 2 3 5 7 11 13
// Sample Input 2:
// 8
// 5
// Sample Output 2:
// Provide valid input

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a= sc.nextInt();
//         System.out.println("Enter first number");
//         int b= sc.nextInt();

//         if(a>=b || a<0 || b<0)
//         {
//             System.out.println("Provide valid input");
//         }
//         else {
//             for(int i=a;i<=b;i++)
//             {
//                 int flag=0;
//                 int j=2;
//                 while (j<i)
//                 {
//                     if(i%j==0)
//                     {
//                         flag=1;
//                         break;
//                     }
//                     j++;
//                 }
//                 if(flag==0)
//                     System.out.print(i+" ");
//             }
//         }
//     }
// }
// ---------------------------------------------------------------------------------
// 5)
// Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
// lesson on seasons. When her teacher tells a month, she needs to say the season
// corresponding to that month. Write a program to solve the above task.
// Spring – March to May,
// Summer – June to August,
// Autumn – September to November and,
// Winter – December to February.
// Month should be in the range 1 to 12. If not the output should be “Invalid month”.

// Sample Input 1:
// Enter the month:11
// Sample Output 1:
// Season:Autumn
// Sample Input 2:
// Enter the month:13
// Sample Output 2:
// Invalid month

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the month");
//         int n= sc.nextInt();

//         if(n<1 || n>12)
//         {
//             System.out.println("invalid month");
//         }
//         else
//         {
//             if(n>=3 && n<=5)
//             {
//                 System.out.println("Spring");
//             }
//             else if(n>=6 && n<=8)
//             {
//                 System.out.println("Summer");
//             }
//             else if(n>=9 && n<=11)
//             {
//                 System.out.println("Autumn");
//             }
//             else
//             {
//                 System.out.println("Winter");
//             }
//         }
//     }
// }
// --------------------------------------------------------------------------------
// 6)
// In a theater, there is a discount scheme announced where one gets a 10% discount
// on the total cost of tickets when there is a bulk booking of more than 20 tickets, and
// a discount of 2% on the total cost of tickets if a special coupon card is submitted.
// Develop a program to find the total cost as per the scheme. The cost of the k class
// ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an
// additional of Rs. 50 per member.
// Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a
// time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a
// value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
// The ticket cost should be printed exactly to two decimal places.
// Sample Input 1:
// Enter the no of ticket:35
// Do you want refreshment:y
// Do you have coupon code:y
// Enter the circle:k
// Sample Output 1:
// Ticket cost:4065.25
// Sample Input 2:
// Enter the no of ticket:1
// Sample Output 2:
// Minimum of 5 and Maximum of 40 Tickets

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of ticket");
//         int ticket= sc.nextInt();

//         if(ticket<5 || ticket>40)
//         {
//             System.out.println("Minimum of 5 and Maximum of 40 Tickets");
//         }
//         else
//         {
//             System.out.println("Do you want refreshment");
//             char refresh=sc.next().charAt(0);
//             System.out.println("Do you have coupon code");
//             char coupon=sc.next().charAt(0);
//             System.out.println("Enter the circle");
//             char circle=sc.next().charAt(0);

//             double totalcost=0.0;
//             if(circle=='k')
//             {
//                 totalcost=75*ticket;
//             }
//             else if(circle=='q')
//             {
//                 totalcost=150*ticket;
//             }
//             else {
//                 System.out.println("Invalid Input");
//                 return;
//             }

//             if(ticket>20)
//             {
//                 totalcost=totalcost-(0.1*totalcost);
//             }
//             if(coupon=='y')
//             {
//                 totalcost=totalcost-(0.02*totalcost);
//             }
//             if(refresh=='y')
//             {
//                 totalcost=totalcost+(50.0*ticket);
//             }
//             System.out.println("Ticket cost:"+totalcost);
//         }
//     }
// }
// ---------------------------------------------------------------------------------
// 7)
// Problem Statement – FOE college wants to recognize the department which has
// succeeded in getting the maximum number of placements for this academic year.
// The departments that have participated in the recruitment drive are CSE,ECE,
// MECH. Help the college find the department getting maximum placements. Check
// for all the possible output given in the sample snapshot
// Note : If any input is negative, the output should be “Input is Invalid”. If all
// department has equal number of placements, the output should be “None of the
// department has got the highest placement”.
// Sample Input 1:
// Enter the no of students placed in CSE:90
// Enter the no of students placed in ECE:45
// Enter the no of students placed in MECH:70
// Sample Output 1:
// Highest placement
// CSE
// Sample Input 2:
// Enter the no of students placed in CSE:55
// Enter the no of students placed in ECE:85
// Enter the no of students placed in MECH:85
// Sample Output 2:
// Highest placement
// ECE
// MECH
// Sample Input 3:
// Enter the no of students placed in CSE:0
// Enter the no of students placed in ECE:0
// Enter the no of students placed in MECH:0
// Sample Output 3:

// None of the department has got the highest placement
// Sample Input 4:
// Enter the no of students placed in CSE:10
// Enter the no of students placed in ECE:-50
// Enter the no of students placed in MECH:40
// Sample Output 4:
// Input is Invalid

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of students placed in CSE");
//         int cs= sc.nextInt();
//         System.out.println("Enter the no of students placed in ECE");
//         int ec= sc.nextInt();
//         System.out.println("Enter the no of students placed in MECH");
//         int me= sc.nextInt();

//         if(cs<0 || ec<0 || me<0)
//         {
//             System.out.println("Input is Invalid");
//         }
//         else if(cs==ec && ec==me)
//         {
//             System.out.println("None of the department has got the highest placement");
//         }
//         else if(cs>ec && cs>me)
//         {
//             System.out.println("CSE");
//         }
//         else if(me>ec && me>cs)
//         {
//             System.out.println("MECH");
//         }

//         else if(cs<ec && cs<me && ec==me)
//         {
//             System.out.println("ECE");
//             System.out.println("MECH");
//         }
//         else if(me<ec && me<cs && ec==cs)
//         {
//             System.out.println("ECE");
//             System.out.println("CSE");
//         }
//         else if(ec<me && ec<cs && me==cs)
//         {
//             System.out.println("MECH");
//             System.out.println("CSE");
//         }
//         else
//         {
//             System.out.println("ECE");
//         }
//     }
// }
// ----------------------------------------------------------------------------------

// 8)
// Problem Statement – Ritik wants a magic board, which displays a character for a
// corresponding number for his science project. Help him to develop such an
// application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be
// displayed.
// [Assume the number of inputs should be always 4 ]
// Sample Input 1:
// Enter the digits:
// 65
// 66
// 67
// 68
// Sample Output 1:
// 65-A
// 66-B
// 67-C
// 68-D
// Sample Input 2:
// Enter the digits:
// 115
// 116
// 101
// 112
// Sample Output 2:
// 115-s
// 116-t
// 101-e
// 112-p

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter digits");
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int c= sc.nextInt();
//         int d= sc.nextInt();
//         char p=(char)a;
//         char q=(char)b;
//         char r=(char)c;
//         char s=(char)d;
//         System.out.println(a+"-"+p);
//         System.out.println(b+"-"+q);
//         System.out.println(c+"-"+r);
//         System.out.println(d+"-"+s);
//     }
// }
// -------------------------------------------------------------------------------
// 9)
// Vohra went to a movie with his friends in a Wave theatre and during break time he
// bought pizzas, puffs and cool drinks. Consider the following prices :
// Rs.100/pizza
// Rs.20/puffs
// Rs.10/cooldrink
// Generate a bill for What Vohra has bought.
// Sample Input 1:
// Enter the no of pizzas bought:10
// Enter the no of puffs bought:12
// Enter the no of cool drinks bought:5
// Sample Output 1:
// Bill Details
// No of pizzas:10
// No of puffs:12
// No of cooldrinks:5
// Total price=1290
// ENJOY THE SHOW!!!

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of pizzas bought");
//         int a= sc.nextInt();
//         System.out.println("Enter the no of puffs bought");
//         int b= sc.nextInt();
//         System.out.println("Enter the no of drinks bought");
//         int c= sc.nextInt();

//         int total=a*100+b*20+c*10;
//         System.out.println("Bill Details:");
//         System.out.println("No of pizzas:"+a);
//         System.out.println("No of puffs:"+b);
//         System.out.println("No of colddrinks:"+c);
//         System.out.println("total price="+total);
//         System.out.println("ENJOY THE SHOW!!!");
//     }
// }
// ---------------------------------------------------------------------------------
// 10)
// Problem Statement – Write a program to calculate the fuel consumption of your
// truck.The program should ask the user to enter the quantity of diesel to fill up the
// tank and the distance covered till the tank goes dry.Calculate the fuel consumption
// and display it in the format (liters per 100 kilometers).
// Convert the same result to the U.S. style of miles per gallon and display the result. If
// the quantity or distance is zero or negative display ” is an Invalid Input”.
// [Note: The US approach of fuel consumption calculation (distance / fuel) is the
// inverse of the European approach (fuel / distance ). Also note that 1 kilometer is
// 0.6214 miles, and 1 liter is 0.2642 gallons.]
// The result should be with two decimal place.To get two decimal place refer the
// below-mentioned print statement :

// float cost=670.23;
// System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);
// Sample Input 1:
// Enter the no of liters to fill the tank
// 20
// Enter the distance covered
// 150
// Sample Output 1:
// Liters/100KM
// 13.33
// Miles/gallons
// 17.64
// Explanation:
// For 150 KM fuel consumption is 20 liters,
// Then for 100 KM fuel consumption would be (20/150)*100=13.33,
// Distance is given in KM, we have to convert it to miles (150*0.6214)=93.21,
// Fuel consumption is given in liters, we have to convert it to gallons
// (20*0.2642)=5.284,
// Then find (miles/gallons)=(93.21/5.284)=17.64
// Sample Input 2:
// Enter the no of liters to fill the tank
// -5
// Sample Output 2:
// -5 is an Invalid Input
// Sample Input 3:
// Enter the no of liters to fill the tank
// 25
// Enter the distance covered
// -21

// Sample Output 3:
// -21 is an Invalid Input


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of liters to fill the tank");
//         int a= sc.nextInt();
//         System.out.println("Enter the distance covered");
//         int b= sc.nextInt();

//         if(a<=0)
//         {
//             System.out.println(a+" is an Invalid Input");
//         }
//         else if(b<=0)
//         {
//             System.out.println(b+" is an Invalid Input");
//         }
//         else {
//             float km = (float)a*100/b;
//             float miles = (b * 0.6214f);
//             float gallons = a * 0.2642f;
//             float gall = (miles / gallons);
//             System.out.printf("Liters/100KM=%.2f %n", km);
//             System.out.printf("Miles/gallons=%.2f ", gall);
//         }
//     }
// }
// ----------------------------------------------------------------------------------








































