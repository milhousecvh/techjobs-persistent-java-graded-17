--Part 1
SELECT *
FROM techjobs

integer id
string employer
string name
string skills

--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT *
FROM skills
INNER JOIN job_skills ON skills.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;