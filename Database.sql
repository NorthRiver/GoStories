------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------



------------------------------------------------------------
-- Table: users
------------------------------------------------------------
CREATE TABLE public.users(
	id_user    SERIAL NOT NULL ,
	email      VARCHAR (50) NOT NULL UNIQUE,
	password   VARCHAR (25) NOT NULL ,
	username   VARCHAR (12) NOT NULL UNIQUE,
	birthday   DATE   ,
	dateFinBan DATE   ,
	bio        VARCHAR (500)  ,
	CONSTRAINT prk_constraint_users PRIMARY KEY (id_user)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: stories
------------------------------------------------------------
CREATE TABLE public.stories(
	id_story  SERIAL NOT NULL ,
	title     VARCHAR (255) NOT NULL UNIQUE,
	price     FLOAT   ,
	published BOOL   ,
	sumup     VARCHAR (500)  ,
	id_user   INT  NOT NULL ,
	CONSTRAINT prk_constraint_stories PRIMARY KEY (id_story)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: categories
------------------------------------------------------------
CREATE TABLE public.categories(
	id_cat SERIAL NOT NULL ,
	tag    VARCHAR (250) NOT NULL UNIQUE,
	CONSTRAINT prk_constraint_categories PRIMARY KEY (id_cat)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Subscribe
------------------------------------------------------------
CREATE TABLE public.Subscribe(
	id_user       INT  NOT NULL ,
	id_user_users INT  NOT NULL ,
	CONSTRAINT prk_constraint_Subscribe PRIMARY KEY (id_user,id_user_users)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: isTagged
------------------------------------------------------------
CREATE TABLE public.isTagged(
	id_cat   INT  NOT NULL ,
	id_story INT  NOT NULL ,
	CONSTRAINT prk_constraint_isTagged PRIMARY KEY (id_cat,id_story)
)WITHOUT OIDS;



ALTER TABLE public.stories ADD CONSTRAINT FK_stories_id_user FOREIGN KEY (id_user) REFERENCES public.users(id_user);
ALTER TABLE public.Subscribe ADD CONSTRAINT FK_Subscribe_id_user FOREIGN KEY (id_user) REFERENCES public.users(id_user);
ALTER TABLE public.Subscribe ADD CONSTRAINT FK_Subscribe_id_user_users FOREIGN KEY (id_user_users) REFERENCES public.users(id_user);
ALTER TABLE public.isTagged ADD CONSTRAINT FK_isTagged_id_cat FOREIGN KEY (id_cat) REFERENCES public.categories(id_cat);
ALTER TABLE public.isTagged ADD CONSTRAINT FK_isTagged_id_story FOREIGN KEY (id_story) REFERENCES public.stories(id_story);
