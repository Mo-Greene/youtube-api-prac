package com.example.youtubeapiprac.dto.resume;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ResumeCertification {

    private Long resumeNo;
    private String acquisitionDate;
    private String certificationName;
    private String publisher;
    private String passStatus;
}
