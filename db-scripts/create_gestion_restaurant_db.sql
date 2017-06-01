-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema gestion_restaurant
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema gestion_restaurant
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gestion_restaurant` DEFAULT CHARACTER SET utf8 ;
USE `gestion_restaurant` ;

-- -----------------------------------------------------
-- Table `gestion_restaurant`.`cuentaCorriente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`cuentacorriente` (
  `idCuentaCorriente` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL,
  `fechaAlta` DATE NULL,
  `baja` BIT(1) NULL DEFAULT b'0',
  `total` DOUBLE NULL,
  PRIMARY KEY (`idCuentaCorriente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`tipoCliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`tipocliente` (
  `idTipoCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idTipoCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `idCuentaCorriente` INT NULL,
  `idTipoCliente` INT NULL,
  `dni` INT NULL,
  `habitacion` INT NULL,
  PRIMARY KEY (`idCliente`),
  INDEX `fk_cliente_cuentaCorriente_idx` (`idCuentaCorriente` ASC),
  INDEX `tipoCliente_idx` (`idTipoCliente` ASC),
  CONSTRAINT `cuentaCorriente`
    FOREIGN KEY (`idCuentaCorriente`)
    REFERENCES `gestion_restaurant`.`cuentaCorriente` (`idCuentaCorriente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `tipoCliente`
    FOREIGN KEY (`idTipoCliente`)
    REFERENCES `gestion_restaurant`.`tipoCliente` (`idTipoCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`ingrediente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`ingrediente` (
  `idIngrediente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `stock` DOUBLE NULL,
  `unidad` VARCHAR(5) NULL,
  PRIMARY KEY (`idIngrediente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`rubro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`rubro` (
  `idRubro` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idRubro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `idRubro` INT NULL,
  `descripcion` VARCHAR(45) NULL,
  `baja` BIT(1) NULL DEFAULT b'1',
  PRIMARY KEY (`idProducto`),
  INDEX `fk_rubro_idx` (`idRubro` ASC),
  CONSTRAINT `fk_rubro`
    FOREIGN KEY (`idRubro`)
    REFERENCES `gestion_restaurant`.`rubro` (`idRubro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`componente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`componente` (
  `idComponente` INT NOT NULL AUTO_INCREMENT,
  `idProducto` INT NULL,
  `idIngrediente` INT NULL,
  `cantidad` DOUBLE NULL,
  PRIMARY KEY (`idComponente`),
  INDEX `fk_producto_receta_idx` (`idProducto` ASC),
  INDEX `fk_ingrediente_receta_idx` (`idIngrediente` ASC),
  CONSTRAINT `fk_producto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ingrediente`
    FOREIGN KEY (`idIngrediente`)
    REFERENCES `gestion_restaurant`.`ingrediente` (`idIngrediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`subrubro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`subrubro` (
  `idSubrubro` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idSubrubro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`productoxsubrubro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`productoxsubrubro` (
  `idProducto` INT NOT NULL,
  `idSubrubro` INT NOT NULL,
  INDEX `sghh_idx` (`idProducto` ASC),
  INDEX `ghhs_idx` (`idSubrubro` ASC),
  PRIMARY KEY (`idProducto`, `idSubrubro`),
  CONSTRAINT `sghh`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ghhs`
    FOREIGN KEY (`idSubrubro`)
    REFERENCES `gestion_restaurant`.`subrubro` (`idSubrubro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`menu` (
  `idMenu` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `fecha` DATE NULL,
  `diaDeSemana` INT(1) NULL DEFAULT 0,
  PRIMARY KEY (`idMenu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`menuxproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`menuxproducto` (
  `idMenu` INT NOT NULL,
  `idProducto` INT NOT NULL,
  INDEX `menu_idx` (`idMenu` ASC),
  INDEX `producto_idx` (`idProducto` ASC),
  PRIMARY KEY (`idMenu`, `idProducto`),
  CONSTRAINT `producto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `menu`
    FOREIGN KEY (`idMenu`)
    REFERENCES `gestion_restaurant`.`menu` (`idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`mesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`mesa` (
  `idMesa` INT NOT NULL AUTO_INCREMENT,
  `nroMesa` INT NULL,
  `capacidad` INT NULL,
  `salon` INT NULL,
  `uniom` INT NULL,
  `estado` INT NULL,
  PRIMARY KEY (`idMesa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`reporteMesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`reportemesa` (
  `idReporteMesa` INT NOT NULL AUTO_INCREMENT,
  `idMesa` INT NULL,
  `fechaInicio` DATETIME NULL,
  PRIMARY KEY (`idReporteMesa`),
  INDEX `mesa_idx` (`idMesa` ASC),
  CONSTRAINT `mesa`
    FOREIGN KEY (`idMesa`)
    REFERENCES `gestion_restaurant`.`mesa` (`idMesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`empleado` (
  `idEmpleado` INT NOT NULL AUTO_INCREMENT,
  `tipoEmpleado` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  PRIMARY KEY (`idEmpleado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`comanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`comanda` (
  `idComanda` INT NOT NULL AUTO_INCREMENT,
  `idEmpleado` INT NULL,
  `idCliente` INT NULL,
  `estado` INT(1) NULL DEFAULT 1,
  `fechaYHora` DATETIME NULL,
  `idMesa` INT NULL,
  PRIMARY KEY (`idComanda`),
  INDEX `empleado_idx` (`idEmpleado` ASC),
  INDEX `mesa_idx` (`idMesa` ASC),
  CONSTRAINT `xempleado`
    FOREIGN KEY (`idEmpleado`)
    REFERENCES `gestion_restaurant`.`empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `xmesa`
    FOREIGN KEY (`idMesa`)
    REFERENCES `gestion_restaurant`.`mesa` (`idMesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`comandaxproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`comandaxproducto` (
  `idComanda` INT NOT NULL,
  `idProducto` INT NOT NULL,
  PRIMARY KEY (`idComanda`, `idProducto`),
  INDEX `producto_idx` (`idProducto` ASC),
  CONSTRAINT `ccomanda`
    FOREIGN KEY (`idComanda`)
    REFERENCES `gestion_restaurant`.`comanda` (`idComanda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `cproducto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`ticket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`ticket` (
  `idTicket` INT NOT NULL AUTO_INCREMENT,
  `idCliente` INT NULL,
  `idMesa` INT NULL,
  `cortesia` BIT(1) NULL DEFAULT b'0',
  `idEmpleado` INT NULL,
  `estado` INT(1) NULL DEFAULT 1,
  `fechaYHora` DATETIME NULL,
  PRIMARY KEY (`idTicket`),
  INDEX `mesa_idx` (`idMesa` ASC),
  INDEX `empleado_idx` (`idEmpleado` ASC),
  INDEX `cliente_idx` (`idCliente` ASC),
  CONSTRAINT `tmesa`
    FOREIGN KEY (`idMesa`)
    REFERENCES `gestion_restaurant`.`mesa` (`idMesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `templeado`
    FOREIGN KEY (`idEmpleado`)
    REFERENCES `gestion_restaurant`.`empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `tcliente`
    FOREIGN KEY (`idCliente`)
    REFERENCES `gestion_restaurant`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`vianda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`vianda` (
  `idVianda` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idVianda`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`viandaxproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`viandaxproducto` (
  `idVianda` INT NOT NULL,
  `idProducto` INT NOT NULL,
  PRIMARY KEY (`idVianda`, `idProducto`),
  INDEX `producto_idx` (`idProducto` ASC),
  CONSTRAINT `vvianda`
    FOREIGN KEY (`idVianda`)
    REFERENCES `gestion_restaurant`.`vianda` (`idVianda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `vproducto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`listaPrecio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`listaPrecio` (
  `idListaPrecio` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL,
  `idTipoCliente` INT NOT NULL,
  `baja` BIT(1) NULL DEFAULT b'0',
  `fechaVigencia` DATE NULL,
  PRIMARY KEY (`idListaPrecio`),
  INDEX `tipoCliente_idx` (`idTipoCliente` ASC),
  CONSTRAINT `ltipoCliente`
    FOREIGN KEY (`idTipoCliente`)
    REFERENCES `gestion_restaurant`.`tipoCliente` (`idTipoCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`precioProductoLista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`precioproductolista` (
  `idPrecioProductoLista` INT NOT NULL AUTO_INCREMENT,
  `idProducto` INT NULL,
  `precio` DOUBLE NULL,
  `idListaPrecio` INT NULL,
  INDEX `listaPrecio_idx` (`idListaPrecio` ASC),
  PRIMARY KEY (`idPrecioProductoLista`),
  CONSTRAINT `ppproducto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `pplistaPrecio`
    FOREIGN KEY (`idListaPrecio`)
    REFERENCES `gestion_restaurant`.`listaPrecio` (`idListaPrecio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`historialComanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`historialcomanda` (
  `idHistorialComanda` INT NOT NULL AUTO_INCREMENT,
  `idEmpleado` INT NULL,
  `fechaYHora` DATETIME NULL,
  `idMesa` INT NOT NULL,
  `idTicket` INT NOT NULL,
  PRIMARY KEY (`idHistorialComanda`),
  INDEX `empleado_idx` (`idEmpleado` ASC),
  INDEX `mesa_idx` (`idMesa` ASC),
  INDEX `ticket_idx` (`idTicket` ASC),
  CONSTRAINT `hcempleado`
    FOREIGN KEY (`idEmpleado`)
    REFERENCES `gestion_restaurant`.`empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `hcmesa`
    FOREIGN KEY (`idMesa`)
    REFERENCES `gestion_restaurant`.`mesa` (`idMesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `hcticket`
    FOREIGN KEY (`idTicket`)
    REFERENCES `gestion_restaurant`.`ticket` (`idTicket`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`historialComandaxproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`historialcomandaxproducto` (
  `idHistorialComanda` INT NOT NULL,
  `idProducto` INT NOT NULL,
  PRIMARY KEY (`idHistorialComanda`, `idProducto`),
  INDEX `producto_idx` (`idProducto` ASC),
  CONSTRAINT `historialComanda`
    FOREIGN KEY (`idHistorialComanda`)
    REFERENCES `gestion_restaurant`.`historialComanda` (`idHistorialComanda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `hproducto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `gestion_restaurant`.`producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gestion_restaurant`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gestion_restaurant`.`usuario` (
  `idUsuario` INT NOT NULL,
  `nombreUsuario` VARCHAR(45) NULL,
  `clave` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsuario`),
  CONSTRAINT `uemplead`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `gestion_restaurant`.`empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
