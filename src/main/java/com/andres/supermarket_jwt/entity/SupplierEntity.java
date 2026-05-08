/**CREATE TABLE supplier (
    id INT PRIMARY KEY AUTO_INCREMENT,

    nit VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL
);
 */

package com.andres.supermarket_jwt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "supplier")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "nit", length = 100, unique = true)
    private String nit;

    @NotNull
    @Column(name = "name", length = 100)
    private String name;

}