-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 05-08-2020 a las 15:06:56
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbcurso2020`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrativo`
--

CREATE TABLE `administrativo` (
  `dniadmin` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nombres` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `fechanac` date DEFAULT NULL,
  `correo` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefono` varchar(9) COLLATE utf8_unicode_ci DEFAULT NULL,
  `oficina` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `clave` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nivel` int(1) DEFAULT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `administrativo`
--

INSERT INTO `administrativo` (`dniadmin`, `apellidos`, `nombres`, `fechanac`, `correo`, `telefono`, `oficina`, `clave`, `nivel`, `estado`) VALUES
('23145687', 'ZAPATA RICRA', 'Giovana', '2019-12-09', 'giovanaz@hotmail.com', '985415689', '123 Piso 2', 'abcd1234', 2, 0),
('78945612', 'SOLORZANO JAUREGUI', 'Alberto', '2020-01-13', 'alberto2020@gmail.com', '987515236', '123 Piso 2', 'abcd1234', 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `idcurso` char(4) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `especialidad` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nrohoras` int(3) DEFAULT NULL,
  `creditos` int(1) DEFAULT NULL,
  `dnidocente` char(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idcurso`, `nombre`, `especialidad`, `nrohoras`, `creditos`, `dnidocente`, `estado`) VALUES
('a001', 'Lenguaje de programación', 'Electrónica e Informática', 36, 3, '52145256', 1),
('a002', 'Diseño gráfico', 'Informática', 48, 3, '98748574', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `dnidocente` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nombres` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `fechanac` date DEFAULT NULL,
  `correo` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefono` varchar(9) COLLATE utf8_unicode_ci DEFAULT NULL,
  `especialidad` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`dnidocente`, `apellidos`, `nombres`, `fechanac`, `correo`, `telefono`, `especialidad`, `estado`) VALUES
('52145256', 'RIVERA SALAS', 'Ricardo', '2020-06-08', 'ricardorivera@yahoo.com', '987545236', 'Ing. Sistemas', 1),
('98748574', 'CARMONA RODRIGUEZ', 'Mariela', '2020-07-06', 'marielac@hotmail.com', '957485489', 'Electrónica e Informática', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `dniestudiante` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `apellidos` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nombres` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `fechanac` date DEFAULT NULL,
  `correo` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefono` varchar(9) COLLATE utf8_unicode_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`dniestudiante`, `apellidos`, `nombres`, `fechanac`, `correo`, `telefono`, `direccion`, `estado`) VALUES
('45878877', 'PERALTA TUPIA', 'Armando', '2020-07-05', 'armando123@gmail.com', '989889898', 'Av. El sol 123', 1),
('78457859', 'SOLANO RIVERA', 'Fabiola', '2020-07-01', 'fabisolano@outlook.es', '985414512', 'Urb. los sauces Mz. V. Lt.06', 0),
('78458589', 'Carmona', 'Liz', '1980-10-05', 'liz@une.edu.pe', '956256589', 'Lima', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `idmatricula` int(11) NOT NULL,
  `dniestudiante` char(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idprogramar` int(11) DEFAULT NULL,
  `dniadmin` char(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fechamatric` date DEFAULT NULL,
  `matriculados` int(2) DEFAULT NULL,
  `vacantes` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `matricula`
--

INSERT INTO `matricula` (`idmatricula`, `dniestudiante`, `idprogramar`, `dniadmin`, `fechamatric`, `matriculados`, `vacantes`) VALUES
(1, '45878877', 1, '78945612', '2020-07-23', 2, 10),
(2, '78457859', 2, '23145687', '2020-07-23', 1, 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programarcurso`
--

CREATE TABLE `programarcurso` (
  `idprogramar` int(11) NOT NULL,
  `aula` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `horario` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idcurso` char(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fechainicio` date DEFAULT NULL,
  `fechafin` date DEFAULT NULL,
  `estado` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `programarcurso`
--

INSERT INTO `programarcurso` (`idprogramar`, `aula`, `horario`, `idcurso`, `fechainicio`, `fechafin`, `estado`) VALUES
(1, '102', 'Lun-Mier-vier 8:00 10:00 am', 'a001', '2020-07-24', '2020-08-26', 1),
(2, '103', 'Martes - Jueves 8:00 10:00 am', 'a002', '2020-07-26', '2020-10-21', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrativo`
--
ALTER TABLE `administrativo`
  ADD PRIMARY KEY (`dniadmin`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`idcurso`),
  ADD KEY `fkdocente` (`dnidocente`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`dnidocente`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`dniestudiante`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`idmatricula`),
  ADD KEY `pkmatriculaestudiante` (`dniestudiante`),
  ADD KEY `pkmatriculaprogramar` (`idprogramar`),
  ADD KEY `pkmatriculaadmin` (`dniadmin`);

--
-- Indices de la tabla `programarcurso`
--
ALTER TABLE `programarcurso`
  ADD PRIMARY KEY (`idprogramar`),
  ADD KEY `pkprogramarcurso` (`idcurso`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `matricula`
--
ALTER TABLE `matricula`
  MODIFY `idmatricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `programarcurso`
--
ALTER TABLE `programarcurso`
  MODIFY `idprogramar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `fkdocente` FOREIGN KEY (`dnidocente`) REFERENCES `docente` (`dnidocente`);

--
-- Filtros para la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD CONSTRAINT `pkmatriculaadmin` FOREIGN KEY (`dniadmin`) REFERENCES `administrativo` (`dniadmin`),
  ADD CONSTRAINT `pkmatriculaestudiante` FOREIGN KEY (`dniestudiante`) REFERENCES `estudiante` (`dniestudiante`),
  ADD CONSTRAINT `pkmatriculaprogramar` FOREIGN KEY (`idprogramar`) REFERENCES `programarcurso` (`idprogramar`);

--
-- Filtros para la tabla `programarcurso`
--
ALTER TABLE `programarcurso`
  ADD CONSTRAINT `pkprogramarcurso` FOREIGN KEY (`idcurso`) REFERENCES `curso` (`idcurso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
