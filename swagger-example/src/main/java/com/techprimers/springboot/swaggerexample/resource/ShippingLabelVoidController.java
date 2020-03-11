package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(value = "User Resource REST Endpoint", description = "Shipping Label Void Controller")
public class ShippingLabelVoidController{
	 @ApiOperation(value = " Shipping Label void")
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
	    
	  @RequestMapping(path ="/label/void",method=RequestMethod.POST,consumes="application/json")
	    public String helloPost(@RequestBody final String hello) {
	        return hello;
	    }

	  /*  @ApiOperation(value = "Returns Hello World")
	    @PutMapping("/put")
	    public String helloPut(@RequestBody final String hello) {
	        return hello;
	    }*/
}
