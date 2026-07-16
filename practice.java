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

package test.myinterfaces;

public class MyOperatorsChildClass extends MyOperatorsAbstractClass{
	

	
	
	public MyOperatorsChildClass(int c,int d)
	{
		super(c,d);
	}
	
	public void add()
	{
		System.out.println("Parent a and b sum is :"+(a+b));
	}
	
	public void sub()
	{
		System.out.println("Parent a and b sub is :"+(a-b));
	}
	
	public void add(int e,int f)
	{
		System.out.println("Stack integer sum is :"+(e+f));
	}

}
package test.myexceptionexamples;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=5;
		String str="10";
		
		DateClass dc=null;
		
		int[] arr=new int[5];
		try
		{
		int c=a/b;
		System.out.println("The divident is :"+c);
		
		
		arr[3]=25;
		int d=Integer.parseInt(str);
		
		dc=DateClass.createDate(28, 2, 2026);
		
		dc.getDay();
		
		System.out.println("Converted number is :"+d);
		}
		catch(ArithmeticException ae)
		{
			System.err.println("B cannot be zero. Cannot divide by zero");
		}
		catch(NumberFormatException nfe)
		{
			System.err.println("String :"+str+" . cannot be converted to number");
		}
		catch(NullPointerException ne)
		{
			System.err.println("Date object is null");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.err.println("Index cannot be greater than :"+(arr.length-1));
			
		}
		catch(Exception e)
		{
			
		}
		finally 
		{
			System.out.println("Connection closed");
		}
		
	}

}
public class ForLoopExample {
      public static void main(String[] args){
          Scanner s=new Scanner(System.in);

          String str=s.nextLine();
          String reverse="";

          for(int i=str.length()-1;i>=0;i--)
          {
              reverse+=str.charAt(i);
              System.out.println("acsii code "+i+" is :"+str.codePointAt(i)+reverse);
          }
          if(str.equals(reverse))
          {
              System.out.println(str+" is a palindrom");
          }
          else {
              System.out.println(str+" is not a palindrom");
          }
    }
}