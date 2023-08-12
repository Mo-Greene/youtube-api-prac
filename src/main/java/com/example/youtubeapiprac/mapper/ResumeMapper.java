package com.example.youtubeapiprac.mapper;

import com.example.youtubeapiprac.dto.resume.ResumeRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResumeMapper {

    int insertResume(ResumeRequest resumeRequest);
}
