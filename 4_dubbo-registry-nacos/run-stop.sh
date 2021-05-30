#!/bin/bash
# consumer
/bin/bash ./dubbo-consumer-nacos/run-stop.sh
# provider
/bin/bash ./dubbo-provider-nacos/run-stop.sh
# docker
/bin/bash ./run-nacos-stop.sh
