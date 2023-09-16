-- Inserting both roles
INSERT INTO roles (id_role, role) VALUES (1, 'ROLE_ADMIN'),(2, 'ROLE_USER');

-- Inserting users and admin user
INSERT INTO user (id_user, email, password) VALUES (1, 'cristian', '{bcrypt}$2a$12$S1MB85LjsOxWffqdKo31u.AboEK8MIhKduOjEam3e1n.BCHBENfMW'),
(2,'luffy', '{bcrypt}$2a$12$SnIc0lskG/qyHSTWT8vpNOVQyaN5XxO2peQ8mqrepLv41vRv/GHhe');

-- Inserting relation into role_users
INSERT INTO roles_users (role_id, user_id) VALUES (1,1),(2,2);

-- Inserting relation into anime_genre
INSERT INTO anime_genre (anime_id, genre_id) VALUES (1,1),(1,2),(1,3),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(14,14),(15,15);