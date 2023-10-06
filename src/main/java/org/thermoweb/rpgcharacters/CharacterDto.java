package org.thermoweb.rpgcharacters;

import java.util.List;

import lombok.Builder;

@Builder(toBuilder = true)
public record CharacterDto(Long id, String name, Role role, Integer experience, Integer hitpoints, List<QuestDto> quests) {
}
