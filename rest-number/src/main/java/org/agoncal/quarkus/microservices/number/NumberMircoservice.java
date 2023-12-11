package org.agoncal.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(info = @Info(title = "Number Microservice", description = "This microservice generates book isbn numbers", version = "1.0", contact = @Contact(name = "Marco Wetter", url = "", email = "marcowetter@gmx.de")), externalDocs = @ExternalDocumentation(url = "https://github.com/agoncal/agoncal-course-quarkus-microservice", description = "All the Microservice code"), tags = {
        @Tag(name = "api", description = "Public API that can be used by anybody"),
        @Tag(name = "number", description = "Anybody interested in isbn numbers")
    }
)
public class NumberMircoservice extends Application {

}
