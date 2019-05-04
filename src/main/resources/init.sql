DROP TABLE IF EXISTS Blogs;

CREATE TABLE Blogs (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(255),
    Body VARCHAR(255)
);

INSERT INTO Blogs (Title, Body) VALUES ('Hello World!', 'This is my first blog entry!');
INSERT INTO Blogs (Title, Body) VALUES ('The Blog Strikes Back!', 'This is my second blog entry, even better than the first!');
INSERT INTO Blogs (Title, Body) VALUES ('Return of the Blog', 'This one has Ewoks!');