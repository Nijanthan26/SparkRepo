package com.kafka

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}

package object producer {

  def main[args:Array[String]]: Unit = {

    //Define Producer Properties
    val pros = new Properties()
    pros.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092")
    pros.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer")
    pros.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer")
    pros.put(ProducerConfig.ACKS_CONFIG,"all")
    pros.put(ProducerConfig.LINGER_MS_CONFIG,1)

    val producer = new KafkaProducer[String,String](pros)

    val record = new ProducerRecord[String,String]("kafkRepo","null","Hi kafka")

    producer.send(record)
    producer.flush()
    producer.close()

  }

}
