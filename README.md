Data
https://raw.githubusercontent.com/samayo/country-json/master/src/country-by-continent.json

mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-continent-flag --collection continent --file country-by-population.json 
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-continent-flag --collection flag --file country-by-flag.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-lang-population --collection population --file country-by-population.json
mongoimport --host localhost --username admin --password admin  --authenticationDatabase admin --jsonArray  --db country-lang-population --collection language --file country-by-languages.json
Mongo
docker run --name mongo-you -p 27017:27017  -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin -d mongo

Consul
docker run --name consul-you -p 8500:8500 -d consul
