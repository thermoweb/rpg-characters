package org.thermoweb.rpgcharacters;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Characters {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "characters_id_seq")
    private Long id;

    private String name;
    private Integer experience;
    private Integer hitpoints;

    //fixme: change to text instead of ordinal
    private Role role;

    @OneToMany(mappedBy = "characters")
    private List<Quest> quests;

    @Transient
    private String surname;

}
