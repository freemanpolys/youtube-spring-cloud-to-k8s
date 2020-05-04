# Data
https://raw.githubusercontent.com/samayo/countryDTO-json/master/src/countryDTO-by-continent.json

# Mongo and Consul
Run "docker-compose up -d" command in the base folder
Load initial data
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db countryDTO-continent-flag --collection continent --file data/countryDTO-by-continent.json 
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db countryDTO-continent-flag --collection flag --file data/countryDTO-by-flag.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db countryDTO-lang-population --collection population --file data/countryDTO-by-population.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db countryDTO-lang-population --collection language --file data/countryDTO-by-languages.json


# Config Server
https://github.com/eugenp/tutorials/tree/master/spring-cloud-bus
The Git-backed configuration API provided by our server can be queried using the following paths:
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

## Request Properties from Config Server
curl http://localhost:8800/continent-flag/default/master

# Request continent and flag
curl http://localhost:8082/actuator/refresh -d {} -H "Content-Type: application/json"
curl http://localhost:8082/srvcfla/country
curl http://localhost:8082/srvcfla/flag/Senegal

#Request language and population
 curl http://localhost:8083/srvlapo/lang
 curl http://localhost:8083/srvlapo/population
 
#Gateway
curl http://localhost:8080/srvcfla/country
curl http://localhost:8080/srvcfla/flag/Senegal
curl http://localhost:8080/srvlapo/lang
curl http://localhost:8080/srvlapo/population

#Start microervices
Run mvn package in the base folder
 java -jar config-server/target/config-server-0.0.1-SNAPSHOT.jar 
 java -jar config-server/target/config-server-0.0.1-SNAPSHOT.jar --server.port=9080
 
 java -jar gateway/target/gateway-0.0.1-SNAPSHOT.jar
 
 java -jar country-continent-flag/target/country-continent-flag-0.0.1-SNAPSHOT.jar 
 java -jar country-continent-flag/target/country-continent-flag-0.0.1-SNAPSHOT.jar --server.port=9085
 
 java -jar country-lang-population/target/country-lang-population-0.0.1-SNAPSHOT.jar 
 java -jar country-lang-population/target/country-lang-population-0.0.1-SNAPSHOT.jar --server.port=9090
 
