create table if not exists cities
(
    id        integer generated always as identity
        primary key,
    country   varchar not null,
    code      varchar not null,
    name      varchar not null,
    latitude  float   not null,
    longitude float   not null
);
