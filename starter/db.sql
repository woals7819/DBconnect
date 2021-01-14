DROP DATABASE IF EXISTS starter;

CREATE DATABASE starter;

USE starter;

CREATE TABLE `member` (
	id INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(id),
	regDate DATETIME NOT NULL,
	loginId CHAR(100) NOT NULL,
	loginPw CHAR(100) NOT NULL
);

INSERT INTO `member`
SET regDate = NOW(),
loginId = 'user1',
loginPw = 'user1';

INSERT INTO `member`
SET regDate = NOW(),
loginId = 'user2',
loginPw = 'user2';

CREATE TABLE `article` (
	id INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(id),
	regDate DATETIME NOT NULL,
	title CHAR(100) NOT NULL,
	`body` TEXT NOT NULL,
	hit INT(10) UNSIGNED DEFAULT 0 NOT NULL
);
