ALTER TABLE student add constraint age_constraint check (age > 15);
ALTER TABLE student alter column name set not null;
ALTER TABLE student add constraint name_unique unique (name);
ALTER TABLE faculty add constraint color_unique unique (name, color);
ALTER TABLE student alter age set default 20;
//