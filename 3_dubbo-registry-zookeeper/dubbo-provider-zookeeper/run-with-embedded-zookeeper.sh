#!/bin/bash
/bin/bash run-stop.sh
./mvnw clean spring-boot:run -Drun.profiles=development
