This application was built with Maven, using Java 8 and Jsoup 1.11.3 version library.

Application scenario:
1. Download Maven on your computer and configure it.
2. Go to https://github.com/msheviakou/Searching-Request and 
   a) download project with zip extension and unpack it where you want
   b) if you have a GIT, just clone the project with the following command:
   	  https://github.com/msheviakou/Searching-Request.git
3. To run the application:
   a) Enter the following command in command line:
   	  mvn exec:java -Dexec.mainClass=SearchRequestTask
   b) You can configure this application in your IDE and start it from there.
   In both cases all needed dependencies will be downloaded independently.
4. To stop your application, enter empty string for your search request.

In order to make this task I spent about 2 hours (including acquaintance with frameworks/libraries that help to connect to Internet URL and parse response pages). But I have chosen Jsoup because it's one of the most lightweight and understandable library to parse and manipulate HTML elements.
Besides that I was reading about different types of connection to sites and different ways to receive data.