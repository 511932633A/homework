package com.landi;

import com.landi.client.GetCredit;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Posts")
public class Controller {

    @Autowired
    GetCredit getCredit;

    @RequestMapping(value = "shares", method = RequestMethod.GET)
    String shares() {
        return "1\n" + getCredit.getCredit("shane");
    }

    @RequestMapping(value = "share/preview", method = RequestMethod.GET)
    String preview() {
        return "1";
    }

    @RequestMapping(value = "shares/contribute", method = RequestMethod.GET)
    String contribute() {
        return "1";
    }
}
