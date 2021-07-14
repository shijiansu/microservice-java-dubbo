#!/bin/bash
# need to update the syntax from docker-compose to docker stack
docker-compose -f docker-compose.yaml up --remove-orphans &
