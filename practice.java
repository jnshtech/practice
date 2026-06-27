package oops.encapsulation;


class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;

    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
}
}
public class demo
{
    public static void main(String[] args)
    {
        Human hu = new Human();
        hu.setAge(19);
        hu.setName("karunya");
        System.out.println("age is " + hu.getAge());
        System.out.println("name is " + hu.getName());
    }
}


package oops.cat;

public class CatMain {
    public static void main(String[] args){
        Orange o=new Orange();
        System.out.println("hi "+o.type);
        Lion l=new Lion();
        System.out.println("lion is: "+l.type);
    }


}


package oops.cat;

public class DomesticCat extends Cat{
    String type="domestic";
    String color="any color";
}


package oops.cat;

public class Cat {
    int limbs=4;
}

package oops.ExampleStatic;
import java.util.Scanner;

public class CylinderMain {
    public static void main(String[] args){
        Cylinder c=new Cylinder();
        Scanner s=new Scanner(System.in);

        System.out.println("enter the radious: ");
        c.radious=s.nextFloat();
        System.out.println("Area is: "+c.area());

    }
}
package oops.ExampleStatic;

public class Cylinder {
       public static float pi=22/7f;
       public float radious;

       public float area(){
           radious=(Cylinder.pi*radious*radious);
           return radious;
       }
}




package oops.InerfaceExample;

interface Child1{
    void add(int a);
    void sub();
}


class Child implements Child1{
            @Override
            public void add(int a) {
                System.out.println("add");
            }

            @Override
            public void sub() {
                System.out.println("sub");
            }
        public static void main(String[] args){
                Child ch=new Child();
                ch.add(10);
                ch.sub();
        }

    }


