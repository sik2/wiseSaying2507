package com.ll.domain.wiseSaying;

import com.ll.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    int lastId = 0;
    private  final List<WiseSaying> wiseSayingList = new ArrayList<>();

    public List<WiseSaying> getWiseSayingList() {
        return wiseSayingList;
    }

    public void delete(WiseSaying wiseSaying) {
        wiseSayingList.remove(wiseSaying);
    }

    void modify(WiseSaying wiseSaying, String content, String author) {
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);
    }

    WiseSaying findById(int id) {
        return wiseSayingList.stream()
                .filter(ws -> ws.getId() == id)
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("해당 아이디는 존재하지 않습니다.");
                    return null;
                });
    }

    public WiseSaying write(String author, String content) {
        WiseSaying wiseSaying = new WiseSaying(++lastId, author, content);

        wiseSayingList.add(wiseSaying);

        return wiseSaying;
    }
}
