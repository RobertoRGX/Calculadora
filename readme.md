# Calculator

To run locally:

```
mvn spring-boot:run
```

Then the app will be available at [http://localhost:8080/calculator](http://localhost:8080/calculator).

## Docker

The included Docker and Docker Compose files are prepared to deploy the project.

### Run only with Docker

```
docker build . -f ./docker/Dockerfile -t calculator
```

Then run it

```
docker run -p 8080:8080 calculator:latest
```

Then the app will be available at [http://localhost:8080/calculator](http://localhost:8080/calculator).

### Run with Docker Compose

```
docker-compose -f docker/docker-compose.yml up
```

Then the app will be available at [http://localhost:8080/calculator](http://localhost:8080/calculator).