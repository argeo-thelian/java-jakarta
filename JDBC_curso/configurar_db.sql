--Create database
CREATE SCHEMA `java_curso` ;

--Crear tabla productos

CREATE TABLE `java_curso`.`productos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `precio` INT NULL,
  `fecha_registro` DATETIME NULL,
  PRIMARY KEY (`id`));

-- Insertar campos
INSERT INTO `java_curso`.`productos` (`nombre`, `precio`, `fecha_registro`) VALUES ('Bicicleta', '200', '2020-12-10');
INSERT INTO `java_curso`.`productos` (`nombre`, `precio`, `fecha_registro`) VALUES ('Samsung', '300', '2021-05-29');


--Crear tabla categorias
CREATE TABLE `java_curso`.`categorias` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

--Editando tabla Productos para agregar Id categoria
ALTER TABLE `java_curso`.`productos` 
ADD COLUMN `categoria_id` INT NULL AFTER `fecha_registro`;

--Add Foreing Key a Productos de Categorias
ALTER TABLE `java_curso`.`productos` 
ADD INDEX `productos_categorias_idx` (`categoria_id` ASC) VISIBLE;
;
ALTER TABLE `java_curso`.`productos` 
ADD CONSTRAINT `productos_categorias`
  FOREIGN KEY (`categoria_id`)
  REFERENCES `java_curso`.`categorias` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

-- Insertando datos en Categoria tabla
INSERT INTO `java_curso`.`categorias` (`nombre`) VALUES ('Deportes');
INSERT INTO `java_curso`.`categorias` (`nombre`) VALUES ('Tecnología');
INSERT INTO `java_curso`.`categorias` (`nombre`) VALUES ('Computación');

-- Relacionando ID de categorias con la tabla Productos en categoria_id
UPDATE `java_curso`.`productos` SET `categoria_id` = '1' WHERE (`id` = '1');
UPDATE `java_curso`.`productos` SET `categoria_id` = '2' WHERE (`id` = '2');
UPDATE `java_curso`.`productos` SET `categoria_id` = '3' WHERE (`id` = '3');

