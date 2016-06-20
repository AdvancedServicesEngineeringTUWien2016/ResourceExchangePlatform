# ResourceExchangePlatform

## ASE2016

## Requirements
* Java 8
* Maven 3
* Any database that can be used via JPA and supports JPQL(Postgresql is used by default)

## Configuration
Backend:
* Can either be started directly as SpringBoot application or deployed in a docker image(redeploy.sh removes currently running instances and restarts the backend)
* spring.datasource.url in application.properties needs to point to your database(change credentials, driecer class and hibernate dialect accordingly)
* Default port 8080 can be overriden by spring runtime properties passed as JVM arguments

Frontend:
* Can either be hosted directly on an nginx server using the supplied nginx.conf or deployed using docker(redeploy.sh removes currently running instances and restarts the frontend)
* Backend address can easily be adjusted in public/js/app.js in line 16(this address is used for all ajax calls to the backend)

Sensors:
* Don't really require configuration other than the backend address which can be passed in using the JVM system property 'baseUrl'
* The system property 'participant' can be used to simulate offers and demands as another market participant

## Startup
Start the backend first, then the frontend. Starting sensor instances is optional. The frontend can be reached at your configured server address(localhost:80 on linux system or [virtualbox host address]:80 on windows systems).
