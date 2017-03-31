-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 05 Mars 2017 à 23:58
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gestionoffrestage`
--

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE IF NOT EXISTS `entreprise` (
  `IDE` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NOM` varchar(50) NOT NULL,
  `ADRESSENUMERORUE` varchar(50) NOT NULL,
  `ADRESSECODEPOSTAL` int(5) unsigned NOT NULL,
  `ADRESSEVILLE` varchar(50) NOT NULL,
  `MAIL` varchar(30) NOT NULL,
  `TELEPHONE` varchar(30) NOT NULL,
  `SECTEURACTIVITE` varchar(50) NOT NULL,
  PRIMARY KEY (`IDE`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=28 ;

--
-- Contenu de la table `entreprise`
--

INSERT INTO `entreprise` (`IDE`, `NOM`, `ADRESSENUMERORUE`, `ADRESSECODEPOSTAL`, `ADRESSEVILLE`, `MAIL`, `TELEPHONE`, `SECTEURACTIVITE`) VALUES
(23, 'macdo', '33 rue manet', 91480, 'Quincy sous senart', 'rkajy@hotmail.fr', '0658746284', 'fast food'),
(24, 'Airbus', '3 avenue de toulouse', 31400, 'Toulouse', 'rh@airbus.com', '0658746284', 'Aviation'),
(25, 'Atos', '3 avenue de france', 91000, 'Evry', 'rh@atos.com', '0658748584', 'devellopement'),
(26, 'Genopole', '3 avenue de picard', 91400, 'Evry', 'rh@genopole.com', '0658746284', 'R&D'),
(27, 'meetic', '3 avenue de paris', 77400, 'paris', 'rh@meetic.com', '0658749084', 'web');

-- --------------------------------------------------------

--
-- Structure de la table `offrestage`
--

CREATE TABLE IF NOT EXISTS `offrestage` (
  `IDO` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDE` int(10) unsigned NOT NULL,
  `LIBELLEOFFRE` varchar(50) NOT NULL,
  `DESCRIPTIFOFFRE` text NOT NULL,
  `DOMAINEOFFRE` varchar(50) NOT NULL,
  `DATEDEBUTOFFRE` varchar(50) NOT NULL,
  `DUREEOFFRE` int(10) unsigned NOT NULL,
  `CHEMINOFFRE` varchar(50) NOT NULL,
  `VALIDE` tinyint(1) NOT NULL,
  PRIMARY KEY (`IDO`,`IDE`),
  KEY `fk_ide_offrestage` (`IDE`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=19 ;

--
-- Contenu de la table `offrestage`
--

INSERT INTO `offrestage` (`IDO`, `IDE`, `LIBELLEOFFRE`, `DESCRIPTIFOFFRE`, `DOMAINEOFFRE`, `DATEDEBUTOFFRE`, `DUREEOFFRE`, `CHEMINOFFRE`, `VALIDE`) VALUES
(16, 23, 'lib mac do', 'description macdo', 'Développement', 'date macdo', 35, 'chemin macdo', 1),
(17, 23, 'lib mac do', 'description macdo', 'Développement', 'date macdo', 35, 'chemin macdo', 1),
(18, 23, 'lib 41', 'description 41', 'Développement', 'date 41', 30, 'chemin 41', 1);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `offrestage`
--
ALTER TABLE `offrestage`
  ADD CONSTRAINT `fk_ide_offrestage` FOREIGN KEY (`IDE`) REFERENCES `entreprise` (`IDE`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
