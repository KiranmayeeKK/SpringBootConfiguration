# SpringBootConfiguration
This repository contains few ways of setting configuration properties for spring boot application. <br>
The goals of configuration files are: <br>
**1. Externalisation <br>
  2. Environment specific <br>
  3. Consistent <br>
  4. Version History <br>
  5. Real-time management** <br>
### 1. writing configuration into application.properties file <br>
  In this way, an application.properties file is present in the spring boot project and the configuration parameters are set into it.  <br>
  Drawback: <br>
  It don't meet any of the above mentioned goals. To channge any properties, the jar has to be unzipped and the property file has to be changed. <br>
### 2. Adding an application.properties file to the folder containing jar <br>
This overrides the application.properties present in the jar. With this only the Externalisation goal is achieved. <br>
### 3. Using YAML configuration files<br>
YAML is yet another way of writing configuration parameters. It is a key value pair and used nesting. Instead of writing a.b.c.d  and a.b.e.f format for all the parameters, it will take the format: <br>
a: <br>
&nbsp;b: <br>
&nbsp;&nbsp;c: <br>
&nbsp;&nbsp;&nbsp;d: <br>
&nbsp;&nbsp;e: <br>
&nbsp;&nbsp;&nbsp;f: <br>
it would be helpful if there are a lot of parameters to set. But this can be either part of project or added to the jar file and hence dont meet all the goals <br>
### 4. Using spring profile <br>
The spring profile in this project is application-test.yml. it resides in the same folder as default profile file application.yml <br>
The spring profile naming format is <br>
application-<profile name>.extn <br>
An configuration parameter spring.profile.active=test is set in the application.yml, so that it overrides the values of the parameters. <br>
FOr multiple environments, multiple yml files can be created and corresponding profile name can be passed as command line argument while execution <br>
ex: java -jar project.jar --spring.profiles.active=prod, for this to work there should be a config file with name application-prod.yml <br>
An annotation @Profile("profile name") can be used on beans to instantiate corresponding beans<br>
Ex:<br>
  @Repository <br>
  @Profile("prod") <br>
  public class DataSourceBean { <br>
  <br>
  <br>
 @Repository <br>
  @Profile("dev") <br>
  public class DataSourceBean { <br>
If no profile is set, by default all the beans are instantiated.<br>
<br>
<br>
<br>
<br>
<br>
<br>
