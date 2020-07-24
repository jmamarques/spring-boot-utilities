package docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello/{val}")
    public String helloWorld(@PathVariable String val) {
        return "Hello World";
    }

    @GetMapping("/tomala1")
    public String tomala1(@RequestParam String val) {
        return "Toma la 1";
    }

    @PostMapping(value = "/tomala", consumes = MediaType.TEXT_PLAIN_VALUE)
    public String tomala(@RequestBody String val) {
        return "Toma la";
    }

    @PostMapping("/hello")
    public String helloPostWorld() {
        return "Hello Post World";
    }

    public void dummy(){

    }
}
