DROP DATABASE IF EXISTS `gestion_bu`;
CREATE DATABASE IF NOT EXISTS `gestion_bu` DEFAULT CHARACTER SET UTF8MB4 COLLATE utf8mb4_unicode_ci;
USE `gestion_bu`;

CREATE TABLE `appartenir` (
  `id_document` int(11) NOT NULL,
  `id_genre` int(11) NOT NULL,
  PRIMARY KEY (`id_document`, `id_genre`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `author` (
  `id_author` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50),
  `surname` varchar(50),
  PRIMARY KEY (`id_author`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `document` (
  `id_document` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(255) NOT NULL,
  `nbre_pages` smallint NOT NULL,
  `id_edition` int(11) NOT NULL,
  `année` varchar(4) NOT NULL,
  PRIMARY KEY (`id_document`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `ecrire` (
  `id_author` int(11) NOT NULL,
  `id_document` int(11) NOT NULL,
  PRIMARY KEY (`id_author`, `id_document`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `edition` (
  `id_edition` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id_edition`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `emprunter` (
  `id_exemplaire` int(11),
  `id_user` int(11),
  `date_emprunt` date,
  `date_retour` date,
  PRIMARY KEY (`id_exemplaire`, `id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `exemplaire` (
  `id_exemplaire` int(11) NOT NULL AUTO_INCREMENT,
  `id_document` int(11) NOT NULL,
  PRIMARY KEY (`id_exemplaire`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `genre` (
  `id_genre` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id_genre`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `is_admin` boolean NOT NULL DEFAULT false,
  `name` varchar(255) NOT NULL,
  `surname` varchar (255) NOT NULL,
  `email` varchar (255) NOT NULL,
  `password` varchar (255) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;
ALTER TABLE `user` ADD CONSTRAINT UNIQ_8567 UNIQUE(`email`);
ALTER TABLE `appartenir` ADD FOREIGN KEY (`id_genre`) REFERENCES `genre` (`id_genre`);
ALTER TABLE `appartenir` ADD FOREIGN KEY (`id_document`) REFERENCES `document` (`id_document`);
ALTER TABLE `document` ADD FOREIGN KEY (`id_edition`) REFERENCES `edition` (`id_edition`);
ALTER TABLE `ecrire` adD FOREIGN KEY (`id_document`) REFERENCES `document` (`id_document`);
ALTER TABLE `ecrire` adD FOREIGN KEY (`id_author`) REFERENCES `author` (`id_author`);
ALTER TABLE `emprunter` ADD FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);
ALTER TABLE `emprunter` ADD FOREIGN KEY (`id_exemplaire`) REFERENCES `exemplaire` (`id_exemplaire`);
ALTER TABLE `exemplaire` ADD FOREIGN KEY (`id_document`) REFERENCES `document` (`id_document`);
