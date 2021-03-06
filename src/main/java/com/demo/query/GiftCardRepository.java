package com.demo.query;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cards", path = "cards")
interface GiftCardRepository extends MongoRepository<GiftCardEntity, String> {

    @RestResource(exported = false)
    @Override
    void deleteById(String aLong);

    @RestResource(exported = false)
    @Override
    void delete(GiftCardEntity entity);

    @RestResource(exported = false)
    @Override
    void deleteAll(Iterable<? extends GiftCardEntity> entities);

    @RestResource(exported = false)
    @Override
    void deleteAll();

    @RestResource(exported = false)
    @Override
    <S extends GiftCardEntity> S save(S entity);

    @RestResource(exported = false)
    @Override
    <S extends GiftCardEntity> List<S> saveAll(Iterable<S> entities);

}
