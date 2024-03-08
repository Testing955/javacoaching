package Inheritance;

class Bottle
{
void pen (int r)
{
System.out.println(r);
}
}

class car extends Bottle
{
void key(char p)
{
System.out.println(p);
}
}

class lion extends Bottle
{
void lunch(String z)
{
System.out.println(z);
}
}

public class Heirarchy 
{

public static void main(String[] args) 
{
//Bottle objbot = new Bottle();
car objca = new car();
lion objl = new lion();
objca.pen(1000);
objca.key('P');
objl.lunch("Prince");
objl.pen(200);




	}

}
