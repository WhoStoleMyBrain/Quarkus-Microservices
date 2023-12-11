#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:3.5.2:create \
        -DprojectGroupId=org.agoncal.quarkus.microservices \
        -DprojectArtifactId=rest-number \
        -DclassName="org.agoncal.quarkus.microservices.number.NumberResource" \
        -Dpath="/api/numbers" \
        -Dextensions="resteasy-jsonb, smallrye-openapi" -e