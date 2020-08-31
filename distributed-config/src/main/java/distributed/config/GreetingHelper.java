package distributed.config;

import io.micronaut.context.annotation.Value;
import io.micronaut.runtime.context.scope.Refreshable;

import javax.inject.Singleton;

@Refreshable
@Singleton
public class GreetingHelper {

    @Value("${greeting.prefix}")
    private String greetingPrefix;

    public String createGreeting(String name) {
        return greetingPrefix + name;
    }
}
