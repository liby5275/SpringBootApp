# SpringBootApp

This is a spring boot app, started with a simple REST API. Below are the contents added to this application
1. Added a simple web service endpoint to fetch the address related information from the my Sql data base. 
   Coding is based on Java 8.
2. Added Swagger2 to the the application
   - Create a SwaggerConfig file with @Swagger2 and @RestApiController annotations
   - Add dependency for Swagger 2 and Swagger UI. 
   - Then use @Api and @ApiOperations in the controller
3. Replaced the logging inside each method (methods from service and repo layer) with Aspect oriented Logging
`` - used @Before and @After annotations
4.Added Exception handling
   - Created a base exception which extends RunTime Exception
   - created a customeExcpetion abstract class and added an inner class BusinessExceotion to it.
   - Business Exception extends BaseExceotion
   - A custom handler should be written with @ControllerAdvise and @RestController
   - Also, @ExceptionHandler should be provided here
   
 5. Added H2 Data Base integration for testing
   - Added Dependency for H2 DB
   - Create a WebConfig file and override H2Servlet method
   - Change the applications.properties file with new DB parameters
   - Call localhost:8080/bibi/console to see the H2DB  
  
 6. Added Hibernate Feature
   - For this Hibernate property spring.jpa.hibernate.ddl-auto need to be added in the apllication.properties with a value of create or update 
     or create-drop
   - Then Use @Entity, @Id etc to create the entity class an then the DB will have a table named Class name  
