package tech.xmob.wakanda.wakander.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.xmob.wakanda.wakander.model.Wakander;

public interface WakandaRepository extends MongoRepository<Wakander, String> {

}
