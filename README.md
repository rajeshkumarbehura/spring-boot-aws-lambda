## Spring Boot Rest API application & AWS Lambda

This Spring Boot application supports deployment on AWS Lambda or K8S or Elastic Beanstalk using containers

### 1. Benefits of this model design
- Complete control over your code and deployment process.
- Write own unit or integration tests easily on your local machine.
- Debug your code effectively during development or production.
- Can use postgress locally or RDS easily with db connection pooling.


### 2. Why you should deploy in Lambda ?
At early stage startup project, lambda gives lot of flexibility to deploy the code, 
without much brothering infrastructure setup like k8s,ecs or any other way. 

### 3. Deploy in AWS lambda
1. install serverless \
    ``npm install -g sls``
2. Go to working project folder and run below command \
    ``sls deploy``

for more detail serverless commands, follow serverless website.\
`https://www.serverless.com/framework/docs/getting-started`


### 4. Deploy using Docker
Dockerise the spring boot app using Dockerfile. Before running docker build command, 
disable pom file maven-shade plugin.
1. Create docker build for image \
 `` docker build -t boot-app:1.0 .``
2. Run the image \
 ``docker run -p 80:8080 boot-app:1.0``

 
### 5. Further Improvement
Use Healthcheck status api to configure in cloudwatch to monitor health.
