BEGIN;
create table if not exists grades(
 grade_id numeric,
 primary key (grade_id)
);
create table if not exists courses(
  course_id numeric,
  course_name "char",
  primary key (course_id)
);
create table if not exists student(
id numeric,
    name "char",
    surename "char",
    courses numeric,
    grades"numeric",
    primary key (id),
foreign key (courses) REFERENCES courses(course_id),
foreign key (grades) references grades(grade_id)
);
create table if not exists proffesor(
id numeric,
   name "char",
    surename "char",
    courses numeric,
    primary key (id),
    foreign key (courses) REFERENCES courses(course_id)

);
create table if not exists secratary(
id numeric,
name "char",
surename "char",
courses numeric,
    primary key (id),
foreign key (courses) REFERENCES courses(course_id)
);

END;
