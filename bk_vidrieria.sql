-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: vidrieria
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `id_admin` varchar(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `contrase├▒a` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES ('1','luis','luis'),('2','ana','ana'),('3','invoker','invoker');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id_cliente` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `distrito` varchar(20) DEFAULT NULL,
  `estado` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'luis','cueva','luis','12','call','La Mo','Cerca al c');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cliente` (
  `id_cliente` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `distrito` varchar(20) DEFAULT NULL,
  `estado` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (2,'asdd','asdasd','asdas','asdsad','asdasd','asd','dsa'),(3,'dsad','dasd','sdas','dasdda','asd','asdas','dsa');
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_precio`
--

DROP TABLE IF EXISTS `tb_precio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_precio` (
  `id_Precio` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  `precio` int(11) NOT NULL,
  PRIMARY KEY (`id_Precio`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_precio`
--

LOCK TABLES `tb_precio` WRITE;
/*!40000 ALTER TABLE `tb_precio` DISABLE KEYS */;
INSERT INTO `tb_precio` VALUES (1,'Espejo',7),(2,'Catedral 03mm',4),(3,'Incoloro 04mm ',7),(4,'Incoloro 06mm ',8),(5,'Incoloro 08mm ',10),(6,'Incoloro 10mm',12),(7,'Bronce 04mm',6),(8,'Bronce 06mm',8),(9,'Bronce 08mm',10),(10,'Bronce 10mm',12),(11,'Ventana Crudo Incoloro 06 mm',70),(12,'Ventana Crudo Incoloro 08 mm',100),(13,'Ventana Crudo Incoloro 10 mm',140),(14,'Ventana Templado Incoloro 06 mm',162),(15,'Ventana Templado Incoloro 08 mm',260),(16,'Ventana Templado Incoloro 10 mm',320),(17,'Ducha Crudo Incoloro 06 mm',100),(18,'Ducha Crudo Incoloro 08 mm',150),(19,'Ducha Crudo Incoloro 10 mm',200),(20,'Ducha Templado Incoloro 06 mm',100),(21,'Ducha Templado Incoloro 08 mm',150),(22,'Ducha Templado Incoloro 10 mm',200),(23,'Mampara Crudo Incoloro 06 mm',100),(24,'Mampara Crudo Incoloro 08 mm',150),(25,'Mampara Crudo Incoloro 10 mm',200),(26,'Mampara Templado Incoloro 06 mm',180),(27,'Mampara Templado Incoloro 08 mm',220),(28,'Mampara Templado Incoloro 10 mm',260),(29,'Puerta Templado Incoloro 06 mm',180),(30,'Puerta Templado Incoloro 08 mm',220),(31,'Puerta Templado Incoloro 10 mm',260);
/*!40000 ALTER TABLE `tb_precio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-01 20:56:37
