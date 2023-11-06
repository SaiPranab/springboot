package org.jt.firstmongoapplication;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentDetailRepository extends MongoRepository<DocumentDetails, String> {

}
