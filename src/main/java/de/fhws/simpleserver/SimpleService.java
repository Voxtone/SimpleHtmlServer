package de.fhws.simpleserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

@Path( "webpage" )
public class SimpleService {

    @GET
    @Produces( MediaType.TEXT_HTML )
    public Reader getWebpage() throws FileNotFoundException {
        return new FileReader( "src/main/resources/files/index.html" );
    }
}
