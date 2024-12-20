CREATE TABLE user_data (
     user_id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(50),
     age INT,
     height DOUBLE,
     weight DOUBLE,
     bmi DOUBLE,
     input_date DATETIME
);

CREATE TABLE activity_data (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    activity_description VARCHAR(255),
    activity_date DATETIME,
    FOREIGN KEY (user_id) REFERENCES user_data(user_id)
);
