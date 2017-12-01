CREATE DATABASE  TEST_DB;

use TEST_DB;


CREATE TABLE test_user
(
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(70) NOT NULL,
  role VARCHAR(20) NOT NULL DEFAULT 'N',
  PRIMARY KEY(id),
  UNIQUE KEY(username)
);

INSERT INTO test_user (username, password, role) VALUES('admin', 'admin', 'ROLE_ADMIN');
INSERT INTO test_user (username, password, role) VALUES('test', 'test', 'ROLE_USER');