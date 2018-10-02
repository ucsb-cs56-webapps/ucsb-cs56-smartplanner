# smart planner


- schedule importer

  - eventually have to import users' schedule from GOLD / Google Calendar


- to-do list editor

    - get users' tasks (to-dos)
    - collect infomation on due dates, priority levels, time/duration estimates & all other preferences


- a "smart" organizer

    - read from the stored todo list and "smartly" fit them into the imported schedule
    - can be creative / fancy here


<!-- # links to check for myself
https://github.com/ninikat/todomustacheExpress/blob/master/views/todo.mustache -->

## random messages

 
This repo hasn't really started yet and definitely needs a lot more work. ~~I will be working from time to time in the playground branch.~~ Sorry. What a busy quarter. :( -- Nuan

----------------

# To use

| To do this | Do this |
| -----------|-----------|
| run the program | Type `mvn exec:java`.  Visit the web page it indicates in the message |
| check that edits to the pom.xml file are valid | Type `mvn validate` |
| clean up so you can recompile everything  | Type `mvn clean` |
| edit the source code for the app | edit files in `src/main/java`.<br>Under that the directories for the package are `edu/ucsb/cs56/pconrad`  |
| edit the source code for the app | edit files in `src/test/java`.<br>Under that the directories for the package are `edu/ucsb/cs56/pconrad`  |
| compile    | Type `mvn compile` |
| run junit tests | Type `mvn test` |
| build the website, including javadoc | Type `mvn site-deploy` then look in either `target/site/apidocs/index.html`  |
| copy the website to `/docs` for publishing via github-pages | Type `mvn site-deploy` then look for javadoc in `docs/apidocs/index.html` |
| make a jar file | Type `mvn package` and look in `target/*.jar` |

| run the main in the jar file | Type `java -jar target/sparkjava-demo-01-1.0-jar-with-dependencies.jar ` |
| change which main gets run by the jar | Edit the `<mainClass>` element in `pom.xml` |
