package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/th")
public class indexController {

    @GetMapping("/aaa")
    public String index(){
        return "index1";
    }
}
