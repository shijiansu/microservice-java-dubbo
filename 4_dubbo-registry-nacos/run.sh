#!/bin/bash
# docker
/bin/bash ./run-nacos.sh
# install
/bin/bash ./run-install.sh
# service
/bin/bash ./dubbo-service-nacos/run.sh
# provier
/bin/bash ./dubbo-provider-nacos/run.sh
# consumer
/bin/bash ./dubbo-consumer-nacos/run.sh
