-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-04-2016 a las 17:42:58
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `numCita` int(11) NOT NULL,
  `cod_paciente` int(5) DEFAULT NULL,
  `cod_doctor` int(5) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora_cita` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`numCita`, `cod_paciente`, `cod_doctor`, `fecha`, `hora_cita`) VALUES
(28, 1, 3, '2016-04-26', '1:00 PM'),
(29, 6, 3, '2016-04-29', '3:00 PM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE `doctores` (
  `cod_doctor` int(5) NOT NULL,
  `nom_doctor` varchar(50) DEFAULT NULL,
  `ape_doctor` varchar(50) DEFAULT NULL,
  `especialidad` varchar(50) DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `tel` int(12) DEFAULT NULL,
  `contraseña` varchar(50) NOT NULL,
  `dependencia` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`cod_doctor`, `nom_doctor`, `ape_doctor`, `especialidad`, `domicilio`, `tel`, `contraseña`, `dependencia`) VALUES
(1, 'Juanito', 'Perez', 'Cirujano', 'Vallarta', 333543223, '', ''),
(3, 'nestor', 'milian', 'sdf', 'asdf', 2345, '', ''),
(4, 'Grecia', 'España', 'cirujana', 'fasf', 2345, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamentos`
--

CREATE TABLE `medicamentos` (
  `cod_medi` int(5) NOT NULL,
  `nom_medi` varchar(50) DEFAULT NULL,
  `formula` varchar(50) DEFAULT NULL,
  `disponibles` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicamentos`
--

INSERT INTO `medicamentos` (`cod_medi`, `nom_medi`, `formula`, `disponibles`) VALUES
(1, 'Aspirina', 'paracetamol', 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `cod_paciente` int(5) NOT NULL,
  `nom_paciente` varchar(50) DEFAULT NULL,
  `ape_paciente` varchar(50) DEFAULT NULL,
  `enfermedad` varchar(50) DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `tel` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`cod_paciente`, `nom_paciente`, `ape_paciente`, `enfermedad`, `domicilio`, `tel`) VALUES
(1, 'Gilberto', 'Dolores', 'Epatitis B+', 'Tonala', 15267847),
(2, 'adsf', 'fasd', 'asdf', 'adsdf', 222),
(3, 'qwer', 'wer', 'req', 'ewqr', 11),
(4, 'Grecia', 'Milian', 'Gripa', 'Loma apulco 289', 123442),
(5, 'pp', 'pp', 'pp', 'pp', 1234567),
(6, 'Pedro', 'Paramo', 'Tos', 'Vallarta', 1234);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `cod_personal` int(5) NOT NULL,
  `nom_personal` varchar(50) DEFAULT NULL,
  `ape_personal` varchar(50) DEFAULT NULL,
  `puesto` varchar(50) DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `tel` int(12) DEFAULT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`cod_personal`, `nom_personal`, `ape_personal`, `puesto`, `domicilio`, `tel`, `contraseña`) VALUES
(1, 'Joel', 'Vazqueza', 'Enfermero', 'Vallarta', 333434543, '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`numCita`);

--
-- Indices de la tabla `doctores`
--
ALTER TABLE `doctores`
  ADD PRIMARY KEY (`cod_doctor`);

--
-- Indices de la tabla `medicamentos`
--
ALTER TABLE `medicamentos`
  ADD PRIMARY KEY (`cod_medi`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`cod_paciente`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`cod_personal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `numCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `doctores`
--
ALTER TABLE `doctores`
  MODIFY `cod_doctor` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `medicamentos`
--
ALTER TABLE `medicamentos`
  MODIFY `cod_medi` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `cod_paciente` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `cod_personal` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
