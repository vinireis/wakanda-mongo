package tech.xmob.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.xmob.mongodb.model.Wakander;

public interface WakandaRepository extends MongoRepository<Wakander, String> {

}
