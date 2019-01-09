###Demo-User-Service

Sample spring boot application with docker plugin to build and push images to docker repo.

### Local Dev
 - Package: `mvn package -Dmaven.test.skip=true`
 - Docker Build: `mvn docker:build`
 - Docker Push: `mvn docker:push`

### To test it locally
 - docker run -p 8080:8080 <image-name> 
 checkout http:localhost:8080
 
 
####To check service version execute following:
 
```shell
for i in {1..100}
do
 curl -s http://localhost:8080/users/user/1 | jq '.version'
 sleep 1
done
```
