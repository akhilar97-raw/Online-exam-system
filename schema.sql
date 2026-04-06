CREATE TABLE questions (
    id NUMBER PRIMARY KEY,
    question VARCHAR2(200),
    option1 VARCHAR2(100),
    option2 VARCHAR2(100),
    option3 VARCHAR2(100),
    option4 VARCHAR2(100),
    answer VARCHAR2(100)
);

INSERT INTO questions VALUES (1,'Which language is used to develop Java applications?','C','C++','Java','Python','Java');

INSERT INTO questions VALUES (2,'Which keyword is used to inherit a class in Java?','this','super','extends','implements','extends');

INSERT INTO questions VALUES (3,'Which of the following is not a Java feature?','Object-Oriented','Platform Independent','Use of pointers','Robust','Use of pointers');

INSERT INTO questions VALUES (4,'What is the size of int in Java?','2 bytes','4 bytes','8 bytes','Depends on system','4 bytes');

INSERT INTO questions VALUES (5,'Which method is the entry point of a Java program?','start()','run()','main()','init()','main()');

INSERT INTO questions VALUES (6,'Which package contains Scanner class?','java.io','java.util','java.lang','java.net','java.util');

INSERT INTO questions VALUES (7,'Which concept is used to hide implementation details?','Inheritance','Abstraction','Polymorphism','Encapsulation','Abstraction');

INSERT INTO questions VALUES (8,'Which operator is used for comparison?','=','==','!=','<=','==');

INSERT INTO questions VALUES (9,'Which loop is guaranteed to execute at least once?','for loop','while loop','do-while loop','none','do-while loop');

INSERT INTO questions VALUES (10,'Which keyword is used to define a constant in Java?','static','final','const','immutable','final');

COMMIT;