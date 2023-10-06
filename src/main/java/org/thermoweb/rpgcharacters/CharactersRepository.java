package org.thermoweb.rpgcharacters;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersRepository extends JpaRepository<Characters, Long> {
}
