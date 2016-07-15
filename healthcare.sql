CREATE TABLE bloodsugar
(
	bloodsugar_id         CHAR(3)  NOT NULL ,
	sex                   CHAR(1)  NOT NULL ,
	age                   NUMBER(3)  NOT NULL ,
	bloodsugar            NUMBER(5)  NOT NULL 
);

ALTER TABLE bloodsugar
	ADD CONSTRAINT  XPKbloodsugar PRIMARY KEY (bloodsugar_id);

CREATE TABLE cholesterol
(
	cholesterol_id        CHAR(3)  NOT NULL ,
	sex                   CHAR(1)  NOT NULL ,
	age                   NUMBER(3)  NOT NULL ,
	ldl_ch                NUMBER(4)  NOT NULL ,
	hdl_ch                NUMBER(4)  NOT NULL ,
	neutral_ch            NUMBER(4)  NOT NULL ,
	total_ch              NUMBER(5)  NOT NULL 
);

ALTER TABLE cholesterol
	ADD CONSTRAINT  XPKcholesterol PRIMARY KEY (cholesterol_id);

CREATE TABLE disease
(
	disease_code          VARCHAR2(5)  NOT NULL ,
	disease_name          VARCHAR2(30)  NOT NULL ,
	disease_info_file     VARCHAR2(30)  NOT NULL ,
	disease_bloodsugar_value  NUMBER(2)  NOT NULL ,
	disease_pressure_value  NUMBER(2)  NOT NULL ,
	disease_cholesterol_value  NUMBER(2)  NOT NULL 
);

ALTER TABLE disease
	ADD CONSTRAINT  XPKdisease PRIMARY KEY (disease_code);

CREATE TABLE healthdata
(
	history_no            NUMBER(3)  NOT NULL ,
	weight                FLOAT(10)  NOT NULL ,
	height                FLOAT(10)  NOT NULL ,
	bmi                   FLOAT(10)  NOT NULL ,
	pressure              NUMBER(5)  NOT NULL ,
	bloodsugar            NUMBER(5)  NOT NULL ,
	ldl_cholesterol       NUMBER(4)  NOT NULL ,
	hdl_cholesterol       NUMBER(4)  NOT NULL ,
	neutral_cholesterol   NUMBER(4)  NOT NULL ,
	id                    VARCHAR2(20)  NOT NULL 
);

ALTER TABLE healthdata
	ADD CONSTRAINT  XPKhealthdata PRIMARY KEY (history_no,id);

CREATE TABLE person
(
	id                    VARCHAR2(20)  NOT NULL ,
	password              VARCHAR2(20)  NOT NULL ,
	name                  VARCHAR2(20)  NOT NULL ,
	sex                   CHAR(1)  NOT NULL ,
	age                   NUMBER(3)  NOT NULL ,
	birthdate             DATE  NOT NULL 
);

ALTER TABLE person
	ADD CONSTRAINT  XPKperson PRIMARY KEY (id);

CREATE TABLE pressure
(
	pressure_id           CHAR(3)  NOT NULL ,
	sex                   CHAR(1)  NOT NULL ,
	age                   NUMBER(3)  NOT NULL ,
	max_pressure_start    NUMBER(4)  NOT NULL ,
	max_pressure_end      NUMBER(4)  NOT NULL ,
	min_pressure_start    NUMBER(4)  NOT NULL ,
	min_pressure_end      NUMBER(4)  NOT NULL 
);

ALTER TABLE pressure
	ADD CONSTRAINT  XPKpressure PRIMARY KEY (pressure_id);

ALTER TABLE healthdata
	ADD (CONSTRAINT  R_2 FOREIGN KEY (id) REFERENCES person(id));

<!-- 연령/성별 정상 혈압 추가 -->
INSERT INTO pressure values ('p01', 'M', 10, 110, 134, 59, 79);
INSERT INTO pressure values ('p02', 'F', 10, 101, 123, 57, 75);
INSERT INTO pressure values ('p03', 'M', 20, 113, 137, 64, 84);
INSERT INTO pressure values ('p04', 'F', 20, 103, 125, 60, 78);
INSERT INTO pressure values ('p05', 'M', 30, 114, 142, 67, 89);
INSERT INTO pressure values ('p06', 'F', 30, 106, 134, 63, 83);
INSERT INTO pressure values ('p07', 'M', 40, 126, 150, 71, 95);
INSERT INTO pressure values ('p08', 'F', 40, 112, 146, 68, 90);
INSERT INTO pressure values ('p09', 'M', 50, 121, 159, 73, 97);
INSERT INTO pressure values ('p10', 'F', 50, 117, 159, 70, 94);
INSERT INTO pressure values ('p11', 'M', 60, 124, 166, 73, 95);
INSERT INTO pressure values ('p12', 'F', 60, 124, 166, 71, 93);
INSERT INTO pressure values ('p13', 'M', 70, 128, 170, 71, 95);
INSERT INTO pressure values ('p14', 'F', 70, 131, 173, 68, 94);



   