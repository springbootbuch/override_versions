package de.springbootbuch.override_versions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {

    @Controller
    public static class IndexController {

        @GetMapping({"", "/"})
        public String index() {
            return "index";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
