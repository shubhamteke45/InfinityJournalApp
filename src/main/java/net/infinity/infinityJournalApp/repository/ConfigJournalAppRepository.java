package net.infinity.infinityJournalApp.repository;

import net.infinity.infinityJournalApp.entity.ConfigJournalAppEntity;
import net.infinity.infinityJournalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {


}
