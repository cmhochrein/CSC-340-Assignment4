package com.assignment4.crudapp.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 *
 * @author Chris
 */
@Entity
@Table(name = "data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String firstName;
    private String lastName;
    
    public Data(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
