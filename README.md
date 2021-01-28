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
 b: <br>
  c: <br>
   d: <br>
  e: <br>
   f: <br>
it would be helpful if there are a lot of parameters to set. But this can be either part of project or added to the jar file and hence dont meet all the goals <br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
