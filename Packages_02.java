package com2.company2;

import com.company.Packages;

class C extends Packages {

    /* class 'C' inherits class 'Packages' which is in other package.
       So, 'C' can access only Public and Protected methods/properties of 'Packages' and not Default & Private.
     */

    public void me2() {
        System.out.println("\nAccessing the properties from sub-class but from another package:");
		System.out.println("Public = " +x); // x is Public
		System.out.println("Protected = " +y); // y is Protected
	//	System.out.println(z); // z is Default
	//	System.out.println(a); // a is Private
	}
}

public class Packages_02 {
    public static void main(String[] args) {

        /* -class 'Packages' & class 'Packages_02' are both in different packages.
           -I've imported 'Packages.class' here in this code.
           -And I've made an object of that class.
           -If I try and access the properties/methods of 'Packages' here in 'Packages_02',
            I can access only Public properties/methods of 'Packages'.
           -And I cannot access Protected, Default & Private properties/methods of 'Packages'
            here in 'Packages_02'.
         */

        Packages a2 = new Packages();
        System.out.println("\nAccessing the properties from Java world i.e. from another package:");
        System.out.println("Public = " + a2.x); // x is Public
    //  System.out.println(a2.y); // y is Protected
    //  System.out.println(a2.z); // z is Default
    //  System.out.println(a2.a); // a is Private

        C c = new C();
        c.me2();
    }
}
