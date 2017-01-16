#!/bin/sh

cd api
mvn install
cd ../master
mvn install
cd ../extension
mvn install
cd ..
mkdir run
cd run
cp ../master/target/master-0.0.1-SNAPSHOT.jar .
cp ../extension/target/extension-0.0.1-SNAPSHOT.jar .

java -Dserver.port=9090 -Dloader.path=. -jar master-0.0.1-SNAPSHOT.jar
