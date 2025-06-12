CREATE TABLE websites
( website_id INT(11) NOT NULL AUTO_INCREMENT,
  website_name VARCHAR(25) NOT NULL,
  server_name VARCHAR(20),
  creation_date DATE,
  CONSTRAINT websites_pk PRIMARY KEY (website_id)
);