-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: gitpub_schema
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `drinks`
--

DROP TABLE IF EXISTS `drinks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drinks` (
  `Guinness` int NOT NULL,
  `Heineken` int NOT NULL,
  `Orchard Thieves` int NOT NULL,
  `Vodka` int NOT NULL,
  `Jameson` int NOT NULL,
  `Bacardi` int NOT NULL,
  `Gin` int NOT NULL,
  `Dash` int NOT NULL,
  `Mineral` int NOT NULL,
  `Tonic` int NOT NULL,
  `Baby Guinness` int NOT NULL,
  `Tequila` int NOT NULL,
  `Sambucca` int NOT NULL,
  `AfterShock` int NOT NULL,
  `Old Fashioned` int NOT NULL,
  `Daquiri` int NOT NULL,
  `Sex On The Beach` int NOT NULL,
  `Martini` int NOT NULL,
  `Whiskey Sours` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drinks`
--

LOCK TABLES `drinks` WRITE;
/*!40000 ALTER TABLE `drinks` DISABLE KEYS */;
/*!40000 ALTER TABLE `drinks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locations` (
  `Location` varchar(45) NOT NULL,
  `Eyre Square` varchar(45) NOT NULL,
  `Shop Street` varchar(45) NOT NULL,
  `Latin Quarter` varchar(45) NOT NULL,
  `Other` varchar(45) NOT NULL,
  PRIMARY KEY (`Location`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pubs`
--

DROP TABLE IF EXISTS `pubs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pubs` (
  `PubNames` varchar(45) NOT NULL,
  `Darcy's` linestring NOT NULL,
  `Barr Na Chaladh` linestring NOT NULL,
  `Blue Note` linestring NOT NULL,
  `Roisin Dubh` linestring NOT NULL,
  `Monroes` linestring NOT NULL,
  `Mary Mullins` linestring NOT NULL,
  `Busker Brownes` linestring NOT NULL,
  `Skeff` linestring NOT NULL,
  `Massimos` linestring NOT NULL,
  `Taylors` linestring NOT NULL,
  `Taffes` linestring NOT NULL,
  `Fibbers` linestring NOT NULL,
  PRIMARY KEY (`PubNames`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pubs`
--

LOCK TABLES `pubs` WRITE;
/*!40000 ALTER TABLE `pubs` DISABLE KEYS */;
/*!40000 ALTER TABLE `pubs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviews`
--

DROP TABLE IF EXISTS `reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reviews` (
  `DarcyReviews` int NOT NULL,
  `BarrNaChaladhReviews` varchar(45) NOT NULL,
  `BlueNoteReviews` varchar(45) NOT NULL,
  `RoisinDubhReviews` varchar(45) NOT NULL,
  `MonroesReviews` varchar(45) NOT NULL,
  `MaryMullinsReviews` varchar(45) NOT NULL,
  `BuskerBrownesReviews` varchar(45) NOT NULL,
  `SkeffReviews` varchar(45) NOT NULL,
  `MassimosReviews` varchar(45) NOT NULL,
  `TaylorsReviews` varchar(45) NOT NULL,
  `TaffesReviews` varchar(45) NOT NULL,
  `FibbersReviews` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviews`
--

LOCK TABLES `reviews` WRITE;
/*!40000 ALTER TABLE `reviews` DISABLE KEYS */;
/*!40000 ALTER TABLE `reviews` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-22 13:36:36
