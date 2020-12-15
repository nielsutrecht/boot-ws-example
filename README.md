# Spring Boot WebService example

Based on the [official guide](https://spring.io/guides/gs/producing-web-service/) but with Kotlin and
up to date with the latest JDK versions (so includes Jaxb dependencies).

## Testing the service

Run the service and then:

     curl --header "content-type: text/xml" -d @src/test/resources/testrequest.xml http://localhost:8080/ws
