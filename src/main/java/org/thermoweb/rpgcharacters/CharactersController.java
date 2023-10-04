package org.thermoweb.rpgcharacters;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/characters")
public class CharactersController {

    private final Map<Integer, CharacterDto> characterRepository;

    public CharactersController() {
        characterRepository = new HashMap<>(Map.of(
                1, new CharacterDto(1, "chronie", Role.WIZARD, 0, 6, List.of(new QuestDto(1, "seak and destroy bad developer", "taken", 10))),
                2, new CharacterDto(2, "lilipu", Role.CLERIC, 0, 8, List.of(new QuestDto(1, "kill the architect lich", "taken", 30)))
        ));
    }

    @GetMapping
    public List<CharacterDto> getCharacters() {
        return characterRepository.values().stream().toList();
    }

    @GetMapping("{id}")
    public CharacterDto getCharacter(@PathVariable Integer id) {
        return characterRepository.get(id);
    }

    @PostMapping
    public CharacterDto createCharacter(@RequestBody CreateCharacterRequest createCharacterRequest) {
        Integer newId = Collections.max(characterRepository.keySet()) + 1;
        CharacterDto dbCharacter = CharacterDto.builder()
                .id(newId)
                .name(createCharacterRequest.name())
                .role(createCharacterRequest.role())
                .experience(0)
                .hitpoints(10)
                .build();
        characterRepository.put(newId, dbCharacter);
        return dbCharacter;
    }
}
