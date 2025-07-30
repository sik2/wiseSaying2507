package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    int lastId = 0;
    List<WiseSaying> wiseSayingList = new ArrayList<>();

    void run () {
      System.out.println("== 명언 앱 ==");

      while (true) {
          System.out.print("명령) ");
          String cmd = scanner.nextLine().trim();

          if (cmd.equals("종료")) {
              System.out.println("프로그램을 종료합니다.");
              break;
          } else  if (cmd.equals("등록")) {
            actionWrite();
          } else if (cmd.equals("목록")) {
              actionList();
          }
      }

      scanner.close();
    }

    void actionWrite() {
        System.out.print("명언: ");
        String content = scanner.nextLine().trim();

        System.out.print("작가: ");
        String author = scanner.nextLine().trim();

        WiseSaying wiseSaying = write(author, content);

        System.out.println("%d번 명언이 등록되었습니다.".formatted(wiseSaying.getId()));
    }

    WiseSaying write (String author, String content) {
        WiseSaying wiseSaying = new WiseSaying(++lastId, author, content );

        wiseSayingList.add(wiseSaying);

        return wiseSaying;
    }

    void actionList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        for (int i = wiseSayingList.size() - 1; i >=0; i--) {
            WiseSaying wiseSaying = wiseSayingList.get(i);
            System.out.println("%d / %s / %s".formatted(wiseSaying.getId(), wiseSaying.getId(), wiseSaying.getContent()));
        }
    }
}
