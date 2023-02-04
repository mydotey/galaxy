package org.mydotey.galaxy.rest.controller;

import org.mydotey.galaxy.vo.ViewResponse;
import org.mydotey.java.StringExtension;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/index", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class IndexController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
    public ViewResponse<String> hello(@RequestParam(name = "name", required = false) String name) {
        if (StringExtension.isBlank(name))
            name = "world";
        return ViewResponse.success(name);
    }

}
