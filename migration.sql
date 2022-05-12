USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(240) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);

ALTER TABLE ads ADD price_in_cents INT


INSERT INTO users (username, email, password) VALUES ('steve', 'steve@email.com', 'password')

INSERT INTO ads (user_id, title, description) VALUES (21, 'steve is for sale', 'short but long')

UPDATE ads SET price_in_cents = 1000 WHERE user_id = 21;

UPDATE ads SET price_in_cents = 2000;

