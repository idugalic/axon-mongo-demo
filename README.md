# axon-mongo-demo
Based on seed project `idugalic:axon-java-spring-maven-seed`

This Axon demo project demonstrates use of MongoDB as an event storage. Spring configuration is located in the main [application class](src/main/java/com/demo/AxonMongoDemoApplication.java).

## Development

This project is driven using [maven].

### Run Axon Server

Axon Server is used for message (commands, events, query) routing. To fallback to simple command, query and event buses exclude `axon-server-connector` from `axon-spring-boot-starter` maven dependency in [pom file](pom.xml).

You can [download](https://download.axoniq.io/axonserver/AxonServer.zip) a ZIP file with AxonServer as a standalone JAR. This will also give you the AxonServer CLI and information on how to run and configure the server.

Alternatively, you can run the following command to start AxonServer in a Docker container:

```
$ docker run -d --name axonserver -p 8024:8024 -p 8124:8124 axoniq/axonserver
```

### Run locally

You can run the following command to start your project locally:

```
$ ./mvnw spring-boot:run
```

### Run tests

This project comes with some rudimentary tests as a good starting
point for writing your own. Use the following command to execute the
tests using Maven:

```
$ ./mvnw test
```

### Run Mongo database

For this demo to work, you must stand up a local MongoDB server.

On a Mac OS X machine with homebrew, just do this:

```
$ brew install mongodb
$ brew services start mongo

```
More installation options are found at http://docs.mongodb.org/manual/installation/.

### Try it with CURL

#### POST / Issue a gift card
```
$ curl -i -X POST -H 'Content-Type:application/json' -d '{"value" : "1002"}' 'http://localhost:8080/cards'
```

#### GET all gift cards
```
$ curl http://localhost:8080/cards
```

---

[maven]: https://maven.apache.org/ (Maven)
[atomist]: https://www.atomist.com/ (Atomist)
[axon]: https://axoniq.io/ (Axon)