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
-- Dumping data for table `dt_company`
--

LOCK TABLES `dt_company` WRITE;
/*!40000 ALTER TABLE `dt_company` DISABLE KEYS */;
INSERT INTO `dt_company` VALUES (1,'Universal studios','Thomas Williams','1988-07-01','universalpictures1@co.in','California','United States','www.universalpictures.com','Universal Pictures is an American film production and distribution company owned by Comcast through the NBCUniversal Film and Entertainment division of NBCUniversal'),(2,'Sony pictures','Tony vinciquerra','1975-05-08','sonypictures@co.in','California','United States','www.sonypictures.com','Sony Pictures is an American diversified multinational mass media and entertainment conglomerate that produces, acquires, and distributes filmed entertainment through multiple platforms.'),(3,'Marvel studios','Kevin feige','2008-08-20','marvelstudios@co.in','NewYork','United States','www.marvel.com','Marvel Studios, LLC is an American film and television studio that is a subsidiary of Walt Disney Studios, a division of The Walt Disney Company. Marvel Studios is known for the production of the Marv'),(4,'Walt disney studios','Bob chapek','1934-10-19','thewaltdisney@co.in','California','United States','www.waltdisneystudios.com','The Walt Disney Studios is an American film and entertainment studio, and is the Studios Content segment of The Walt Disney Company ,the studio is best known for its multi-faceted film divisions. Foun');
/*!40000 ALTER TABLE `dt_company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_genre`
--

LOCK TABLES `dt_genre` WRITE;
/*!40000 ALTER TABLE `dt_genre` DISABLE KEYS */;
INSERT INTO `dt_genre` VALUES (1,'Action'),(2,'Adventure'),(3,'Fantasy'),(4,'Sci-Fi'),(5,'Drama'),(6,'Horror'),(7,'Mystery'),(8,'Thriller'),(9,'Romance');
/*!40000 ALTER TABLE `dt_genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_language`
--

LOCK TABLES `dt_language` WRITE;
/*!40000 ALTER TABLE `dt_language` DISABLE KEYS */;
INSERT INTO `dt_language` VALUES (1,'Hindi'),(2,'English'),(3,'Spanish'),(4,'Tamil'),(5,'Malayalam'),(6,'Korean'),(7,'Japanese');
/*!40000 ALTER TABLE `dt_language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_movie`
--

LOCK TABLES `dt_movie` WRITE;
/*!40000 ALTER TABLE `dt_movie` DISABLE KEYS */;
INSERT INTO `dt_movie` VALUES (1,'Dangal','India','','2016-12-23','G',124,9497698,271329,8,15800123,'Former wrestler Mahavir Singh Phogat and his two wrestler daughters struggle towards glory at the Commonwealth Games in the face of societal oppression.'),(2,'Mission:Impossible Fallout','US','','2018-07-27','PG-13',199,150000000,271329,8,24800012,'Ethan Hunt and his IMF team, along with some familiar allies, race against time after a mission gone wrong.'),(3,'Drishyam','India','','2013-12-19','G',199,5156873,12739931,8,127890,'A man goes to extreme lengths to save his family from punishment after the family commits an accidental crime.'),(4,'PK','India','','2014-12-19','G',199,5186873,2739931,8,8976563,'An alien on Earth loses the only device he can use to communicate with his spaceship. His innocent nature and child-like questions force the country to evaluate the impact of religion on its people.'),(5,'The Matrix Revolutions','US','','2003-12-19','G',129,5186873,2739931,6,94567891,'The human city of Zion defends itself against the massive invasion of the machines as Neo fights to end the war at another front while also opposing the rogue Agent Smith.'),(6,'Anabelle','US','','2019-06-26','PG-13',106,30000000,741525915,5,1223524,'While babysitting the daughter of Ed and Lorraine Warren, a teenager and her friend unknowingly awaken an evil spirit trapped in a doll.'),(7,'Bahubali','India','','2015-07-12','G',139,18026148,741525915,8,14567061,'In ancient India, an adventurous and daring man becomes involved in a decades-old feud between two warring peoples.'),(8,'MIRZAPUR','India','','2018-06-15','G',139,18026148,741525915,8,54895707,'A shocking incident at a wedding procession ignites a series of events entangling the lives of two families in the lawless city of Mirzapur.');
/*!40000 ALTER TABLE `dt_movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_person`
--

LOCK TABLES `dt_person` WRITE;
/*!40000 ALTER TABLE `dt_person` DISABLE KEYS */;
INSERT INTO `dt_person` VALUES (1,'Tom','Cruise','Male','actor','tom101@gmail.com','1962-07-03',59,1,'American','https://www.imdb.com/name/nm0000129/?ref_=fn_al_nm_1'),(2,'Henry','Cavill','Male','actor','henry102@gmail.com','1983-05-05',38,1,'American','https://www.imdb.com/name/nm0147147/bio?ref_=nm_ov_bio_sm'),(3,'Vince','Rhames','Male','actor','vince10@gmail.com','1959-05-12',62,1,'American','https://www.imdb.com/name/nm0000609/bio?ref_=nm_ov_bio_sm'),(4,'Christopher','Quarrie','Male','Director','chris123@gmail.com','1968-10-25',53,1,'American','https://www.imdb.com/name/nm0003160/bio?ref_=nm_ov_bio_sm'),(5,'Bruce','Keller','Male','Writer','bruce11@gmail.com','1930-10-13',48,0,'American','https://www.imdb.com/name/nm0312367/?ref_=ttfc_fc_wr1'),(6,'Lorne','Balfe','Male','Music composer','lorne333@gmail.com','1976-02-23',45,1,'Scottish','https://www.imdb.com/name/nm1154632/?ref_=ttfc_fc_cr12'),(7,'Rob','Hardy','Male','Cinematographer','robbie211@gmail.com','1970-02-12',51,1,'British','https://www.imdb.com/name/nm1134771/bio?ref_=nm_ov_bio_sm'),(8,'Eddie','Hamilton','Male','Film-editor','eddie28@gmail.com','1982-02-11',39,1,'British','https://www.imdb.com/name/nm0357835/?ref_=ttfc_fc_cr14'),(9,'Aamir','Khan','Male','Actor','aamir321@gmail.com','1965-03-14',56,1,'Indian','https://www.imdb.com/name/nm0451148/?ref_=tt_cl_t_1'),(10,'Sakshi','Tanwar','Female','Actress','sakshi242@gmail.com','1973-01-12',48,1,'Indian','https://www.imdb.com/name/nm2799219/?ref_=tt_cl_t_2'),(11,'Nitesh','Tiwari','Male','Director','nitesh455@gmail.com','1973-06-17',48,1,'Indian','https://www.imdb.com/name/nm4318159/bio?ref_=nm_ov_bio_sm'),(12,'Piyush','Gupta','Male','Writer','piyush378@gmail.com','1980-06-17',41,1,'Indian','https://www.imdb.com/name/nm6328029/bio?ref_=nm_ov_bio_sm'),(13,'Pritam','Chakraborty','Male','Music-composer','pritam123@gmail.com','1971-06-17',50,1,'Indian','https://www.imdb.com/name/nm1338587/?ref_=ttfc_fc_cr11'),(14,'Satyajit','Pandey','Male','Cinematographer','satya200@gmail.com','1985-06-17',31,1,'Indian','https://www.imdb.com/name/nm1146016/?ref_=ttfc_fc_cr12'),(15,'Ajay','Devgan','Male','Actor','ajaydevgan@vimal.com','1969-04-02',52,1,'Indian','https://www.imdb.com/name/nm1146016/?ref_=ttfc_fc_cr12'),(16,'Shriya','Saran','Female','Actress','shriya266@gmail.com','1982-09-11',39,1,'Indian','https://www.imdb.com/name/nm1328152/?ref_=tt_cl_t_2'),(17,'Nishikant','Kamat','Male','Director','nishi224@gmail.com','1970-09-17',51,1,'Indian','https://www.imdb.com/name/nm1723225/?ref_=tt_cl_dr_1');
/*!40000 ALTER TABLE `dt_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_user`
--

LOCK TABLES `dt_user` WRITE;
/*!40000 ALTER TABLE `dt_user` DISABLE KEYS */;
INSERT INTO `dt_user` VALUES (1,'ATHIRA','K','USER','athira234','athira@1996','athira@gmail.com','ADMIN','2021-09-08','2021-09-10'),(2,'KUNAL','SALUNKHE','USER','kunal@05','kunal123','kunal@gmail.com','USER','2021-09-10','2021-09-12'),(3,'SHIVAM','DHOUNDIYAL','ADMIN','shivam_dhoundiyal','shivam@06','shivam@gmail.com','ADMIN','2021-09-05','2021-09-16');
/*!40000 ALTER TABLE `dt_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_user_activity`
--

LOCK TABLES `dt_user_activity` WRITE;
/*!40000 ALTER TABLE `dt_user_activity` DISABLE KEYS */;
INSERT INTO `dt_user_activity` VALUES (1,'USER_ADD_MOVIE_TO_WATCHLIST','',1,1),(2,'USER_ADD_MOVIE_TO_WATCHLIST','',1,2);
/*!40000 ALTER TABLE `dt_user_activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_user_watchlist`
--

LOCK TABLES `dt_user_watchlist` WRITE;
/*!40000 ALTER TABLE `dt_user_watchlist` DISABLE KEYS */;
INSERT INTO `dt_user_watchlist` VALUES (1,1,'MY_WATCHLIST_1'),(2,1,'MY_WATCHLIST_2'),(3,2,'MY_WATCHLIST');
/*!40000 ALTER TABLE `dt_user_watchlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_movie_cast`
--

LOCK TABLES `lt_movie_cast` WRITE;
/*!40000 ALTER TABLE `lt_movie_cast` DISABLE KEYS */;
INSERT INTO `lt_movie_cast` VALUES (2,1,500000,'HERO'),(2,2,400000,'VILLIAN');
/*!40000 ALTER TABLE `lt_movie_cast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_movie_company`
--

LOCK TABLES `lt_movie_company` WRITE;
/*!40000 ALTER TABLE `lt_movie_company` DISABLE KEYS */;
INSERT INTO `lt_movie_company` VALUES (1,4);
/*!40000 ALTER TABLE `lt_movie_company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_movie_crew`
--

LOCK TABLES `lt_movie_crew` WRITE;
/*!40000 ALTER TABLE `lt_movie_crew` DISABLE KEYS */;
INSERT INTO `lt_movie_crew` VALUES (2,1,1800000,'PRODUCER'),(2,4,800000,'DIRECTOR'),(2,7,300000,'CINEMATOGRAPHER');
/*!40000 ALTER TABLE `lt_movie_crew` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_movie_genre`
--

LOCK TABLES `lt_movie_genre` WRITE;
/*!40000 ALTER TABLE `lt_movie_genre` DISABLE KEYS */;
INSERT INTO `lt_movie_genre` VALUES (1,1),(2,1),(2,2),(1,5),(3,5),(2,8),(3,8);
/*!40000 ALTER TABLE `lt_movie_genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_movie_language`
--

LOCK TABLES `lt_movie_language` WRITE;
/*!40000 ALTER TABLE `lt_movie_language` DISABLE KEYS */;
INSERT INTO `lt_movie_language` VALUES (1,1),(4,1),(2,2),(3,4),(4,4),(3,5);
/*!40000 ALTER TABLE `lt_movie_language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_user_movie`
--

LOCK TABLES `lt_user_movie` WRITE;
/*!40000 ALTER TABLE `lt_user_movie` DISABLE KEYS */;
INSERT INTO `lt_user_movie` VALUES (1,1,1,1,0,8,'Good Movie'),(1,2,1,0,0,8,'Good Movie'),(2,1,1,1,0,8,'Good Movie'),(2,2,1,0,0,8,'Nice Movie');
/*!40000 ALTER TABLE `lt_user_movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_user_watchlist_items`
--

LOCK TABLES `lt_user_watchlist_items` WRITE;
/*!40000 ALTER TABLE `lt_user_watchlist_items` DISABLE KEYS */;
INSERT INTO `lt_user_watchlist_items` VALUES (1,1,'Write a blog abou leonardo cast','2021-09-01'),(2,2,'recommend to friends','2021-09-02'),(3,1,'resume from 1h 30m','2021-09-03');
/*!40000 ALTER TABLE `lt_user_watchlist_items` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-20 13:45:37
