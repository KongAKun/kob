package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bot/")
public class BotInfoController {
    @RequestMapping("info/")
    public Map<String, String> info() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("botName", "Kob");
        map.put("botVersion", "1.0.0");
        return map;
    }
}
