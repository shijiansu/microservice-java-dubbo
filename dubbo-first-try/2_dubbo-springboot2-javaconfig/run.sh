#!/bin/bash
# install
/bin/bash run-install.sh
# service
/bin/bash ./dubbo-service-javaconfig/run.sh
# provier
/bin/bash ./dubbo-provider-javaconfig/run.sh
# consumer
/bin/bash ./dubbo-consumer-javaconfig/run.sh
