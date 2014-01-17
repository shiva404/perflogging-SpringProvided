package shiv.exp;

import javax.ws.rs.core.Response;

public class TestResource implements ITestResource {
    @Override
    public Response getReq() {
        return Response.ok("<data>I am here... !!!</data>").build();  //To change body of implemented methods use File | Settings | File Templates.
    }
}