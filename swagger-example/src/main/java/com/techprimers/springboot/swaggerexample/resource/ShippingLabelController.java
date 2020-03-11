package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import com.techprimers.springboot.swaggerexample.domain.ShippingLabelRequest;
import com.techprimers.springboot.swaggerexample.domain.ShippingLabelResponse;

@RestController
@Api(value = "shipping-label-controller", description = "Shipping Label Controller")
public class ShippingLabelController {

    @ApiOperation(value = "Returns Shipping Label")
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
    
  @RequestMapping(path ="/shippinglabel",method=RequestMethod.POST,consumes="application/json")
    public ShippingLabelResponse helloPost(@RequestBody final ShippingLabelRequest shippingLabelRequest) {
    	ShippingLabelResponse shippingLabelresponse= new ShippingLabelResponse();
        return shippingLabelresponse;
    }

  /*  @ApiOperation(value = "Returns Hello World")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }*/
}

