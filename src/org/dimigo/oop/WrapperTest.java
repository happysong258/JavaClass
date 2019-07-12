package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : primitmive Type을 Wrapping해주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        // Boxing (Primitive Type -> Wrapper 객체)
        Integer i1 = new Integer(100); // integer i1 = 1000;
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2); // false, 객체가 다르기 때문
        System.out.println(i1.equals(i2)); // true

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double d1 = Double.valueOf(3.14);

        // Unboxing (Wrapper 객체 -> Primitive Type)
        int r1 = i1.intValue();
        double r2 = d1.doubleValue();

        //문자열 -> 해당되는 Primitive Type
        int r3 = Integer.parseInt("300");
        double r4 = Double.parseDouble("3.14");

        // 100 + 200 = 300
        System.out.println(args[0]); // "100"
        System.out.println(args[1]); // "200"
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n", a1, a2, a1+a2);

        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);
        System.out.println(obj1+obj2);

        Integer a = 1000;   //Autoboxing
        int b = a + 100;    //Autounboxing

        // Autoboxing, Autounboxing이 총 몇번 일어날까?
        Integer c = 10; // Autoboxing 1 , Autounboxing 0
        Integer d = c+20; // Autoboxing 1, Autounboxing 1
        Integer result = c+d; // Autoboxing 1, Autounboxing 2
        // 총 Autoboxing 3번, Autounboxing 3번
    }
}
