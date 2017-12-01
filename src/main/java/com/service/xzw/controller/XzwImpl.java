package com.service.xzw.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2017-12-01T07:04:52.847Z")


@RestSchema(schemaId = "xzw")
@Path("/xzw")

@Produces({ "application/json" })
public class XzwImpl  {

    @Autowired
    private XzwDelegate xzwDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return xzwDelegate.helloworld(name);
    }
}

