# Kafka-example
This is a small demo of how to use Apache Kafka Broker in Spring boot App.

If you don't have a Kafka already installed on your machine, so execute docker command line : <b>docker-compose.yml up -d</b>.

This command will pull the required Docker images (if not already available) and start the ZooKeeper and Kafka containers.

After executing the docker-compose up -d command, you should have a Kafka broker running on localhost:9092, and ZooKeeper running on localhost:2181. 
You can modify the Kafka broker's address in your Spring application's configuration file to connect to this local Kafka instance.

---------------------------------------

We have three config classes : <b>KafkaConsumerConfig</b> & <b>KafkaProducerConfig</b> that used to configure Kafka using Beans.

<b>KafkaTopicConfig</b> class contains a method that build a NewTopic "firstTopic" and used in <b>KafkaListeners</b> Class to send a test message to consumer.

<b>MessageController</b> class have a publish method that send MessageRequest to "firstTopic".

Feel free to downaload my code and make any updates.🔥

NAJIB ✌️
