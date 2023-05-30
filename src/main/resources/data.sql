insert into users(username, password, enabled) values ("admin","123",true);
insert into users(username, password, enabled) values ("client","123",true);

insert into authorities(username,authority) values ("admin","ROLE_ADMIN");
insert into authorities(username,authority) values ("client","ROLE_USER");

