package org.thermoweb.rpgcharacters;

import java.util.List;

import lombok.Builder;

@Builder(toBuilder = true)
public record CharacterDto(Integer id, String name, Role role, Integer experience, Integer hitpoints, List<QuestDto> quests) {
}
