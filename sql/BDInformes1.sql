drop database  if exists `BDInformes1`;

CREATE SCHEMA `BDInformes1`;

CREATE TABLE `BDInformes1`.`PERSONAS` (
  `dni` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(30) NOT NULL ,
  `ap1` VARCHAR(30) NOT NULL ,  
  `ap2` VARCHAR(30) NOT NULL ,
  `edad` INT NOT NULL ,
PRIMARY KEY (`dni`));


use BDInformes1;

insert into personas values('00000000A','Manuel','Lopez','Casilo',12);
insert into personas values('00000001A','Silvia','Rodriguez','Filgueira',44);
insert into personas values('00000002A','Rodrigo','Perez','Ribadavia',40);
insert into personas values('00000003A','Jaime','Jimenez','Ponteforte',45);
insert into personas values('00000004A','Ramiro','Vallecano','Seguranza',25);
insert into personas values('00000005A','David','Luances','Silveiral',52);
insert into personas values('00000006A','Manuela','Suances','Rodriguez',37);
insert into personas values('00000007A','Fernanda','Barrio','Diez',14);
insert into personas values('00000008A','Eduardo','Vilar','Diaz',14);
insert into personas values('00000009A','Eulogio','Souto','Ferreiro',44);
insert into personas values('11111110A','Pedro','Perez','Lopez',40);
insert into personas values('11111111A','Ana','Ferreiro','Bruzon',34);
insert into personas values('11111112A','Marta','Lamas','Cal',54);
insert into personas values('11111113A','Alicia','Leira','Lamas',12);
insert into personas values('11111114A','Maria','Seijo','Fuentes',34);
insert into personas values('11111115A','Antonio','Pico','Brandariz',64);
insert into personas values('11111116A','Francisco','Vazquez','Carpente',2);
insert into personas values('11111117A','Xoan','Perez','Romero',12);
insert into personas values('11111118A','Iria','Paz','Paz',21);
insert into personas values('11111119A','Miguel','Vilar','Lopez',1);
insert into personas values('22222220A','Laura','Armesto','Martinez',12);
insert into personas values('22222221A','Camila','Cobian','Lopez',54);
insert into personas values('22222222A','Natalia','Codesido','Fuentes',23);
insert into personas values('22222223A','Raquel','Rubira','Romero',12);
insert into personas values('22222224A','Shuni','Martinez','Castro',67);
insert into personas values('22222225A','Lara','Rodriguez','Diez',23);
insert into personas values('22222226A','Marta','Balsa','Chousa',67);
insert into personas values('22222227A','Blanca','Campos','Galvez',23);
insert into personas values('22222228A','Lucia','Diez','Pico',67);
insert into personas values('22222229A','Andrea','Iglesias','Lamas',73);
insert into personas values('33333330A','Mafalda','Diez','Perez',48);
insert into personas values('33333331A','Manuel','Perez','Lamas',83);
insert into personas values('33333332A','Luna','Chousa','Lopez',83);
insert into personas values('33333333A','Yolanda','Galvez','Rodriguez',25);
insert into personas values('33333334A','German','Perez','Leira',56);
insert into personas values('33333335A','Pedro','Diez','Castelo',45);
insert into personas values('33333336A','Concha','Balsa','Lugar',24);
insert into personas values('33333337A','Andres','Rubira','Sueiro',39);
insert into personas values('33333338A','Alvaro','Lopez','Vilar',34);
insert into personas values('33333339A','Marta','Perez','Couto',12);
insert into personas values('44444440A','Angela','Anca','Lorenzo',14);
insert into personas values('44444441A','Laura','Brage','Fernandez',54);
insert into personas values('44444442A','Santiago','Casal','Casal',25);
insert into personas values('44444443A','Angela','Perez','Lopez',65);
insert into personas values('44444444A','Jesus','Fernandez','Perez',47);
insert into personas values('44444445A','Beatriz','Couce','Bollain',55);
insert into personas values('44444446A','Alejandro','Lorenzo','Carrizo',41);
insert into personas values('44444447A','Aurea','Cal','Lage',32);
insert into personas values('44444448A','Lula','Garcia','Freire',12);
insert into personas values('44444449A','Sara','Hermida','Arias',54);
insert into personas values('55555550A','Pedro','Galvez','Lopez',45);
insert into personas values('55555551A','Juanjo','Perez','Lopetegui',28);
insert into personas values('55555552A','Marcos','Lopez','Saura',43);
insert into personas values('55555553A','Patricia','Regueiro','Dubilera',56);
insert into personas values('55555554A','Alberto','Rego','Calame',36);
insert into personas values('55555555A','Eloy','Pomez','Perez',41);
insert into personas values('55555556A','Belen','Tolva','Rodriguez',58);
insert into personas values('55555557A','Alfonso','Ribeira','Diaz',25);
insert into personas values('55555558A','Carolina','Jimenez','Diez',65);
insert into personas values('55555559A','Elena','Perez','Gomez',32);
insert into personas values('66666660A','Luis','Rodriguez','Rubio',42);
insert into personas values('66666661A','Pedro','Silvez','Marelo',52);
insert into personas values('66666662A','Monica','Docampo','Painez',36);
insert into personas values('66666663A','Miguel','Vilar','Lopez',2);
insert into personas values('66666664A','Antonio','Silva','Silveiral',21);
insert into personas values('66666665A','Sonia','Perez','Perez',12);
insert into personas values('66666666A','Silvia','Silveira','Gomez',72);
insert into personas values('66666667A','Marta','Lechuga','Gonzalez',65);
insert into personas values('66666668A','Maria','Moreno','Iglesias',45);
insert into personas values('66666669A','Jimena','Blanco','Castro',11);
insert into personas values('77777770A','Celestino','Couce','Mordao',12);
insert into personas values('77777771A','Abel','Perez','Garcia',18);
insert into personas values('77777772A','Victor','Lorenzo','Perez',15);
insert into personas values('77777773A','Adrian','Couce','Arias',45);
insert into personas values('77777774A','Alberto','Hermida','Sanchez',44);
insert into personas values('77777775A','Luisa','Maiz','Iglesias',55);
insert into personas values('77777776A','Fernanda','Diaz','Santiaguez',66);
insert into personas values('77777777A','Carolina','Mendez','Bouza',25);
insert into personas values('77777778A','Maria','Maceiras','Santos',11);
insert into personas values('77777779A','Margarita','Morado','Dopico',10);
insert into personas values('88888880A','Mariano','Bouza','Milia',45);
insert into personas values('88888881A','Pablo','Suevos','Armental',24);
insert into personas values('88888882A','Julio','Perez','Montes',25);
insert into personas values('88888883A','Norma','Iglesias','Rio',29);
insert into personas values('88888884A','Maria','Rivera','Ribeira',87);
insert into personas values('88888885A','Soledad','Lopez','Solveira',14);
insert into personas values('88888886A','Ana','Ordaguez','Faraldo',5);
insert into personas values('88888887A','Alejandro','Silvestre','Estrada',44);
insert into personas values('88888888A','Marcos','Licueira','Estrebada',58);
insert into personas values('88888889A','Jimena','Figueirido','Sualeiro',77);
insert into personas values('99999990A','Monica','Silva','Perez',11);
insert into personas values('99999991A','Bruno','Martinez','Chousa',45);
insert into personas values('99999992A','Alvaro','Lopez','Cruceiro',77);
insert into personas values('99999993A','Gonzalo','Perez','Tempestad',45);
insert into personas values('99999994A','Francisco','Silvez','Marea',25);
insert into personas values('99999995A','Maika','Rebana','Carreira',54);
insert into personas values('99999996A','Salome','Batea','Jimenez',5);
insert into personas values('99999997A','Carolina','Polina','Silvez',45);
insert into personas values('99999998A','Laura','Sanxenxo','Parraqueiro',44);
insert into personas values('99999999A','Pedro','Vilar','Lourenza',45);
