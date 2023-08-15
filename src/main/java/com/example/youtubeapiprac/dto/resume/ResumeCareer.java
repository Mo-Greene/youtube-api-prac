package com.example.youtubeapiprac.dto.resume;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ResumeCareer {

    private Long resumeNo;
    private String duration;
    private String history;
    private String position;
    private String duty;

}
