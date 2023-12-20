package org.thermoweb.rpgcharacters;

import lombok.Builder;

@Builder(toBuilder = true)
public record CreateCharacterRequest(String name, Role role) {

}
