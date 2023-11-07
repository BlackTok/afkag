package com.takemikazuchi.afkag.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "AFK Arena Guide",
                description = "AFKAG", version = "0.0.1a",
                contact = @Contact(
                        name = "Takemikazuchi",
                        email = "",
                        url = ""
                )
        )
)
public class SwaggerConfig {
}
