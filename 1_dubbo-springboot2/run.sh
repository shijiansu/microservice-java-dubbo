#!/bin/bash
# install
/bin/bash run-install.sh
# service
/bin/bash ./dubbo-service/run.sh
# provier
/bin/bash ./dubbo-provider/run.sh
# consumer
/bin/bash ./dubbo-consumer/run.sh
