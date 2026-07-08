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


    package test.loopingexamples;
import java.util.*;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num=s.nextInt();
		
		boolean isPrime=true;

        int i=2;
		
		while(i<num)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			
			i++;
			
		}
        if(isPrime)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}

	}

}
int j=num-1;
		
		while(j>=1)
		{
			int m=1;
			while(m<=num-j)
			{
				System.out.print("  ");
				
				m++;
			}
			
			int n=1;
            while(n<=2*j-1)
			{
				
				
				System.out.print("* ");
				
				n++;
			}
			
			
			System.out.print("\n");
			
			j--;
		}
		

	}

}
package test.mydiamondpattern;
import java.util.*;

public class DiamondPatternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter height of diamond");
		
		int num=s.nextInt();
		
		
		int i=1;
        while(i<=num)
		{
			int m=1;
			while(m<=num-i)
			{
				System.out.print("  ");
				
				m++;
			}
			
			int n=1;
			
			while(n<=2*i-1)
			{
				
				
				System.out.print("* ");
				
				n++;
			}
			
			
			System.out.print("\n");
			i++;
		}
        int j=num-1;
		
		while(j>=1)
		{
			int m=1;
			while(m<=num-j)
			{
				System.out.print("  ");
				
				m++;
			}
			
			int n=1;
			
			while(n<=2*j-1)
			{
				
				
				System.out.print("* ");
				
				n++;
			}
			
			
			System.out.print("\n");
			
			j--;
		}
		

	}

}

package test.arrayclassexamples;

public class Student {
	
	String firstName;
	String lastName;
	int age;
	String phoneNumber;
	
	public Student(String fName,String lName,int a,String phNo)
	{
		firstName=fName;
		lastName=lName;
		age=a;
		phoneNumber=phNo;
	}
	
	public String toString()
	{
		
		return "FirstName:"+firstName+",LastName:"+lastName+",Age:"+age+",PhoneNumber:"+phoneNumber;
	}

}

package test.arrayclassexamples;

import java.util.*;

public class ArrayExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=10*(i+1);
			
			System.out.println("Value in ["+i+"] is :"+arr[i]);
			
			
			
		}
		
		System.out.println("Value in 3rd position:"+arr[2]);
        System.out.println(arr);
        
        Student[] sArr=new Student[5];
        
        Scanner s=new Scanner(System.in);
         for(int i=0;i<sArr.length;i++)
        {
        System.out.println("Enter FirstName:");
        
        String fName=s.next();
        System.out.println("Enter LastName:");
        String lName=s.next();
        System.out.println("Enter Age:");
        int age=s.nextInt();
        System.out.println("Enter Phone Number");
        String phNo=s.next();
        
        Student s2=new Student(fName,lName,age,phNo);
        
        sArr[i]=s2;	
        	
        }
        
        for(int i=0;i<sArr.length;i++)
        {
        	System.out.println(sArr[i]);
        }
        
        
	}

}

package crick;

public class Array {
	public static void main(String[] args){
        String a[]={"jenish"};
		for(String d:a){
            System.out.println(d);
        }
    }
}

package arrays.examples.in;

public class Whilepractice {

    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int x=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("[ ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=x;
                x++;
                    System.out.print(" "+x+" " );
            }
            System.out.println(" ]\n");
        }
    }
}
   
package test.myinterfaces;

public interface Operators{

	int a=10;
	
	public void add();
	public void sub();
	
}
 
package test.myinterfaces;

public abstract class MyOperatorsAbstractClass {
	
	int a,b;
	
	
	public MyOperatorsAbstractClass(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public abstract void add();
	public abstract void sub();
	

	
	public void add(String str1,String str2)
	{
		System.out.println("Stack string concatenation is :"+str1+" "+str2);;
	}

}
