/**CREATE TABLE supplier (
    id INT PRIMARY KEY AUTO_INCREMENT,

    nit VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL
);
 */

package com.andres.supermarket_jwt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "supplier")
@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column( unique = true, length = 50, name = "nit")
    private String nit;

    @NotNull
    @Column( length = 100, name = "name")
    private String name;

}