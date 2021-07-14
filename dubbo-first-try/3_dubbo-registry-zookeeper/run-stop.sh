#!/bin/bash
# consumer
/bin/bash ./dubbo-consumer-zookeeper/run-stop.sh
# provider
/bin/bash ./dubbo-provider-zookeeper/run-stop.sh
# zookeeper
/bin/bash ./run-admin-and-zookeeper-stop.sh
