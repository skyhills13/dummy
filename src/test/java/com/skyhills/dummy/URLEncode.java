package com.skyhills.dummy;

/**
 * Created by soeunpark on 2019. 5. 10..
 */
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class URLEncode {

    public static void main(String[] args) throws IOException {
        String aaa = URLEncoder.encode("https://papago.naver.com/?sk=auto&tk=en&st=%EC%95%88%EB%85%95%ED%95%98%EC%84%B8%EC%9A%94.%20%ED%96%89%EB%B3%B5%ED%95%98%EC%9E%90", "UTF-8");
        System.out.println(aaa);

    }
}