# Spring Boot Kotlin Docker Sample

# Requirements
* JDK >= 11
* Kotlin
* Gradle >= 5.0
* Docker >= 19
* Docker Compose >= 1.13.0
* Valid credentials for Docker registry when you want to push the image

# Usage
## Run the app anyway

### Run

```bash
$ docker-compose up --build -d

$ curl -v http://localhost:8080/dependent-api
```

### Shut down

```bash
$ docker-compose down
```

## Use Gradle Docker plugin (might be removed in the future)

https://github.com/palantir/gradle-docker

### Push a Docker image

1. Make sure you login to the registry you want to push to
2. Edit build.gradle.kts so that we can specify the target registry (Please see the file in detail)
3. Run the following command
    ```bash
    $ ./gradlew clean dockerPush
    ```

### Run Docker Compose

1. Run the following command and make sure your docker-compose.yml has a proper content
    ```bash
    $ ./gradlew clean generateDockerCompose
    ```
2. Run the following command and then `docker-compose up -d` should run
    ```bash
    $ ./gradlew clean dockerComposeUp
    ```
