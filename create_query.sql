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

#패스워드: 1234
INSERT INTO test_user (username, password, role) VALUES('admin', '$2a$10$nRKNz3Rf/dNRayko6SsRPu50dLb.XzOCVH3kWNP/J8oWZqR2zuFJS', 'ROLE_ADMIN');

#패스워드: 1234
INSERT INTO test_user (username, password, role) VALUES('test', '$2a$10$nRKNz3Rf/dNRayko6SsRPu50dLb.XzOCVH3kWNP/J8oWZqR2zuFJS', 'ROLE_USER');