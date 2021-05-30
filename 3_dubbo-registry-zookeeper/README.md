# Environment

- dubbo admin - localhost:8888 - in stack.yml

# Java development environment

`sdk list java && sdk current java`

# Setup Maven wrapper

- https://github.com/takari/maven-wrapper

`mvn -N io.takari:maven:0.7.7:wrapper -Dmaven=3.5.4`

# Script step by step

```shell script
./mvnw clean spring-boot:run
```

# One stop script
```shell script
/bin/bash run.sh
/bin/bash run-test.sh
/bin/bash run-stop.sh
```