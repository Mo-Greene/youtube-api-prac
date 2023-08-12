package com.example.youtubeapiprac.dto.resume;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ResumeRequest {

    private Long resumeNo;
    private String resumeName;
    private String resumeBirth;
    private String resumePhoneNumber;
    private String resumeAddress;
    private String resumePersonalStatement;

    private List<ResumeEducation> resumeEducations;
    private List<ResumeCareer> resumeCareers;
    private List<ResumeCertification> resumeCertifications;
}
