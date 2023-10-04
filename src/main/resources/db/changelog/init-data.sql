INSERT INTO characters (id, name, role, experience, hitpoints, max_hitpoints) OVERRIDING SYSTEM VALUE VALUES (1, 'chronie', 'WIZARD', 0, 6, 6);
INSERT INTO characters (id, name, role, experience, hitpoints, max_hitpoints) OVERRIDING SYSTEM VALUE VALUES (2, 'lilipu', 'CLERIC', 0, 8, 8);

INSERT INTO quests (name, status, character_id, reward) VALUES ('seak and destroy bad developer', 'taken', 1, 10);
INSERT INTO quests (name, status, character_id, reward) VALUES ('kill the architect lich', 'taken', 2, 30);