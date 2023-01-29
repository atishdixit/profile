## Profile demo
###Testing current profile running 
> Set Profile in application properties file spring.profiles.active=test 
> Call endpoint Profile : http://localhost:1002/profile
> Default Profile is default| Active Profile is test| And Current PORT is 1002
***
### Test for DEV
> Set Profile in application properties file spring.profiles.active=dev
> Call endpoint Profile : http://localhost:1000/profile
> Default Profile is default| Active Profile is dev| And Current PORT is 1000

***
### Test for stage
> Set Profile in application properties file spring.profiles.active=stage
> Call endpoint Profile : http://localhost:1001/profile
> Default Profile is default| Active Profile is stage| And Current PORT is 1001