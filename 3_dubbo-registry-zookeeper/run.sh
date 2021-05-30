#!/bin/bash
# zookeeper
/bin/bash run-admin-and-zookeeper.sh
# install
/bin/bash run-install.sh
# service
/bin/bash ./dubbo-service-zookeeper/run.sh
# provier
/bin/bash ./dubbo-provider-zookeeper/run.sh
# consumer
/bin/bash ./dubbo-consumer-zookeeper/run.sh
