-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: moviedb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dt_company`
--

DROP TABLE IF EXISTS `dt_company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_company` (
  `company_id` int NOT NULL AUTO_INCREMENT,
  `company_name` varchar(30) DEFAULT NULL,
  `ceo` varchar(30) DEFAULT NULL,
  `established_in` date DEFAULT NULL,
  `email_id` varchar(30) DEFAULT NULL,
  `headquarter` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `website` varchar(40) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_genre`
--

DROP TABLE IF EXISTS `dt_genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_genre` (
  `genre_id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`genre_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_language`
--

DROP TABLE IF EXISTS `dt_language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_language` (
  `language_id` int NOT NULL AUTO_INCREMENT,
  `language` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`language_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_movie`
--

DROP TABLE IF EXISTS `dt_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_movie` (
  `movie_id` int NOT NULL AUTO_INCREMENT,
  `movie_title` varchar(50) DEFAULT NULL,
  `country_of_origin` varchar(50) DEFAULT NULL,
  `movie_poster` blob,
  `release_date` date DEFAULT NULL,
  `pg_rating` enum('G','PG','PG-13','R','X') DEFAULT NULL,
  `runtime` int DEFAULT NULL,
  `budget_dollar` int DEFAULT NULL,
  `total_gross_income_dollar` int DEFAULT NULL,
  `overall_rating` float DEFAULT NULL,
  `no_of_recommendations` int DEFAULT NULL,
  `overview` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_person`
--

DROP TABLE IF EXISTS `dt_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_person` (
  `person_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `gender` enum('Male','Female') DEFAULT NULL,
  `role` varchar(30) DEFAULT NULL,
  `email_id` varchar(30) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `age` int DEFAULT NULL,
  `date_of_death` date DEFAULT NULL,
  `nationality` varchar(20) DEFAULT NULL,
  `imdb_link` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_user`
--

DROP TABLE IF EXISTS `dt_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `role` enum('ADMIN','USER') DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `last_password_change` date DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `password` (`password`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_user_activity`
--

DROP TABLE IF EXISTS `dt_user_activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_user_activity` (
  `activity_id` int NOT NULL AUTO_INCREMENT,
  `activity_type` enum('USER_ADD_MOVIE_TO_WATCHLIST','USER_REMOVE_MOVIE_FROM WATCHLIST','USER_RATED_MOVIE','USER_FEEDBACK_MOVIE','USER_ADD_MOVIE_TO_FAVOURITES','USER_RECOMMENDED_MOVIE') DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  PRIMARY KEY (`activity_id`),
  KEY `user_id` (`user_id`),
  KEY `movie_id` (`movie_id`),
  CONSTRAINT `dt_user_activity_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `dt_user` (`user_id`) ON DELETE CASCADE,
  CONSTRAINT `dt_user_activity_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_user_watchlist`
--

DROP TABLE IF EXISTS `dt_user_watchlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_user_watchlist` (
  `watchlist_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `watchlist_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`watchlist_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `dt_user_watchlist_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `dt_user` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_movie_cast`
--

DROP TABLE IF EXISTS `lt_movie_cast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_movie_cast` (
  `movie_id` int NOT NULL,
  `person_id` int NOT NULL,
  `remuneration` int DEFAULT NULL,
  `actor_role` enum('HERO','HEROINE','VILLIAN','SUPPORTING') DEFAULT NULL,
  PRIMARY KEY (`movie_id`,`person_id`),
  KEY `person_id` (`person_id`),
  CONSTRAINT `lt_movie_cast_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_movie_cast_ibfk_2` FOREIGN KEY (`person_id`) REFERENCES `dt_person` (`person_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_movie_company`
--

DROP TABLE IF EXISTS `lt_movie_company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_movie_company` (
  `movie_id` int NOT NULL,
  `company_id` int NOT NULL,
  PRIMARY KEY (`movie_id`,`company_id`),
  KEY `company_id` (`company_id`),
  CONSTRAINT `lt_movie_company_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_movie_company_ibfk_2` FOREIGN KEY (`company_id`) REFERENCES `dt_company` (`company_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_movie_crew`
--

DROP TABLE IF EXISTS `lt_movie_crew`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_movie_crew` (
  `movie_id` int NOT NULL,
  `person_id` int NOT NULL,
  `remuneration` int DEFAULT NULL,
  `crew_role` enum('DIRECTOR','PRODUCER','WRITER','CINEMATOGRAPHER','COSTUME DESIGNER','CAMERAMAN') DEFAULT NULL,
  PRIMARY KEY (`movie_id`,`person_id`),
  KEY `person_id` (`person_id`),
  CONSTRAINT `lt_movie_crew_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_movie_crew_ibfk_2` FOREIGN KEY (`person_id`) REFERENCES `dt_person` (`person_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_movie_genre`
--

DROP TABLE IF EXISTS `lt_movie_genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_movie_genre` (
  `movie_id` int NOT NULL,
  `genre_id` int NOT NULL,
  PRIMARY KEY (`movie_id`,`genre_id`),
  KEY `genre_id` (`genre_id`),
  CONSTRAINT `lt_movie_genre_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_movie_genre_ibfk_2` FOREIGN KEY (`genre_id`) REFERENCES `dt_genre` (`genre_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_movie_language`
--

DROP TABLE IF EXISTS `lt_movie_language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_movie_language` (
  `movie_id` int NOT NULL,
  `language_id` int NOT NULL,
  PRIMARY KEY (`movie_id`,`language_id`),
  KEY `language_id` (`language_id`),
  CONSTRAINT `lt_movie_language_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_movie_language_ibfk_2` FOREIGN KEY (`language_id`) REFERENCES `dt_language` (`language_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_user_movie`
--

DROP TABLE IF EXISTS `lt_user_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_user_movie` (
  `user_id` int NOT NULL,
  `movie_id` int NOT NULL,
  `is_watched` tinyint(1) DEFAULT NULL,
  `is_favourite` tinyint(1) DEFAULT NULL,
  `is_recommended` tinyint(1) DEFAULT NULL,
  `rating_given` float DEFAULT NULL,
  `review` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`user_id`,`movie_id`),
  KEY `movie_id` (`movie_id`),
  CONSTRAINT `lt_user_movie_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `dt_user` (`user_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_user_movie_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_user_watchlist_items`
--

DROP TABLE IF EXISTS `lt_user_watchlist_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_user_watchlist_items` (
  `watchlist_id` int NOT NULL,
  `movie_id` int NOT NULL,
  `notes` varchar(200) DEFAULT NULL,
  `date_added` date NOT NULL,
  PRIMARY KEY (`watchlist_id`,`movie_id`),
  KEY `watchlist_id` (`watchlist_id`),
  KEY `movie_id` (`movie_id`),
  CONSTRAINT `lt_user_watchlist_items_ibfk_1` FOREIGN KEY (`watchlist_id`) REFERENCES `dt_user_watchlist` (`watchlist_id`) ON DELETE CASCADE,
  CONSTRAINT `lt_user_watchlist_items_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `dt_movie` (`movie_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-21 13:56:59
