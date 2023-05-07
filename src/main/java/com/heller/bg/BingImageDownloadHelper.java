package com.heller.bg;

import co.notime.intellijPlugin.backgroundImagePlus.NotificationCenter;

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
            NotificationCenter.notice("Download bing image success: " + filePath);
        } catch (Exception e) {
            NotificationCenter.notice("Download bing image fail: " + e.getMessage());
        }
    }

    private static String buildDownloadFilePath(String baseDir) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter monthPattern = DateTimeFormatter.ofPattern("yyyy-MM");
        String month = now.format(monthPattern);
        File imageDir = new File(baseDir + File.separator + month);
        if (!imageDir.exists()) {
            imageDir.mkdirs();
        }

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = now.format(datePattern);
        return imageDir.getAbsolutePath() + File.separator + date + ".jpg";
    }

}
