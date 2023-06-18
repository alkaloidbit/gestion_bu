
USE `gestion_bu`;

-- Users --
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `passwd`) VALUES (NULL, 1, 'Frédéric', 'Oudjoudi', 'fredoudjoudi@gmail.com', 'foo');
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `passwd`) VALUES (NULL, 0, 'Clive', 'Roberts', 'cliveroberts@ucsql.com', 'foo');

INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, 'Hoboken, NJ : John Wiley & Sons, Inc.');
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (NULL, 'Beginning programming with Python ', '392', 1, '2018');
INSERT INTO `author` (`id_author`, `first_name`, `last_name`) VALUES (NULL, 'Mueller', 'John Paul');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (1, 1);
INSERT INTO `genre` (`id_genre`, `name`) VALUES (NULL, 'For dummies');
INSERT INTO `belongs` (`id_document`, `id_genre`) VALUES (1, 1);


INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, 'Paris: First interactive');
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (NULL, 'Python', '388', 2, '2018');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (1, 2);
INSERT INTO `genre` (`id_genre`, `name`) VALUES (NULL, 'Pour les nuls');
INSERT INTO `belongs` (`id_document`, `id_genre`) VALUES (2, 2);

INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, 'Birmingham, UK : Packt Publishing');
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (
  NULL, 'Python 3 object-oriented programming ', '452', 3, '2018');
INSERT INTO `author` (`id_author`, `first_name`, `last_name`) VALUES (NULL, 'Dusty', 'Phillips');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (2, 3);


INSERT INTO `edition` (`id_edition`, `name`) VALUES (NULL, "New York : Apress");
INSERT INTO `document` (`id_document`, `title`, `pages_nbr`, `id_edition`, `year`) VALUES (
  NULL, 'Dive into Python 3', '360', 4, '2008');
INSERT INTO `author` (`id_author`, `first_name`, `last_name`) VALUES (NULL, 'Mark', 'Pilgrim');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (3, 4);
INSERT INTO `genre` (`id_genre`, `name`) VALUES (NULL, "The expert's voice in open source");
INSERT INTO `belongs` (`id_document`, `id_genre`) VALUES (4, 3);


