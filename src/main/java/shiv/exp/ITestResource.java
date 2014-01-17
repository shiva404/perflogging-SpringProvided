package shiv.exp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public interface ITestResource {
    @GET
    @Path("/get")
    public Response getReq();

}
