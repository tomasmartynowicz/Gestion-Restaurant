INSERT INTO `gestion_restaurant`.`mesa` (`idMesa`, `nroMesa`, `capacidad`, `salon`, `uniom`, `estado`) 
	VALUES ('1', '1', '2', '1', '0', '0');
    
INSERT INTO `gestion_restaurant`.`usuario` (`idUsuario`, `nombreUsuario`, `clave`)
	VALUES ('1', 'pablop', '1234');
    
INSERT INTO `gestion_restaurant`.`tipocliente` (`idTipoCliente`, `nombre`)
	VALUES ('1', 'Corporativo');
    
INSERT INTO `gestion_restaurant`.`cuentacorriente` (`idCuentaCorriente`, `descripcion`, `fechaAlta`, `total`)
	VALUES ('2', 'ypf', '2017-7-4', '12344');
    
INSERT INTO `gestion_restaurant`.`cliente` (`idCliente`,  `dni`, `habitacion`)
	VALUES ('1', '35996017', '5');
    
INSERT INTO `gestion_restaurant`.`empleado` (`idEmpleado`, `tipoEmpleado`, `nombre`, `apellido`)
	VALUES ('1', 'Jefe de Salon', 'pablo', 'perez');
    
INSERT INTO `gestion_restaurant`.`producto` (`idProducto`, `nombre`, `descripcion`)
	VAlUES ('1', 'Pollo al verdeo con papas fritas', 'af');