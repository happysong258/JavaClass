package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names, "김");
        printArray(names); // 김길동, 김길서, 김길남, 김길북
    }

    private static void changeName(String[] names, String familyName) {
        for(int i=0; i<names.length; i++) {
            names[i] = familyName + names[i].substring(1);
            // 홍홍동 일때 김김동으로 바뀜 names[i] = names[i].replace('홍', '김');
        }
    }

    private static void printArray(String[] names) {
        for(String value : names) {
            System.out.println(value);
        }
    }


    private static void printArray(int[] intArr) {
        for(int value : intArr) {
            System.out.println(value);
        }
    }

    private static void add(int[] intArr, int num) {
        for(int i=0; i<intArr.length; i++)
            intArr[i] += num;
    }
}
