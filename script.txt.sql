create table issueslists
(
    ID   bigint unsigned auto_increment
        primary key,
    NAME varchar(100) null,
    constraint ID
        unique (ID)
);

create table users
(
    ID        bigint unsigned auto_increment
        primary key,
    FIRSTNAME varchar(100) null,
    LASTNAME  varchar(100) null,
    constraint ID
        unique (ID)
);

create table issues
(
    ID                 bigint unsigned auto_increment
        primary key,
    ISSUESLIST_ID      bigint unsigned not null,
    SUMMARY            varchar(1024)   null,
    DESCRIPTION        varchar(1024)   null,
    USER_ID_ASSIGNEDTO bigint unsigned not null,
    constraint ID
        unique (ID),
    constraint issues_ibfk_1
        foreign key (ISSUESLIST_ID) references issueslists (ID),
    constraint issues_ibfk_2
        foreign key (USER_ID_ASSIGNEDTO) references users (ID)
);

create index ISSUESLIST_ID
    on issues (ISSUESLIST_ID);

create index USER_ID_ASSIGNEDTO
    on issues (USER_ID_ASSIGNEDTO);

create table posts
(
    ID      bigint unsigned auto_increment
        primary key,
    USER_ID bigint unsigned not null,
    BODY    varchar(1024)   null,
    constraint ID
        unique (ID),
    constraint posts_ibfk_1
        foreign key (USER_ID) references users (ID)
);

create index USER_ID
    on posts (USER_ID);


