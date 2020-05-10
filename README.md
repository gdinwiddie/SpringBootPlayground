# Explorations of Spring Boot

The point of this exploration is to develop using Spring from a test-first perspective, rather than from a boilerplate-first approach that many tutorials offer.

## Initial Checkin

 - Used Sprint Initializer (https://start.spring.io/) to generate the basic project.
 - Imported into Eclipse as a Maven project
 - Ran Maven to grab all the dependencies
 - Added standalone JUnit test (not marked @SpringBootTest)
 
## Added test of getting data from the BusinessDomain via the Web Interface
 
I'm not sure if I've used Spring to the best of its ability, here. I found it difficult to find information for this simple task.

 - Converted DemoApplicationTests.contextLoads() test to call the web interface. This required some new dependencies.
 - Extracted a Controller from the Application. Things didn't seem to work right when these were the same class with two annotations (@SpringBootApplication & @Controller). Could have been my mistake somewhere, e.g., using @Controller instead of @RestController, though. Still, separating these concerns is probably better. I hated doing this refactoring with a failing test.
 - Mapped a request route to a Controller method, DemoController.getBusinessDomainName()
 - Ended up changing annotation from @Controller to @RestController
      - I couldn't find much in the way of examples for using @Controller, hence my uncertainty if I'm using Spring in a manner in which it's intended.
