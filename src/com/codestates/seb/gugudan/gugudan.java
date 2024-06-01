package com.codestates.seb.gugudan;
import java.util.Scanner;

public class gugudan {
  public static void main(String[] args) {
    //TODO:
    // 0. 구구단을 정의하기 전 구구단 연산을 위한 변수를 선언합니다.
    // 클래스에 포함된 메서드를 활용하기 위해 객체 생성
    // Scanner(클래스명) s(변수명) = new(객체 생성을 위한 키워드) Scanner(클래스명)(System.in);
    // 사용자 입력을 받기 위한 안내 문구
    // 입력받은 값을 출력합니다.

    // 2. 구구단은 2단에서 9단까지만 가능합니다.
    // 조건 1. 입력값이 min_gugudan(2)보다 작다.
    // 조건 2. 입력값이 max_gugudan(9)보다 크다.
    // 두 조건이 모두 참 인 경우를 판단하여 [경고] 문구 출력(OR 연산자 활용)

    gugudan gugudan = new gugudan();

    int danNumber = gugudan.selectDan();
    System.out.println(danNumber +"단이 입력되었습니다.");
    gugudan.calculation(danNumber);
  }

  Scanner sc = new Scanner(System.in);
  // 1. 단을 입력합니다.
  public void StartMessage() {
    System.out.printf("[안내]희망하는 구구단을 숫자로 입력해주세요. (2 ~ 9) : ");
  }
  private int inputDanNumber() {
    int menuNumber = Integer.parseInt(sc.nextLine());
    return menuNumber;
  }
  // 오류 검증.
  private void printExceptionMessage() {
    System.out.println("[경고] 구구단은 2단 ~ 9단까지만 선택할 수 있습니다.");
    System.out.println("[경고] 다시 입력해주세요.");
  }
  public int selectDan() {
    int danNumber = 0;
    do {
      StartMessage();
      danNumber = inputDanNumber();
      if (danNumber < 2 || danNumber > 9 ) {
        printExceptionMessage();
      }
    } while (danNumber < 2 || danNumber > 9);
    return danNumber;
  }

  public void calculation(int dan) {
    for (int i = 1; i <= 9; i ++) {
      System.out.println(dan + "*" + i + "=" + dan*i);
    }
  }
}
