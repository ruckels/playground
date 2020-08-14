package de.andreas_ruckelshausen.MyJersyRESTServices2020;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.andreas_ruckelshausen.MyJersyRESTServices2020.entities.HelloWorld;
import de.andreas_ruckelshausen.MyJersyRESTServices2020.services.HelloWorldService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("hellorest")
public class HelloREST {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloWorld getIt() {
        return HelloWorldService.getHelloWorld();
    }
}
