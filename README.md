# SpringBootApp

This is a spring boot app, started with a simple REST API. Below are the contents added to this application
1. Added a simple web service endpoint to fetch the adress related information from the my Sql data base. 
   Coding is based on Java 8.
2. Added Swagger2 to the the application
   - Create a SwaggerConfig file with @Swagger2 and @RestApiController annotations
   - Add dependency for Swagger 2 and Swagger UI. 
   - Then use @Api and @ApiOperations in the controller
3. Replaced the logging inside each mothod (methods from service and repo layer) with Aspect oriented Logging
`` - used @Before and @After annotaations
4.Added Exception handling
   - Created a base excpetion which extends RunTime Exception
   - created a customeExcpetion abstarct class and added an inner class BusinessExceotion to it.
   - Business Exception extends BaseExceotion
   - A custom handler should be writted with @ControllerAdvise and @RestController
   - Also, @ExceptionHandler should be provided here
