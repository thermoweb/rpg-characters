CREATE TABLE IF NOT EXISTS characters (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name text,
    role text,
    experience int,
    hitpoints int,
    max_hitpoints int
);

CREATE TABLE IF NOT EXISTS quests (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name text,
    status text,
    character_id INT,
    reward INT,
    CONSTRAINT fk_character
        FOREIGN KEY(character_id)
            REFERENCES characters(id)
);