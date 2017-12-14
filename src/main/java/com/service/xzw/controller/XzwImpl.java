package com.service.xzw.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-14T15:33:55.564Z")

@RestSchema(schemaId = "xzw")
@RequestMapping(path = "/xzw", produces = MediaType.APPLICATION_JSON)
public class XzwImpl {

    @Autowired
    private XzwDelegate userXzwDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userXzwDelegate.helloworld(name);
    }

}
