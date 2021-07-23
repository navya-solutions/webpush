package com.navya.webpush.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class Notification {

    enum Direction {
        auto, ltr, rtl
    }

    private String title;
    private Object data;
    private String badge;
    private String body;
    private Direction dir;
    private String icon;
    private String image;
    private String lang;
    private Boolean renotify;
    private Boolean requireInteraction;
    private Boolean silent;
    private String tag;
    private List<Integer> vibrate;
    private Long timestamp; // millis since 1970-01-01
    private List<NotificationAction> actions;

}