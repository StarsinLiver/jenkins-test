package com.example.ip;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : com.example.ip
 * fileName : controller
 * author : san26
 * date : 2024-03-30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2024-03-30         san26          최초 생성
 */

@RestController
public class controller {

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("안녕하세요");
    }
}
