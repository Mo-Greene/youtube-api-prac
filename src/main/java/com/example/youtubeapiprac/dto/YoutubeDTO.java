package com.example.youtubeapiprac.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @name : YoutubeDTO
 * @author : Mo-Greene
 * @date : 2023/07/22
 * 유튜브 dto
 */
@Data
@Builder
public class YoutubeDTO {

    private String thumbnail;
    private String title;
    private String url;

}
