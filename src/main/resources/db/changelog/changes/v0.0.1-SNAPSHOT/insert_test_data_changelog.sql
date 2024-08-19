-- liquibase formatted sql

-- changeset alex_f17:1
INSERT INTO companies (company_id, name)
VALUES (CAST('2d11ab81-ff27-4874-8771-85c7c29e76b8'as binary(16)), 'first');


INSERT INTO employees (employ_id, name, company_id)
VALUES (UUID(), 'first', CAST('2d11ab81-ff27-4874-8771-85c7c29e76b8'as binary(16))),
       (UUID(), 'second', CAST('2d11ab81-ff27-4874-8771-85c7c29e76b8'as binary(16)));

