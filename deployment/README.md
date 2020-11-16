##### Execute Cloudformation template using scripts
This script should be executed from repository root directory
###### Create/update all stacks
```commandline
./deployment/scripts/deployStack.sh <ENV> <ImageVersion> <IsActive>

ENV - DEV
ImageVersion - 1.0.0-SNAPSHOT
IsActive - true
```
###### Test
Check NLB CFN stack output for load balancer DNS name
```
http://dev-am-public-nlb-01-xxxxxxxxxxxx.elb.us-east-1.amazonaws.com/color-teller/color
http://dev-am-public-nlb-01-xxxxxxxxxxxx.elb.us-east-1.amazonaws.com/random/random-number
```