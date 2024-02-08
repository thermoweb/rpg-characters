package org.thermoweb.rpgcharacters;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnBean
public class CharacterService extends GenericEntityService {

}
