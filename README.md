# spring-sms
Built student management system with Spring &amp; Thymeleaf

grant usage to mariadb 
```bash
create user 'trogoldyte'@localhost identified by 'trogoldyte';
grant usage on *.* to 'trogoldyte'@localhost identified by 'trogoldyte';
create database sms_spring;
grant all on `sms_spring`.* to 'trogoldyte'@localhost;
show grants for `trogoldyte`@localhost;
```

references :
- https://stackoverflow.com/questions/58275418/live-reload-for-thymeleaf-template/63523216#63523216
