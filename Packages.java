package com.company;

class A {
    public int x = 5;
    protected int y = 77;
    int z = 19;
    private int a = 6;

    public void methA() {
        System.out.println("\nAccessing the properties from the same class: ");
        System.out.println("Public = " + x);
        System.out.println("Protected = " + y);
        System.out.println("Default = " + z);
        System.out.println("Private = " + a);
    }
}

class B extends A {

    public void methB() {
        System.out.println("\nAccessing the properties from the sub-class in the same package: ");
        System.out.println("Public = " + x);
        System.out.println("Protected = " + y);
        System.out.println("Default = " + z);
    //  System.out.println(a);
    }
}

public class Packages {

    public int x = 5;
    protected int y = 77;
    int z = 19;
    private int a = 6;

    public static void main(String[] args) {

        /*  	  Modifiers	  Class		     Package	     Sub-class	       	      World
		   
		   Public	    Y			Y		 Y			Y
		   Protected	    Y			Y		 Y			N
		   Default	    Y			Y		 N			N
		   Private	    Y    		N		 N			N		 */

        A a = new A();
        a.methA();

        B b = new B();
        b.methB();

        System.out.println("\nAccessing the properties of a class form another class but in the same package:  ");
        System.out.println("Public = " + a.x); // x is Public
        System.out.println("Protected = " + a.y); // y is Protected
        System.out.println("Default = " + a.z); // z is Default
        // System.out.println(a.a); // a is Private

    }
}
