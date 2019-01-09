###Demo-User-Service

Sample spring boot application with docker plugin to build and push images to docker repo.

### Local Dev
 - Package: `mvn package -Dmaven.test.skip=true`
 - Docker Build: `mvn docker:build`
 - Docker Push: `mvn docker:push`

### To test it locally
 - docker run -p 8080:8080 <image-name> 
 checkout http:localhost:8080