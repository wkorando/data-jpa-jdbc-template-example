# Spring Data Custom Repository Extension Example

There is a perception that there is something akin to a binary choice between using Spring Data and accepting JPA or being able to use SQL (through JdbcTemplate) and have access to all it's flexibility. 

This project is an example of how Spring Data JPA offers the ability to extend a [Repository](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/Repository.html?is-external=true) interface with a custom repo and in the custom repository use JdbcTemplate to execute a query. 

The example query isn't a good use case of when to implement this behavior, as it Spring JPA is easily capable of handling a LIKE query, but the point isn't to demonstrate a meaningful use case, but how to implement the pattern. 

For more complete check out the article: [JPA or SQL in a Spring Boot Application? Why Not Both?](http://billykorando.com/2019/05/04/jpa-or-sql-in-a-spring-boot-application-why-not-both)

As well as the Spring Data JPA user docs: [https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.single-repository-behavior](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.single-repository-behavior)