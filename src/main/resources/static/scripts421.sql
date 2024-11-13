--Возраст студента не может быть меньше 16 лет.
ALTER TABLE student ADD CONSTRAINT age_constraint check (age >= 16);
--Имена студентов должны быть уникальными и не равны нулю.
ALTER TABLE student ALTER COLUMN name SET NOT NULL;
ALTER TABLE student ADD CONSTRAINT name_unique UNIQUE(name);
--Пара “значение названия” - “цвет факультета” должна быть уникальной.
ALTER TABLE faculty ADD CONSTRAINT color_unique UNIQUE(name, color);
--При создании студента без возраста ему автоматически должно присваиваться 20 лет.
ALTER TABLE student ALTER age SET DEFAULT 20;