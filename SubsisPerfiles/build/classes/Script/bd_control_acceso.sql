CREATE DATABASE bd_control_acceso;

USE bd_control_acceso;

CREATE TABLE perfiles (
    PerCodigo INT AUTO_INCREMENT PRIMARY KEY,
    PerNombre VARCHAR(50) NOT NULL,
    PerEstado VARCHAR(10) NOT NULL
);