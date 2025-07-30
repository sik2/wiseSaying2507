package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        int lastId = 0;
        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else  if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String wiseSayingContent = scanner.nextLine().trim();

                System.out.print("작가: ");
                String wiseSayingAuthor = scanner.nextLine().trim();

                int id = ++lastId;

                WiseSaying wiseSaying = new WiseSaying();

                wiseSaying.id = id;
                wiseSaying.author = wiseSayingAuthor;
                wiseSaying.content = wiseSayingContent;

                System.out.println("wiseSaying.id" + wiseSaying.id);
                System.out.println("wiseSaying.author" + wiseSaying.author);
                System.out.println("wiseSaying.content" + wiseSaying.content);

                System.out.println("%d번 명언이 등록되었습니다.".formatted(id) );
            }
        }

        scanner.close();
    }
}
