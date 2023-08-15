package com.example.youtubeapiprac.dto.resume;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ResumeEducation {

    private Long resumeNo;
    private String school;
    private String graduateStatus;
    private String duration;

}
