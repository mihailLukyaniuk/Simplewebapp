create table employees
(
    id             integer not null,
    "firstName"    text    not null,
    "lastName"     text    not null,
    "departmentId" integer not null,
    job_title      text    not null,
    gender         text    not null,
    "dateOfBirth"  integer not null
);

alter table employees
    owner to postgres;

INSERT INTO public.employees (id, "firstName", "lastName", "departmentId", job_title, gender, "dateOfBirth") VALUES (1, 'Ivan', 'Ivanov', 1221, 'lead', 'male', 1994);
INSERT INTO public.employees (id, "firstName", "lastName", "departmentId", job_title, gender, "dateOfBirth") VALUES (2, 'Irina', 'Chernova', 1221, 'middle developer', 'female', 1993);
INSERT INTO public.employees (id, "firstName", "lastName", "departmentId", job_title, gender, "dateOfBirth") VALUES (3, 'Ekaterina', 'Petrova', 1220, 'senior developer', 'female', 1988);
INSERT INTO public.employees (id, "firstName", "lastName", "departmentId", job_title, gender, "dateOfBirth") VALUES (4, 'Mikhail', 'Lukyaniuk', 1220, 'junior developer', 'male', 1991);