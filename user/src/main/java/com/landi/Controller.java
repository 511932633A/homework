package com.landi;

import com.landi.client.GetCredit;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "User")
public class Controller {
    @Autowired
    GetCredit getCredit;

    @RequestMapping(value = "me", method = RequestMethod.GET)
    String getUser() {
        return "{\"user\":\"shane\"}\n" + getCredit.getCredit("shane");
    }
}
