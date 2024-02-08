package org.thermoweb.rpgcharacters;


public interface EntityService<T extends GenericEntity> {
    T getEntity(String id);
}
