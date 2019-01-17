package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ziyi
 * @create 2019/1/17
 */
@Controller
@RequestMapping("/home")
public class TestController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
