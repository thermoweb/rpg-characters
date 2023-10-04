package org.thermoweb.rpgcharacters;

import java.util.List;

import lombok.Builder;

@Builder(toBuilder = true)
public record CharacterDto(Integer id, String name, String role, Integer experience, Integer hitpoints, List<QuestDto> quests) {
}
