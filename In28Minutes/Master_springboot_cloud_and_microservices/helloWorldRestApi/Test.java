import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Test {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the REST API!";
    }

    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello, " + name + "!";
    }

}
