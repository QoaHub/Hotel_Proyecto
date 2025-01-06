-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-11-2018 a las 16:18:38
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquiler`
--

CREATE TABLE `alquiler` (
  `codalquiler` CHAR(4) NOT NULL,
  `codreserva` CHAR(4) NOT NULL,
  `subtotal` DECIMAL(10,2) NOT NULL,   
  `igv` DECIMAL(10,2) NOT NULL,       
  `total` DECIMAL(10,2) NOT NULL,      
  `adicional` DECIMAL(10,2) NOT NULL,  
  `estado` VARCHAR(1) NOT NULL,        
  `fechreg` DATETIME NOT NULL        
        
) ENGINE=InnoDB;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cama`
--

CREATE TABLE `cama` (
  `codcama` char(4) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `codcargo` char(4) NOT NULL,
  `descripcion` varchar(25) NOT NULL,
  `sueldo` double NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechareg` datetime NOT NULL
) ENGINE=InnoDB;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codcliente` char(4) NOT NULL,
  `codtipocliente` char(4) NOT NULL,
  `dni` char(8) NOT NULL,
  `ruc` char(11) NOT NULL,
  `razonsocial` varchar(40) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `telefono` char(9) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento`
--

CREATE TABLE `documento` (
  `coddocumento` char(4) NOT NULL,
  `codtipodocumento` char(4) NOT NULL,
  `codpago` char(4) NOT NULL,
  `fechemision` datetime NOT NULL,
  `serie` char(4) NOT NULL,
  `numdocumento` varchar(15) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `codempleado` char(4) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `genero` int(11) NOT NULL,
  `codhorario` char(4) NOT NULL,
  `codcargo` char(4) NOT NULL,
  `clave` char(5) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `codhabitacion` char(4) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `codtipoh` char(4) NOT NULL,
  `nropiso` int(11) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `codhorario` char(4) NOT NULL,
  `hentrada` time NOT NULL,
  `hsalida` time NOT NULL,
  `franco` varchar(15) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `codpago` char(4) NOT NULL,
  `codtipopago` char(4) NOT NULL,
  `codalquiler` char(4) NOT NULL,
  `fechpago` datetime NOT NULL,
  `subtotal` double NOT NULL,
  `igv` double NOT NULL,
  `total` double NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL,
  `nrooperacion` varchar(15) NOT NULL
) ENGINE=InnoDB;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `codreserva` char(4) NOT NULL,
  `codcliente` char(4) NOT NULL,
  `codhab` char(4) NOT NULL,
  `fechreserva` datetime NOT NULL,
  `estado` bit(1) NOT NULL,
  `fechingreso` datetime NOT NULL,
  `fechsalida` datetime NOT NULL,
  `fechreg` datetime NOT NULL,
  `codempleado` char(4) NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codservicio` char(4) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `costo` double NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicioalquiler`
--

CREATE TABLE `servicioalquiler` (
  `codservalq` char(4) NOT NULL,
  `codalquiler` char(4) DEFAULT NULL,
  `codservicio` char(4) DEFAULT NULL,
  `estado` VARCHAR(1) DEFAULT NULL,
  `fechreg` datetime DEFAULT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifa`
--

CREATE TABLE `tarifa` (
  `codtarifa` char(4) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `precio` double NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipocliente`
--

CREATE TABLE `tipocliente` (
  `codcliente` char(4) NOT NULL,
  `descripcion` varchar(25) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumento`
--

CREATE TABLE `tipodocumento` (
  `codtipodocumento` char(4) NOT NULL,
  `descripcion` varchar(25) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechareg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `codtipoh` char(4) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `codcama` char(4) NOT NULL,
  `codtarifa` char(4) NOT NULL,
  `numcama` int(11) NOT NULL,
  `tvcable` bit(1) NOT NULL,
  `wifi` bit(1) NOT NULL,
  `aireacondicionado` bit(1) NOT NULL,
  `terma` bit(1) NOT NULL,
  `jacuzzi` bit(1) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopago`
--

CREATE TABLE `tipopago` (
  `codtipopago` char(4) NOT NULL,
  `descripcion` varchar(25) NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechreg` datetime NOT NULL
) ENGINE=InnoDB;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `codusu` int(11) NOT NULL,
  `tipo` int(1) NOT NULL,
  `nombres` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellidos` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuario` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `clave` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codusu`, `tipo`, `nombres`, `apellidos`, `usuario`, `clave`, `estado`) VALUES
(1, 0, 'Luis Gonzaga', 'Neira Ayala', 'upiz', '123456', 0),
(2, 0, 'Leslie', 'Jimenez', 'leslie', '123456', 0),
(3, 0, 'Luis', 'Pacherres', 'luis', '123456', 0),
(4, 0, 'Jonatan', 'Vilela', 'jonatan', '123456', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alquiler`
--
ALTER TABLE `alquiler`
  ADD PRIMARY KEY (`codalquiler`);

--
-- Indices de la tabla `cama`
--
ALTER TABLE `cama`
  ADD PRIMARY KEY (`codcama`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`codcargo`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codcliente`);

--
-- Indices de la tabla `documento`
--
ALTER TABLE `documento`
  ADD PRIMARY KEY (`coddocumento`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codempleado`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`codhabitacion`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`codhorario`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`codpago`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`codreserva`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`codservicio`);

--
-- Indices de la tabla `servicioalquiler`
--
ALTER TABLE `servicioalquiler`
  ADD PRIMARY KEY (`codservalq`);

--
-- Indices de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`codtarifa`);

--
-- Indices de la tabla `tipocliente`
--
ALTER TABLE `tipocliente`
  ADD PRIMARY KEY (`codcliente`);

--
-- Indices de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  ADD PRIMARY KEY (`codtipodocumento`);

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`codtipoh`);

--
-- Indices de la tabla `tipopago`
--
ALTER TABLE `tipopago`
  ADD PRIMARY KEY (`codtipopago`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codusu`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codusu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
