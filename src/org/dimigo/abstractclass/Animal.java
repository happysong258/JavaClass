package org.dimigo.abstractclass;

public abstract class Animal {
    public void eat()
    {
        System.out.println("냠냠");
    }

    // 반드시 오버라이딩 강제화!
    // javaproject 아이폰 갤럭시할때 pay 빈거랑 관련이 있음
    // 메소드가 abstract면 class도 abstract여야함 근데 반대는 상관없음
    public abstract void bark();
}
