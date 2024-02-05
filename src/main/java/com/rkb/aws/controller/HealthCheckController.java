package com.rkb.aws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class HealthCheckController {

    private static final Logger log = LoggerFactory.getLogger(HealthCheckController.class);


    @GetMapping(value = "health-check/status", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getStatus() {
        log.info("Received client request");
        var map = new HashMap<String, String>();
        map.put("healthCheckStatus", "OK");
        return map;
    }

}
