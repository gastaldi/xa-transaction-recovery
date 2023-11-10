package org.acme;

import io.quarkus.narayana.jta.QuarkusTransaction;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String hello() throws Exception {
        Book b = new Book();
        b.name = "Quarkus in Action";
        b.persist();

        BookOnTwo b2 = new BookOnTwo();
        b2.name = "Quarkus in Action 2";
        b2.persist();

        return "Hello from RESTEasy Reactive";
    }
}
