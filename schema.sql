create database userappdb;
use userappdb;

CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    amount DOUBLE NOT NULL,
    type ENUM('income', 'expense') NOT NULL
);
