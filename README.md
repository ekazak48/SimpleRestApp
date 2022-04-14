# Simple Rest application with Spring Framework

Application can be built by executing
```
./gradlew bootJar
```
For using this app in docker, you can build your own image by executing the following command in a project directory
```
docker build -t simplerestapp .
```
Then you can start a container with the following command
```
docker run -d -p 8080:8080 --name my-container simplerestapp
```

#Usage

This app will greet world, when mapping /api/hello is executed. Also, you can pass the name parameter like
```
curl localhost:8080/api/hello?name={your name here}
```
and it will greet you with passed name