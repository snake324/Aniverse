-- Inserting both roles
INSERT INTO roles (id_role, role) VALUES (1, 'ADMIN'),(2, 'USER');

-- Inserting profiles for users
INSERT INTO profiles (profile_id, profile_img) VALUES (1, '/images/icon-admin-32.jpg'),(2, '/images/straw-hat.png');

-- Inserting users with profile_id
INSERT INTO user (id_user, mail, password, profile_id)
VALUES
    (1, 'cristian@aniverse.com', '$2a$12$S1MB85LjsOxWffqdKo31u.AboEK8MIhKduOjEam3e1n.BCHBENfMW', 1),
    (2, 'luffy@aniverse.com', '$2a$12$SnIc0lskG/qyHSTWT8vpNOVQyaN5XxO2peQ8mqrepLv41vRv/GHhe', 2);

-- Inserting relation into role_users
INSERT INTO roles_users (role_id, user_id) VALUES (1,1),(2,2);

-- Inserting genres
INSERT INTO genre (genre) VALUES
    ('Action'),('Adventure'),('Avant Garde'),('Award Winning'),('Boys Love'),('Comedy'),('Drama'),('Fantasy'),('Girls Love'),('Gourmet'),('Horror'),('Mystery'),('Romance'),('Sci-Fi'),('Slice of Life'),('Sports'),('Supernatural'),('Suspense');

-- Inserting anime
INSERT INTO anime (name, synopsis, img_url, trailer, studios, episodes, duration, premiered, type)
VALUES
    ('One Piece', 'One Piece tells the story of a young man named Monkey D. Luffy, who inspired by his pirate friend Shanks, begins a journey to achieve his dream, to become the King of pirates, for which he must find the One Piece treasure left by the former pirate king Gol D. Roger.', '/images/onepiece.jpg', 'https://www.youtube.com/embed/6_OuVgpigfU?si=2Xs-XT_smIAW9lEJ', 'Toei Animation', '1073', '24', 'Fall 1999', 'TV'),
    ('Naruto: Shippuden', 'It tells the story of a teenage ninja named Naruto Uzumaki, who aspires to become Hokage, leader of his village, in order to be recognized as someone important within the village and among his peers.', '/images/narutoshippuden.jpg', 'https://www.youtube.com/embed/2upuBiEiXDk?si=pn_CbzdiCp5X_7mk', 'Pierrot', '500', '23', 'Winter 2007', 'TV'),
    ('FullMetal Alchemist: Brotherhood', 'This anime tells us the story of brothers Edward (15 years old) and Alphonse (14), who after the death of their mother (when they were the tender age you can see in the gif above), broke the biggest taboo of alchemy by wanting to resurrect her: human transmutation.', '/images/fullmetall.jpg', 'https://www.youtube.com/embed/cGcoZh3MIiY?si=b_VA38Ik2RZCxSVd', 'Bones', '64', '24', 'Spring 2009', 'TV'),
    ('Dragon Ball', 'Dragon Ball tells the story of Goku, an exceptional child who arrived on Earth in a capsule during a stormy night. Knowing nothing of his past, an old man took care of him as his grandson until he was eight years old.', '/images/db.jpg', 'https://www.youtube.com/embed/L4auFrAK-mQ?si=iTvqccwsiI-12Vhw', 'Toei Animation', '153', '24', 'Winter 1986', 'TV'),
    ('Dragon Ball Z', 'The plot of Dragon Ball Z focuses on the adult life of Son Goku, who will have to defend the earth from the numerous villains that threaten to destroy it. In addition, the series plots in parallel the maturity of his son Gohan. The production stands out for having a more serious tone than its predecessor.', '/images/dbz.jpg', 'https://www.youtube.com/embed/sjeAl6RQILM?si=M_7qQoSFjMRhgWHt', 'Toei Animation', '291', '24', 'Spring 1989', 'TV'),
    ('Neon Genesis Evangelion', 'The story of the work takes place in a futuristic world in which a paramilitary organization called NERV protects humanity from the attacks of beings of unknown origin and nature, the "Angels", using humanoid bio mechas called Evangelion (shortened to EVA).', '/images/evangelion.jpg', 'https://www.youtube.com/embed/3bdjDmYc8J4?si=NJe2OqvjToofcspD', 'Gainax', '26', '24', 'Fall 1995', 'TV'),
    ('Cowboy Bebop', 'It tells the story of a group of bounty hunters who in 2071 travel throughout the solar system in search of missions to increase their fortune.', '/images/cowboybebop.jpg', 'https://www.youtube.com/embed/EL-D9LrFJd4?si=9zSpQIURwv8s3pFs', 'Sunrise', '26', '24', 'Spring 1998', 'TV'),
    ('Rurouni Kenshin (2023)', 'Kenshin Himura is a samurai known for his skill with the catanna and his coldness when it comes to killing. In the past he was in the service of the Ishin Shishi (patriots who fought to return power to the Emperor), but after the fighting ended, Kenshin vowed never to kill again and traveled the country as a wanderer, helping anyone in need as penance for all his deaths.', '/images/kenshin2023.jpg', 'https://www.youtube.com/embed/V83Kxuvt9Jc?si=Iav8nBXwwAeukuyd', 'LIDENFILMS', '24', '22', 'Summer 2023', 'TV'),
    ('Yu Yu Hakusho', 'It tells the story of Yusuke Urameshi, a juvenile delinquent who is hit by a car while trying to save the life of a child. In the other world, he is appointed as a Spirit Detective by Koenma and Botan, and must investigate cases about demons and apparitions.', '/images/yuyu.jpg', 'https://www.youtube.com/embed/UQltPgNYDXM?si=ZG7hi2yLUVJhm1Pi', 'Pierrot', '112', '24', 'Fall 1992', 'TV'),
    ('Kimetsu no Yaiba', 'It narrates the misadventures of Tanjiro, a young man in a fantastic feudal Japan who is driven to revenge after a demon wipes out his entire family, except for his sister, Nezuko, who is also demonic and bloodthirsty.', '/images/kimetsu.jpg', 'https://www.youtube.com/embed/VQGCKyvzIM4?si=prRRq_p7J3Ah5v51', 'ufotable', '26', '23', 'Spring 2019', 'TV'),
    ('Jujutsu Kaisen', 'It tells the story of Yuji Itadori, a high school student who spends his days with his friends in the occult club of his school but all this will change when he discovers that spirits really exist and must collect an object to save his friends.', '/images/jujutsu.jpg', 'https://www.youtube.com/embed/pkKu9hLT-t8?si=3Mvs5ezTEHr3aeIY', 'MAPPA', '24', '23', 'Fall 2020', 'TV'),
    ('Bleach: Thousand-Year Blood War', 'Bleach centers on Ichigo Kurosaki, a young man who can see spirits. When a shinigami named Rukia Kuchiki is injured while trying to protect him from a monster known as Hollow, she inadvertently transfers her powers to Ichigo.', '/images/bleach2.jpg', 'https://www.youtube.com/embed/1sygUhb8Q2Y?si=pvv0F6h37gv50YY4', 'Pierrot', '13', '24', 'Fall 2022', 'TV'),
    ('Sousou no Frieren', 'The story follows the elven mage Frieren, a former member of the group of adventurers who defeated the Demon King and restored harmony to the world after a ten-year quest. In the past, the heroic group included Frieren, the human hero Himmel, the dwarven warrior Eisen and the human priest Heiter. Before they split up, they observe together the Meteor Age, a meteor shower that occurs once every fifty years. Frieren agrees to see them again and offer them a better view the next time the celestial event occurs. Frieren then departs and travels the world in search of magical knowledge.', '/images/sousou.jpg', 'https://www.youtube.com/embed/f5ZEiJyqDKU?si=yv40peb6jWG_hYW2', 'Madhouse', 'Unknown', 'Unknown', 'Fall 2023', 'TV'),
    ('Tokyo Revengers: Tenjiku-hen', 'Watching the news, Takemichi Hanagaki learns that his high school girlfriend, Hinata Tachibana, has died. The only girlfriend he ever had was killed by a gang known as the Tokyo Manji Gang. He lives in a thin-walled apartment, and his boss, six years younger, treats him like an idiot. However, despite this disastrous life, one day an event occurs and he goes back 12 years in time, to his high school days.To save Hinata and change the life he has had, Takemichi has to become the leader of one of Kantos delinquent gangs.', '/images/tokyo.jpg', 'https://www.youtube.com/embed/bMeWENMdq3k?si=gfk5onMHOUERJM9m', 'LIDENFILMS', 'Unknown', 'Unknown', 'Fall 2023', 'TV'),
    ('Shaman King: Flowers', 'Shaman King Flowers takes place about 16 years after the shaman fight. The main character of the story is Asakura Hana, son of Yoh Asakura and Anna Asakura.Hana has grown up to be a lazy and brutal child. He doesnt care about his studies, skips classes, gets into gang fights and feels very bored with his everyday life. All that changes when the branch family members, Asakura Luca and Asakura Yohane, come to challenge and kill Hana and his father Yoh to take their place as the main house. ', '/images/SHKF.jpg', 'https://www.youtube.com/embed/_IibHdCX7Nk?si=IyFhEZpXCAcwIUtz', 'Bridge', 'Unknown', 'Unknown', 'Winter 2024', 'TV');

-- Inserting relation into anime_genre
INSERT INTO anime_genre (anime_id, genre_id) VALUES (1,1),(1,2),(1,8),(2,1),(2,2),(2,8),(3,1),(3,2),(3,7),(3,8),(4,1),(4,2),(4,6),(4,8),(5,1),(5,2),(5,6),(5,8),(6,1),(6,3),(6,4),(6,7),(6,14),(6,18),(7,1),(7,4),(7,14),(8,1),(9,1),(9,8),(10,1),(10,4),(10,8),(11,1),(11,4),(11,8),(12,1),(12,2),(12,8),(13,2),(13,7),(13,8),(14,1),(14,7),(14,17),(15,2),(15,6),(15,17);

-- Inserting user preferences for 18 animes
INSERT INTO user_preferences (id_preferences, rating, review, status, profile_id, anime_id)
VALUES
    (1, 5, 'Excelente anime, me encantó la historia y los personajes.', 'Watching', 2, 1),
    (2, 4, 'Buena serie, pero el final me dejó con ganas de más.', 'Completeted', 2, 2),
    (3, 5, 'Increíble, no puedo esperar para la próxima temporada.', 'Watching', 2, 3),
    (4, 3, 'Un poco aburrido al principio, pero mejora con el tiempo.', 'Completeted', 2, 4),
    (5, 5, 'Una obra maestra, definitivamente uno de mis favoritos.', 'Completeted', 2, 5),
    (6, 4, 'Muy entretenido, los combates son geniales.', 'Completeted', 2, 6),
    (7, 5, 'Me encanta este anime, lo he visto varias veces.', 'Completeted', 2, 7),
    (8, 4, 'Un anime clásico que nunca pasa de moda.', 'Completeted', 2, 8),
    (9, 5, 'La trama me mantuvo intrigado en todo momento.', 'Dropped', 2, 9),
    (10, 3, 'Algunos episodios son lentos, pero vale la pena verlo.', 'Completeted', 2, 10),
    (11, 5, 'Uno de los mejores animes que he visto, la animación es asombrosa.', 'Completeted', 2, 11),
    (12, 4, 'Me gustó mucho, pero espero una segunda temporada.', 'On-Hold', 2, 12),
    (13, 5, 'Intrigante y emocionante, definitivamente lo recomiendo.', 'Plan to watch', 2, 13),
    (14, 3, 'Un anime clásico de acción que no decepciona.', 'Plan to watch', 2, 14),
    (15, 5, 'Una experiencia única, los personajes son inolvidables.', 'Plan to watch', 2, 15)
