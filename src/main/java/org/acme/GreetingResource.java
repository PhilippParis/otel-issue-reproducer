package org.acme;

public class GreetingResource implements GreetingResourceInterface {

    @Override
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
