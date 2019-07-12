package org.dimigo.oop;

public class Calculator {
    /* 인스턴스 필드 (static이 없는 필드) (객체화 해야 쓸 수 있는 필드) */
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator() {}

    public Calculator(int num1, int num2) {
        this.num1 = num1; //this는 객체자신을 의미함
        this.num2 = num2;
    }

    /* 인스턴스 메소드 */
    public void powerOn() {
        if(!this.powerFlag) { //if(powerFlag == false) 명시적으로 this쓰임
            System.out.println("전원을 켭니다.");
            this.powerFlag = true;
        }
    }
    public void powerOff() {
        if (this.powerFlag) {
            System.out.println("전원을 끕니다.");
            this.powerFlag = false;
        }
    }
    public int add() {
        this.powerOn(); // 같은 인스턴스 필드, 또 다른 인스턴스필드 호출시 this쓰임
        return this.num1+this.num2;
    }
    public int sub() {
        this.powerOn();
        return this.num1-this.num2;
    }
    public int mul() {
        this.powerOn();
        return this.num1*this.num2;
    }
    public double div() {
        this.powerOn();
        return (double)this.num1/this.num2;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Calculator c = new Calculator(a,b);

        //c.powerOn();
        System.out.printf("%d + %d = %d\n", a,b,c.add());   // 반드시 c.add(0),  add(x)
        System.out.printf("%d - %d = %d\n", a,b,c.sub());
        System.out.printf("%d * %d = %d\n", a,b,c.mul());
        System.out.printf("%d / %d = %.1f\n", a,b,c.div());
        c.powerOff();
    }
}
