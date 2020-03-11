package com.techprimers.springboot.swaggerexample.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "shipping-label-close-contoller", description = "Shipping Label Close Controller")
public class ShippingLabelCloseController {
	  @ApiOperation(value = "Shipping Label Close")
	    @ApiResponses(
	            value = {
	                    @ApiResponse(code = 100, message = "100 is the message"),
	                    @ApiResponse(code = 200, message = "Successful Hello World")
	            }
	    )
	  /*  @GetMapping
	    public String hello() {
	        return "Hello World";
	    }
	*/
	    
	  @RequestMapping(path ="/label/close",method=RequestMethod.POST,consumes="application/json")
	    public String helloPost(@RequestBody final String hello) {
	        return hello;
	    }
}
