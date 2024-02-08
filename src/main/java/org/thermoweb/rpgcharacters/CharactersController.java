package org.thermoweb.rpgcharacters;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/rest/characters")
public class CharactersController {

    private final CharactersRepository repository;
    private final EntityService<Quest> questService;
    private final EntityService<Characters> charactersService;

    public CharactersController(CharactersRepository repository, EntityService<Quest> questService, EntityService<Characters> charactersService) {
        this.repository = repository;
        this.questService = questService;
        this.charactersService = charactersService;
    }

    @GetMapping
    public List<Characters> getCharacters() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Characters getCharacter(@PathVariable Long id) {
        Optional<Characters> character = repository.findById(id);
        return character.orElseThrow();
    }

    @PostMapping
    @Transactional()
    public Characters createCharacter(@RequestBody CreateCharacterRequest createCharacterRequest) {
        Characters entity = Characters.builder()
                .name(createCharacterRequest.name())
                .role(createCharacterRequest.role())
                .experience(0)
                .hitpoints(10)
                .build();

        CreateCharacterRequest request = CreateCharacterRequest.builder().name("test").build();
        createCharacterRequest.toBuilder().name("test").build();
        return repository.save(entity);
    }
}
