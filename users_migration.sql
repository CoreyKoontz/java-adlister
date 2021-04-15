USE ad_listener_db;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users
(
    id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    email    VARCHAR(100),
    password VARCHAR(100),
    PRIMARY KEY (id)
);