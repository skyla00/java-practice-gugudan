package com.codestates.seb.gugudan;

public class Main {
    public static void main(String[] args) {
        gugudan gugudan = new gugudan();
        int danNumber = gugudan.selectDan();
        System.out.println(danNumber +"단이 입력되었습니다.");
        gugudan.calculation(danNumber);
    }
}
