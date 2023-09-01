package com.example.bill.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
	info=@Info(
		contact=@Contact(
			name="Gokulmathi",
			email="727721euec035@skcet.ac.in",
			url="https://some-url.com"),
		    description="This is open api documentation for onlineBillPayment",
		    title="OnlineBillPayment",
		    license=@License(
		    		name="MIT",
		    		url="https://some-url.com"),
		    termsOfService="Terms of service"),
	servers=@Server(
			description="DEV ENV",
			url="http://localhost:8088")
	
)

public class OpenApiConfig {

}
