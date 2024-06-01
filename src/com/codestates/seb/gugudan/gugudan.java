package com.codestates.seb.gugudan;
import java.util.Scanner;

public class gugudan {

    Scanner sc = new Scanner(System.in);
    final int MIN_GUGUDAN = 2;
    final int MAX_GUGUDAN = 9;

  // 사용자 입력을 받기 위한 안내 문구
  public void StartMessage() {
    System.out.printf("[안내]희망하는 구구단을 숫자로 입력해주세요. (2 ~ 9) : ");
  }
  
  private int inputDanNumber() {
    int menuNumber = Integer.parseInt(sc.nextLine());
    return menuNumber;
  }

  private void printExceptionMessage() {
    System.out.println("[경고] 구구단은 2단 ~ 9단까지만 선택할 수 있습니다.");
    System.out.println("[경고] 다시 입력해주세요.");
  }

  public int selectDan() {
    int danNumber = 0;
    do {
      StartMessage();
      danNumber = inputDanNumber();
      if (danNumber < MIN_GUGUDAN || danNumber > MAX_GUGUDAN ) {
        printExceptionMessage();
      }
    } while (danNumber < MIN_GUGUDAN || danNumber > MAX_GUGUDAN );
    return danNumber;
  }

  public void calculation(int dan) {
    for (int i = 1; i <= 9; i ++) {
      System.out.println(dan + "*" + i + "=" + dan*i);
    }
  }
}
