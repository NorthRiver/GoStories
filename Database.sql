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
	name       VARCHAR (12) NOT NULL UNIQUE,
	birthday   DATE   ,
	dateFinBan DATE   ,
	bio        VARCHAR (500)  ,
	CONSTRAINT prk_constraint_users PRIMARY KEY (id_user)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Subscribe
------------------------------------------------------------
CREATE TABLE public.Subscribe(
	id_user       INT  NOT NULL ,
	id_user_users INT  NOT NULL ,
	CONSTRAINT prk_constraint_Subscribe PRIMARY KEY (id_user,id_user_users)
)WITHOUT OIDS;



ALTER TABLE public.Subscribe ADD CONSTRAINT FK_Subscribe_id_user FOREIGN KEY (id_user) REFERENCES public.users(id_user);
ALTER TABLE public.Subscribe ADD CONSTRAINT FK_Subscribe_id_user_users FOREIGN KEY (id_user_users) REFERENCES public.users(id_user);
