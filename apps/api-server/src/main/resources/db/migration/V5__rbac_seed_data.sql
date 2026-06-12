INSERT INTO roles(id, name)
VALUES
(gen_random_uuid(), 'ROLE_ADMIN'),
(gen_random_uuid(), 'ROLE_USER');

-- INSERT INTO role_permissions(role_id, permission_id)
-- SELECT id, 'user:create'
-- FROM roles
-- WHERE name = 'ROLE_ADMIN';

-- INSERT INTO role_permissions(role_id, permission_id)
-- SELECT id, 'user:update'
-- FROM roles
-- WHERE name = 'ROLE_ADMIN';

-- INSERT INTO role_permissions(role_id, permission_id)
-- SELECT id, 'user:delete'
-- FROM roles
-- WHERE name = 'ROLE_ADMIN';
