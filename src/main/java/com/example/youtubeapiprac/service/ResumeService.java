package com.example.youtubeapiprac.service;

import com.example.youtubeapiprac.dto.resume.ResumeRequest;
import com.example.youtubeapiprac.mapper.ResumeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ResumeService {

    private final ResumeMapper resumeMapper;

    public ResponseEntity<?> insertResume(ResumeRequest resumeRequest) {

        log.info("resumeRequest : " + resumeRequest);
        log.info("list : " + resumeRequest.getResumeCareers());
        log.info("list : " + resumeRequest.getResumeEducations());
        log.info("list : " + resumeRequest.getResumeCertifications());

        int result = resumeMapper.insertResume(resumeRequest);
        if (result > 0) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
