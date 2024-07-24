package net.infinity.infinityJournalApp.repository;

import net.infinity.infinityJournalApp.entity.JournalEntry;
import net.infinity.infinityJournalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

    void deleteByUserName(String userName);
}
