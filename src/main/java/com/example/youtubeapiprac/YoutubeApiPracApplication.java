package com.example.youtubeapiprac;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.youtube.YouTube;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.security.GeneralSecurityException;

@SpringBootApplication
public class YoutubeApiPracApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutubeApiPracApplication.class, args);
    }

    // YouTube API 키
    private static final String API_KEY = "YOUR_YOUTUBE_API_KEY";

    // YouTube API 클라이언트 초기화
    private static final HttpTransport HTTP_TRANSPORT;
    private static final JsonFactory JSON_FACTORY = JsonFactory.getDefaultInstance();

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("Error initializing GoogleNetHttpTransport.", e);
        }
    }

    public static String getVideoTitleAndThumbnail(String videoId) throws IOException {
        // YouTube API 클라이언트 빌드
        YouTube youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, new HttpRequestInitializer() {
            public void initialize(HttpRequest request) throws IOException {
            }
        }).setApplicationName("youtube-info").build();

        // 동영상 정보 요청
        YouTube.Videos.List videoRequest = youtube.videos().list("snippet");
        videoRequest.setId(videoId);
        VideoListResponse listResponse = videoRequest.execute();
        List<Video> videoList = listResponse.getItems();

        if (videoList != null && videoList.size() > 0) {
            Video video = videoList.get(0);
            String title = video.getSnippet().getTitle();
            String thumbnailUrl = video.getSnippet().getThumbnails().getHigh().getUrl();
            return "동영상 제목: " + title + "\n썸네일 URL: " + thumbnailUrl;
        }

        return "동영상 정보를 가져오지 못했습니다.";
    }
}
