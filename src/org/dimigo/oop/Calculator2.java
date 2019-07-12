package org.dimigo.oop;

public class Calculator2 {

    private boolean powerFlag;
    public static double PI = 3.141592;

    /* 인스턴스 메소드 */
    public void powerOn() {
        if(!powerFlag) { //if(powerFlag == false) 명시적으로 this쓰임
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        }
    }
    public void powerOff() {
        if (this.powerFlag) {
            System.out.println("전원을 끕니다.");
            this.powerFlag = false;
        }
    }
    public static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1-num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1*num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1/num2;
    }
}