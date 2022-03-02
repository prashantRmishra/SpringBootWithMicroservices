## SpringBoot Microservices

SMALL AUTONOMOUS SERVICES THAT WORK TOGETHER -  _  SAM NEWMAN_

**Microservices**

	.Rest
	.& Small Well Chosen Deployable Units
	.Cloud Enabled
	
**Challenges in Microservices**

Bounded context

	how to set right boundary for your microservices ie which microservice will do what
	
Configuration Management

	100s of microservices and tons of environment to manage how do we simplify that.

Dynamically Scale up and Scale down
	
	Dynamically scale up and scale down and dynamically distribute the load between the active instances

Visibility
	
	We should have great visibility of whats happening between each microservices

Fault tolerance

	How do I make sure that failure of one microservice will not affect other microservices
	
## Limit Microservice

This microservice is called limit microservices

Add following dependencies to your `pom.xml` 

```xml
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
	    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-config</artifactId>
		    <version>3.1.1</version>
		</dependency>
```

`spring-cloud-starter-config` is required so that out limit microservice can contact with the Spring cloud server to fetch the applications configuration.

Add following to `application.perperties` 

```.properties
spring.config.import = optional:configserver:http://localhost:8888 
#optional because we don't have config server availabe with us right now .
```
By this the spring cloud client will know how to connect to the spring cloud config server.