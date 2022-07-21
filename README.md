#Dowload the project o clone

#open terminal in directory docker and excute this comands

1. sudo docker build -t business-person-v1 .
2. sudo docker run -d -p 8080:8080 business-person-v1
3. sudo docker logs <id_run_container>

#Connect data in db h2
uri:http://localhost:8080/h2-cons/
database:jdbc:h2:mem:persondb

#Insert test data, example:

INSERT INTO PERSON VALUES('2dc9d304-0808-11ed-861d-0242ac120002', '73792410 ', '1', 'RONALDO', 'CORVIN CORVIN', '173793410');

#Execute your postman method GET = localhost:8080/person/173793410

#Stop Container and delete

1. sudo docker stop <container_id>
2. sudo docker rm <container_id>

