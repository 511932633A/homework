package com.landi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("credit")
public interface GetCredit {
    @RequestMapping("")
    String getCredit(@RequestParam("user") String user);
}
