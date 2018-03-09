#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User(
        id_user  int (11) Auto_increment  NOT NULL ,
        email    Varchar (50) NOT NULL ,
        password Varchar (25) NOT NULL ,
        name     Varchar (12) NOT NULL ,
        PRIMARY KEY (id_user ) ,
        UNIQUE (email ,name )
)ENGINE=InnoDB;