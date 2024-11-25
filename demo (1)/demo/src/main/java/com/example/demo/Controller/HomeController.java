package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index"; // Trả về file index.html
    }

    @GetMapping("/sqli")
    public String sqlPage() {
        return "sqli"; // Trả về file sql.html
    }

    @GetMapping("/xss")
    public String xssPage() {
        return "xss"; // Trả về file xss.html
    }

}
