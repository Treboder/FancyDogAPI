# Getting Started
Simple example demonstrating a REST service for a simple data class <Dog>.
Please see [Swagger Docu](http://localhost:8080/swagger-ui.html) for more details.
REST implementation is based on spring-boot-starter-data-jpa and spring-boot-starter-web.
Service is secured with [Spring Security](https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter)
, using default credentials (basic auth) 
- user=user and 
- password=password.

Navigate to http://localhost:8080/dogs in a browser to see the exposed dog microservice (after logging in).  
When using Postman send GET request with Authorization type "basic auth", otherwise "401 Unauthorized" will be answered.

## ToDo: Add tests
Unfortunately autowiring MockMvc does not work ... 

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

