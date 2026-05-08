/**CREATE TABLE sale (
    id INT PRIMARY KEY AUTO_INCREMENT,

    date DATETIME NOT NULL,

    employee_cc INT NOT NULL,

    subtotal DOUBLE NOT NULL,
    iva DOUBLE NOT NULL,
    total DOUBLE NOT NULL,

    CONSTRAINT fk_sale_employee
        FOREIGN KEY (employee_cc)
        REFERENCES employee(cc)
); */

package com.andres.supermarket_jwt.entity;

public class SaleEntity {

    
}