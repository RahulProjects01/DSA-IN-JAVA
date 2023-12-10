// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println("writing something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

// }

// class Student {
//     String name;
//     int age;

//     public void printName() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     // Student(){
//     // System.out.println("constructor called");
//     // }

//     // nornal constructor ------>

//     // Student(String name,int age){
//     // this.name = name;
//     // this.age = age;
//     // }

//     // COPY CONSTRUCTOR ----->

//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//     }

//     Student() {

//     }

//     public void printinfo(String name) {
//         System.out.println(name);
//     }

//     public void printinfo(int age) {
//         System.out.println(age);
//     }

//     public void printinfo(String name, int age) {
//         System.out.println(name + " " + age);
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {
//         // Pen pen1 = new Pen();
//         // pen1.color = "blue";
//         // pen1.type = "gel";

//         // Pen pen2 = new Pen();
//         // pen2.color = "black";
//         // pen2.type = "ballpoint";

//         // pen1.printColor();
//         // pen2.printColor();

//         // Student s1 = new Student();
//         // s1.name = "Rahul";
//         // s1.age = 21;
//         // s1.printName();

//         // Student s1 = new Student("Rahul",22);
//         // s1.printName();

//         Student s1 = new Student();
//         s1.name = "rrr";
//         s1.age = 23;

//         // Student s2 = new Student(s1);
//         // s1.printName();

//         s1.printinfo(s1.age,s1.name);
//     }
// }

// ====================================================================
// INHERETANCE --- >

// class Shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }
// class Tringle extends Shape{

//     public void area(int l,int h){
//         System.out.println(l/2*l*h);
//     }
// }

// class cercle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }

// public class OOPS{
//     public static void main(String[] args) {
//         Tringle t1 = new Tringle();
//         t1.color = "red";
//         // t1.age = "fds";
//     }
// }

// ====================================================================

// Abstract----->

// abstract class Animal {
//     abstract void walk();
//     public void eat(){
//         System.out.println("Animal eating");
//     }
// }

// class Horse extends Animal {
//     Horse(){
//         System.out.println("you are created horce comstructor");
//     }
//     public void walk() {
//         System.out.println("walks on 4 lags");
//     }
// }

// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }

// public class OOPS {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//         horse.eat();
//         Chicken chicken = new Chicken();
//         chicken.walk();
//     }
// }

// ================================================================
// 
// INTERFACE---->

interface Animal{
    int eyes = 2;
   public void walk();
}

interface Harbivore{

}
class Horse implements Animal,Harbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class OOPS {
    public static void main(String[] args) {
        
    }
}