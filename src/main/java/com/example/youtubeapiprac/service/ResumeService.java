package com.example.youtubeapiprac.service;

import com.example.youtubeapiprac.dto.resume.ResumeCareer;
import com.example.youtubeapiprac.dto.resume.ResumeCertification;
import com.example.youtubeapiprac.dto.resume.ResumeEducation;
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

        Long result = resumeMapper.insertResume(resumeRequest);
        if (result > 0) {
            return new ResponseEntity<>("Success", HttpStatus.OK);
        }

        return new ResponseEntity<>("BadRequest", HttpStatus.BAD_REQUEST);
    }
}
