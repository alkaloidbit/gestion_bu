
USE `gestion_bu`;

-- Users --
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `password`) VALUES (NULL, '1', 'Oudjoudi', 'Frédéric', 'fredoudjoudi@gmail.com', 'aliboulala');
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `password`) VALUES (NULL, '0', 'Roberts', 'Clive', 'cliveroberts@sql-university.com', 'password');

-- Editor --
INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, 'Hoboken, NJ : John Wiley & Sons, Inc.');
-- Document --
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (NULL, 'Beginning programming with Python ', '392', '1', '2018');
-- author --
INSERT INTO `author` (`id_author`, `name`, `surname`) VALUES (NULL, 'Mueller', 'John Paul');
-- compose --
INSERT INTO `compose` (`id_author`, `id_document`) VALUES ('1', '1');
-- Genre --
INSERT INTO `genre` (`id_genre`, `name`) VALUES (NULL, 'For dummies');
-- belongs --
INSERT INTO `belongs` (`id_document`, `id_genre`) VALUES (1, 1);


-- Editor --
INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, 'Birmingham, UK : Packt Publishing');
-- Document --
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (
  NULL, 'Python 3 object-oriented programming ', '452', '2', '2018');
-- author --
INSERT INTO `author` (`id_author`, `name`, `surname`) VALUES (NULL, 'Dusty', 'Phillips');
-- compose --
INSERT INTO `compose` (`id_author`, `id_document`) VALUES ('2', '2');


-- Editor --
INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, "[New York] : Apress");
-- Document --
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (
  NULL, 'Dive into Python 3', '360', '3', '2008');
-- author --
INSERT INTO `author` (`id_author`, `name`, `surname`) VALUES (NULL, 'Mark', 'Pilgrim');
-- compose --
INSERT INTO `compose` (`id_author`, `id_document`) VALUES ('3', '3');

INSERT INTO `genre` (`id_genre`, `name`) VALUES (NULL, "The expert's voice in open source");

INSERT INTO `belongs` (`id_document`, `id_genre`) VALUES (3, 2);


