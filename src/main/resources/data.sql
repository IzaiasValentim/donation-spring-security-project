-- Registration of two base users.
-- Password: password
INSERT INTO USERS (username,password) VALUES ('total','$2a$10$GiseHkdvwOFr7A9KRWbeiOmg/PYPhWVjdm42puLfOzR/gIAQrsAGy');
INSERT INTO USERS(username, password) VALUES ('partial','$2a$10$GiseHkdvwOFr7A9KRWbeiOmg/PYPhWVjdm42puLfOzR/gIAQrsAGy');

-- Two roles.
INSERT INTO ROLES(name) VALUES ('TOTAL');
INSERT INTO ROLES(name) VALUES ('PARTIAL');

-- user 'total' has all roles.
INSERT INTO tb_users_roles(user_id, role_id) VALUES (1,1);
INSERT INTO tb_users_roles(user_id, role_id) VALUES (1,2);

-- user 'partial' has only 'PARTIAL' role.
INSERT INTO tb_users_roles(user_id, role_id) VALUES (2,2);