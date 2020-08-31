package distributed.config;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/greeting")
public class GreetingController {

    private GreetingHelper greetingHelper;

    public GreetingController(GreetingHelper greetingHelper) {
        this.greetingHelper = greetingHelper;
    }

    @Get(value = "/{name}", produces = MediaType.TEXT_PLAIN)
    public String greet(String name) {
        return greetingHelper.createGreeting(name);
    }
}