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
