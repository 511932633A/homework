package com.landi;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Credit")
public class Controller {


    @RequestMapping(value = "", method = RequestMethod.GET)
    String getCredit(@RequestParam(value = "user", required = true) String user) {
        return String.format("credits of %s", user);
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    String updateCredit(@RequestParam(value = "user", required = true) String user) {
        return String.format("credits of %s updated", user);
    }
}
