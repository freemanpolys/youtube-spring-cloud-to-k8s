# Data
https://raw.githubusercontent.com/samayo/country-json/master/src/country-by-continent.json

# Mongo and Consul
Run "docker-compose up -d" command in the base folder
Pour initialiser la base de données
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-continent-flag --collection continent --file data/country-by-continent.json 
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-continent-flag --collection flag --file data/country-by-flag.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-lang-population --collection population --file data/country-by-population.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-lang-population --collection language --file data/country-by-languages.json


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
curl http://localhost:8082/srvcfla/flag

#Request language and population
 curl http://localhost:8083/srvlapo/lang
 curl http://localhost:8083/srvlapo/population


