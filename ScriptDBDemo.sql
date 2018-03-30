DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS stories CASCADE;
DROP TABLE IF EXISTS categories CASCADE;
DROP TABLE IF EXISTS isTagged CASCADE;

CREATE TABLE IF NOT EXISTS users (
	username varchar(255) UNIQUE,
	password varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	birthdate date,
	isAdmin bool DEFAULT FALSE,
	bannedUpTo date DEFAULT NULL
);

INSERT INTO users (username, password, email, isAdmin) VALUES 
	('demoAdmin', 'admin', 'admin@gostori.es', true),
	('demoUser', 'user', 'user@gostori.es', false),
	('demoAuthor', 'author', 'author@gostori.es', false);

CREATE TABLE IF NOT EXISTS stories (
	title varchar(255) UNIQUE,
	price double precision DEFAULT 0.0,
	published bool DEFAULT FALSE,
	sumup text DEFAULT NULL,
	author varchar(255) REFERENCES users(username) ON DELETE CASCADE
);

INSERT INTO stories (title, price, sumup, author, published) VALUES
	('demoStory', '9.9', 'A short time ago in a story far far too late...', 'demoAuthor', true),
	('otherStory', '4.9', 'And so the first story isnt let alone', 'demoAuthor', true);
	
CREATE TABLE IF NOT EXISTS categories (
	tag varchar(255) UNIQUE
);

INSERT INTO categories (tag) VALUES ('Adventure'), ('Sci-fi'), ('Space-opera');

CREATE TABLE IF NOT EXISTS isTagged (
	story varchar(255) REFERENCES stories(title) ON DELETE CASCADE,
	tag varchar(255) REFERENCES categories(tag) ON DELETE CASCADE
);

INSERT INTO isTagged (story, tag) VALUES
	('demoStory', 'Space-opera'),
	('demoStory', 'Adventure'),
	('otherStory', 'Sci-fi');