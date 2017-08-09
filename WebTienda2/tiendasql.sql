-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema vidrieria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vidrieria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vidrieria` ;
USE `vidrieria` ;

-- -----------------------------------------------------
-- Table `vidrieria`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vidrieria`.`Cliente` (
  `idCliente` INT NOT NULL COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `direccion` VARCHAR(45) NULL COMMENT '',
  `fecha` DATE NULL COMMENT '',
  PRIMARY KEY (`idCliente`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vidrieria`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vidrieria`.`Usuario` (
  `user` INT NOT NULL COMMENT '',
  `password` VARCHAR(8) NOT NULL COMMENT '',
  PRIMARY KEY (`user`)  COMMENT '')
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
