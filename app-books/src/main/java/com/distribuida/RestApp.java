package com.distribuida;
import jakarta.ws.rs.ApplicationPath;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;


@ApplicationPath("/")
@OpenAPIDefinition(info = @Info(
        title = "app-book",
        version = "1.0.0",
        license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0.html"),
        contact = @Contact(
                name = "ihpaucar",
                email = "ihpaucar@uce.edu.ec"
        )

))
public class RestApp extends Application {

}
