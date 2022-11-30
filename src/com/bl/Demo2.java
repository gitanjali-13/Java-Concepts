package com.bl;
// how to access instance and static variables

public class Demo2 {
    int a = 2;                    //Instance variables.
    int b = 3;
    static float n = 2f;

    void add() {
        System.out.println(a + b);// Instance method can access instance variables directly
    }

    static void sum(String str) {
        System.out.println(n + n);//static variable can access directly
        System.out.println(str);

    }

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.add();               //Instance method called by using reference variable of class.
        sum("addition");    //by passing parameter static method calling
        System.out.println(n); //directly static variable calling
        System.out.println(d2.a + " and " + d2.b); //instance variable calling by using object
    }
}

