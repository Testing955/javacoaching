package Inheritance;
public class Animalsuper
{
String colour = "white";
void eat()
{
System.out.println("eating.....");
}
}

class dog extends Animalsuper
{
String colour = "Black";
void displaycolouer()
{
System.out.println(super.colour);
}
void eat()
{
//System.out.println("eating a bread");
super.eat();
}
}
