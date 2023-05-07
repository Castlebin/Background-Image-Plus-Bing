package com.heller.bg;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BingImageDownloadHelper {

    public static void download(String baseDir) {
        try {
            String filePath = buildDownloadFilePath(baseDir);
            File file = new File(filePath);
            if (file.exists()) {
                return;
            }
            BingImage.downloadBingBackgroundImg(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String buildDownloadFilePath(String baseDir) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter monthPattern = DateTimeFormatter.ofPattern("yyyyMMdd");
        String month = now.format(monthPattern);
        File imageDir = new File(baseDir + File.separator + month);
        if (!imageDir.exists()) {
            imageDir.mkdirs();
        }

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyyMMdd");
        String date = now.format(datePattern);
        return imageDir.getAbsolutePath() + File.separator + date + "_bing.jpg";
    }

}
