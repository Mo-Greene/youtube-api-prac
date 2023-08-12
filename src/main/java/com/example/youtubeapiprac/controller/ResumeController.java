package com.example.youtubeapiprac.controller;

import com.example.youtubeapiprac.dto.resume.ResumeRequest;
import com.example.youtubeapiprac.service.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;

    @PostMapping("/resume")
    public ResponseEntity<?> insertResume(@RequestBody ResumeRequest resumeRequest) {
        return resumeService.insertResume(resumeRequest);
    }
}
