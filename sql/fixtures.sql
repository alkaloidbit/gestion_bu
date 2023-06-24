
USE `gestion_bu`;

-- Users --
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `passwd`) VALUES (NULL, 1, 'Frédéric', 'Oudjoudi', 'fredoudjoudi@gmail.com', 'DzS/wHe/Jw2uw/bCL3HGzMsdYDSDR7kHcx/8Yb2Jqd8=');
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `passwd`) VALUES (NULL, 0, 'Clive', 'Roberts', 'cliveroberts@ucsql.com', 'DzS/wHe/Jw2uw/bCL3HGzMsdYDSDR7kHcx/8Yb2Jqd8=');
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `passwd`) VALUES (NULL, 1, 'fred', 'oudjoudi', 'fo', 'DzS/wHe/Jw2uw/bCL3HGzMsdYDSDR7kHcx/8Yb2Jqd8=');
INSERT INTO `user` (`id_user`, `is_admin`, `first_name`, `last_name`, `email`, `passwd`) VALUES (NULL, 0, 'Clive', 'Roberts', 'cr', 'DzS/wHe/Jw2uw/bCL3HGzMsdYDSDR7kHcx/8Yb2Jqd8=');


INSERT INTO `edition` ( `name`) VALUES ( 'Hoboken, NJ : John Wiley & Sons, Inc.');
INSERT INTO `genre` ( `name`) VALUES ( 'For dummies');
INSERT INTO `author` ( `first_name`, `last_name`) VALUES ( 'Mueller', 'John Paul');
INSERT INTO `document` ( `title`, `pages_nbr`, `id_edition`, `id_genre`, `year`) VALUES ( 'Beginning programming with Python ', '392', 1, 1, '2018');
INSERT INTO `compose` ( `id_author`, `id_document`) VALUES (1, 1);


INSERT INTO `edition` (`name`) VALUES ( 'Paris: First interactive');
INSERT INTO `genre` (`name`) VALUES ( 'Pour les nuls');
INSERT INTO `document` (`title`, `pages_nbr`, `id_edition`, `id_genre`, `year`) VALUES ( 'Python', '388', 2, 2, '2018');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (1, 2);

INSERT INTO `edition` (`name`) VALUES ( 'Birmingham, UK : Packt Publishing');
INSERT INTO `document` (`title`, `pages_nbr`, `id_edition`, `id_genre`, `year`) VALUES (
   'Python 3 object-oriented programming ', '452', 3, NULL, '2018');
INSERT INTO `author` ( `first_name`, `last_name`) VALUES ( 'Dusty', 'Phillips');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (2, 3);


INSERT INTO `edition` ( `name`) VALUES ( "New York : Apress");
INSERT INTO `genre` ( `name`) VALUES ( "The expert's voice in open source");
INSERT INTO `document` (`title`, `pages_nbr`, `id_edition`, `id_genre`, `year`) VALUES (
   'Dive into Python 3', '360', 4, 3, '2008');
INSERT INTO `author` ( `first_name`, `last_name`) VALUES ( 'Mark', 'Pilgrim');
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (3, 4);

-- A second author for document 4
INSERT INTO `compose` (`id_author`, `id_document`) VALUES (2, 4);

