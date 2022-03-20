# Config-server

This will be responsible for accessing the configuration form the central repository and config-server url will be configured in the `application.properties` file of different microservices that wishes to access these central configuration information from this `config-server` application.

Url of the central repository is mentioned in the `application.properties` file of config-server

```.properties
spring.cloud.config.server.git.uri=file:///C:/prashant_softwares/springboot_projects/git-repo-microservice-configuration/git-local-configuration-repo/

```
