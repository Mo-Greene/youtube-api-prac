package com.example.youtubeapiprac.controller;

import com.example.youtubeapiprac.dto.YoutubeDTO;
import com.example.youtubeapiprac.service.YoutubeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
@RequiredArgsConstructor
public class YoutubeController {

    private final YoutubeService youtubeService;

    @GetMapping("")
    public String getHome() {

        return "youtube";
    }

    @PostMapping("/youtube")
    public ResponseEntity<?> postYoutubeUrl(@RequestBody YoutubeDTO youtubeDTO) {

        log.info("youtubeDto : " + youtubeDTO);

        return new ResponseEntity<>("Okay", HttpStatus.OK);
    }
}
