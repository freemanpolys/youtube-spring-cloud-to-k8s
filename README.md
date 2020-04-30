# Data
https://raw.githubusercontent.com/samayo/country-json/master/src/country-by-continent.json

# Mongo
docker run --name mongo-you -p 27017:27017  -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin -d mongo
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-continent-flag --collection continent --file country-by-continent.json 
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-continent-flag --collection flag --file country-by-flag.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-lang-population --collection population --file country-by-population.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-lang-population --collection language --file country-by-languages.json

# Consul
docker run --name consul-you -p 8500:8500 -d consul

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

# Request continent
curl http://localhost:8082/actuator/refresh -d {} -H "Content-Type: application/json"
curl http://localhost:8082/conflag/continent
