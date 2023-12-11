#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:3.5.2:create \
        -DprojectGroupId=org.agoncal.quarkus.microservices \
        -DprojectArtifactId=rest-book \
        -DclassName="org.agoncal.quarkus.microservices.book.BookResource" \
        -Dpath="/api/books" \
        -Dextensions="resteasy-jsonb, smallrye-openapi" -e