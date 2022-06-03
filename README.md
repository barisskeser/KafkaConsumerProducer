# Consumer and Producer Project with Kafka and Docker
The producer produce an user for test topic and the consumer print that user to system out by consume.

## Build Project and Create a Docker Image
### Consumer
Go to the consumer project path on consol and build the project with that command;
```console
$ gradle build
```
Then you can create a docker image on local using following;
```console
$ docker build -t barisskeser/consumer .
```
### Producer
Go to the producer project path on consol and build the project with that command;
```console
$ gradle build
```
Then you can create a docker image on local using following;
```console
$ docker build -t barisskeser/producer .
```

## Run Project
Go to same path with docker-compose.yml file and run that command;
```console
$ docker-compose up
```
After that you can send a post request with to "localhost:8080/user"
<p>
<img align="center" src="/images/postman.PNG" alt="Post Request" />
</p>
<p>
<img align="center" src="/images/intellij_out.PNG" alt="Example Output" />
</p>
