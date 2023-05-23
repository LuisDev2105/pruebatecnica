DROP TABLE IF EXISTS USUARIO;

CREATE TABLE IF NOT EXISTS USUARIO(
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(25),
    apellido VARCHAR(25), 
    correo_electronico VARCHAR(50), 
    fecha_nacimiento DATE,
    PRIMARY KEY(id)
);