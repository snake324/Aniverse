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
    ('One Piece', 'One Piece narra la historia de un joven llamado Monkey D. Luffy, que inspirado por su amigo pirata Shanks, comienza un viaje para alcanzar su sueño, ser el Rey de los piratas, para lo cual deberá encontrar el tesoro One Piece dejado por el anterior rey de los piratas Gol D. Roger.', '/images/onepiece.jpg', 'https://www.youtube.com/embed/6_OuVgpigfU?si=2Xs-XT_smIAW9lEJ', 'Toei Animation', '1073', '24', 'Fall 1999', 'TV'),
    ('Naruto: Shippuden', 'Narra la historia de un ninja adolescente llamado Naruto Uzumaki, quien aspira a convertirse en Hokage, líder de su aldea, con el propósito de ser reconocido como alguien importante dentro de la aldea y entre sus compañeros.', '/images/narutoshippuden.jpg', 'https://www.youtube.com/embed/2upuBiEiXDk?si=pn_CbzdiCp5X_7mk', 'Pierrot', '500', '23', 'Winter 2007', 'TV'),
    ('FullMetal Alchemist: Brotherhood', 'Este anime nos cuenta la historia de los hermanos Edward (15 años) y Alphonse (14), quienes después de la muerte de su madre (cuando tenían la tierna edad que podéis ver en el gif superior), rompieron el mayor tabú de la alquimia al querer resucitarla: la transmutación humana.', '/images/fullmetall.jpg', 'https://www.youtube.com/embed/cGcoZh3MIiY?si=b_VA38Ik2RZCxSVd', 'Bones', '64', '24', 'Spring 2009', 'TV'),
    ('Dragon Ball', 'Dragon Ball narra la historia de Goku, un excepcional niño que llegó a la Tierra en una cápsula durante una noche tormentosa. Sin saber nada de su pasado, un anciano lo cuidó como su nieto hasta los ocho años.', '/images/db.jpg', 'https://www.youtube.com/embed/L4auFrAK-mQ?si=iTvqccwsiI-12Vhw', 'Toei Animation', '153', '24', 'Winter 1986', 'TV'),
    ('Dragon Ball Z', 'La trama de Dragon Ball Z se centra en la vida adulta de Son Goku, quien tendrá que defender la tierra de los numerosos villanos que amenazan con destruirla. Además, la serie trama de forma paralela la madurez de su hijo Gohan. La producción destaca por tener un tono más serio que su predecesora.', '/images/dbz.jpg', 'https://www.youtube.com/embed/sjeAl6RQILM?si=M_7qQoSFjMRhgWHt', 'Toei Animation', '291', '24', 'Spring 1989', 'TV'),
    ('Neon Genesis Evangelion', 'La historia de la obra se da lugar en un mundo futurista en el que una organización paramilitar llamada NERV protege a la humanidad de los ataques de seres de origen y naturaleza desconocidos, los «Ángeles», utilizando para ello bio mechas humanoides llamados Evangelion (acortado a EVA).', '/images/evangelion.jpg', 'https://www.youtube.com/embed/3bdjDmYc8J4?si=NJe2OqvjToofcspD', 'Gainax', '26', '24', 'Fall 1995', 'TV'),
    ('Cowboy Bebop', 'Cuenta la historia de un grupo de cazarrecompensas que en 2071 viaja por todo el sistema solar a la búsqueda de misiones con la que aumentar su fortuna.', '/images/cowboybebop.jpg', 'https://www.youtube.com/embed/EL-D9LrFJd4?si=9zSpQIURwv8s3pFs', 'Sunrise', '26', '24', 'Spring 1998', 'TV'),
    ('Rurouni Kenshin (2023)', 'Kenshin Himura es un samurái conocido por su destreza con la catana y su frialdad a la hora de matar. En el pasado estuvo al servicio de los Ishin Shishi (patriotas que luchaban para devolver el poder al Emperador), pero, tras terminar los enfrentamientos, Kenshin juró no volver a matar y viajar por el país como un vagabundo, ayudando a quien lo necesitase como penitencia por todas sus muertes.', '/images/kenshin2023.jpg', 'https://www.youtube.com/embed/V83Kxuvt9Jc?si=Iav8nBXwwAeukuyd', 'LIDENFILMS', '24', '22', 'Summer 2023', 'TV'),
    ('Yu Yu Hakusho', 'Cuenta la historia de Yusuke Urameshi, un delincuente juvenil que es atropellado por un automóvil al intentar salvar la vida de un niño. En el otro mundo, es nombrado Detective Espiritual por Koenma y Botan, y debe investigar casos acerca de demonios y apariciones.', '/images/yuyu.jpg', 'https://www.youtube.com/embed/UQltPgNYDXM?si=ZG7hi2yLUVJhm1Pi', 'Pierrot', '112', '24', 'Fall 1992', 'TV'),
    ('Kimetsu no Yaiba', 'Narra las desventuras de Tanjiro, un joven de un Japón feudal fantástico que se ve abocado a la venganza después de que un demonio acabe con toda su familia, a excepción de su hermana, Nezuko, también demoníaca y sedienta de sangre.', '/images/kimetsu.jpg', 'https://www.youtube.com/embed/VQGCKyvzIM4?si=prRRq_p7J3Ah5v51', 'ufotable', '26', '23', 'Spring 2019', 'TV'),
    ('Jujutsu Kaisen', 'Nos cuenta la historia de Yuji Itadori, un estudiante de instituto que pasa sus días con sus amigos en el club de ocultismo de su escuela pero todo esto cambiara cuando descubre que los espíritus realmente existen y deberá reunir un objeto para salvar a sus amigos.', '/images/jujutsu.jpg', 'https://www.youtube.com/embed/pkKu9hLT-t8?si=3Mvs5ezTEHr3aeIY', 'MAPPA', '24', '23', 'Fall 2020', 'TV'),
    ('Bleach: Thousand-Year Blood War', 'Bleach se centra en Ichigo Kurosaki, un joven que puede ver a los espíritus. Cuando una shinigami llamada Rukia Kuchiki es herida al intentar protegerle de un monstruo conocido como Hollow, sin querer le traspasa sus poderes a Ichigo.', '/images/bleach2.jpg', 'https://www.youtube.com/embed/1sygUhb8Q2Y?si=pvv0F6h37gv50YY4', 'Pierrot', '13', '24', 'Fall 2022', 'TV'),
    ('Sousou no Frieren', 'La historia sigue a la maga elfa Frieren, una ex miembro del grupo de aventureros que derrotó al Rey Demonio y restauró la armonía en el mundo después de una búsqueda de diez años. En el pasado, el grupo heroico incluía a Frieren, el héroe humano Himmel, el guerrero enano Eisen y el sacerdote humano Heiter. Antes de separarse, observan juntos la Era Meteoros, una lluvia de meteoritos que ocurre una vez cada cincuenta años. Frieren acepta volver a verlos y ofrecerles una mejor vista la próxima vez que ocurra el evento celestial. Frieren luego parte y viaja por el mundo en busca del conocimiento mágico.', '/images/sousou.jpg', 'https://www.youtube.com/embed/f5ZEiJyqDKU?si=yv40peb6jWG_hYW2', 'Madhouse', 'Unknown', 'Unknown', 'Fall 2023', 'TV'),
    ('Tokyo Revengers: Tenjiku-hen', 'Al ver las noticias, Takemichi Hanagaki se entera de que su novia en el instituto, Hinata Tachibana, ha muerto. La única novia que tuvo fue asesinada por una pandilla conocida como Tokyo Manji Gang. Vive en un apartamento de paredes delgadas, y su jefe, seis años más joven, lo trata como un idiota. Y para rematar sigue virgen.Sin embargo, pese a esa desastrosa vida, un día ocurre un suceso y retrocede 12 años en el tiempo, hasta su época en el instituto.Para salvar a Hinata y cambiar esa vida que ha tenido, Takemichi tiene que convertirse en el líder de una de las pandillas de delincuentes de Kanto.', '/images/tokyo.jpg', 'https://www.youtube.com/embed/bMeWENMdq3k?si=gfk5onMHOUERJM9m', 'LIDENFILMS', 'Unknown', 'Unknown', 'Fall 2023', 'TV'),
    ('Shaman King: Flowers', 'Shaman King Flowers se lleva a cabo cerca de 16 años después de la pelea de chamanes. El personaje principal de la historia es Asakura Hana, hijo de Yoh Asakura y Anna Asakura.Hana ha crecido hasta convertirse en un niño perezoso y brutal. No se preocupa por sus estudios, se salta las clases, se mete en peleas entre pandillas y se siente muy aburrido de su vida cotidiana. Todo eso cambia cuando los miembros de la familia de la rama, Asakura Luca y Asakura Yohane, llegan a desafiar y matar a Hana y su padre Yoh para tomar su lugar como la casa principal. ', '/images/SHKF.jpg', 'https://www.youtube.com/embed/_IibHdCX7Nk?si=IyFhEZpXCAcwIUtz', 'Bridge', 'Unknown', 'Unknown', 'Winter 2024', 'TV');

-- Inserting relation into anime_genre
INSERT INTO anime_genre (anime_id, genre_id) VALUES (1,1),(1,2),(1,3),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(14,14),(15,15);

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
