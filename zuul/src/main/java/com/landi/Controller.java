package com.landi;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@Api(description = "Log in and notice")
public class Controller {

    @RequestMapping(value = "/login/miniapp", method = RequestMethod.POST)
    String fakeLogin() {
        return "{\"status\":200,\"msg\":\"success\",\"data\":{\"token\":{\"expirationTime\":1653672110231,\"token\":\"landi\"},\"user\":\"shane\"}}";
    }

    @RequestMapping(value = "/notices/newest", method = RequestMethod.GET)
    String fakeNotice() {
        return "搞不懂接口数据格式";
    }
}
