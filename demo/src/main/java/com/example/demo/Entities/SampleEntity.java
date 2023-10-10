package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "table_springboot")
public class SampleEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sempleentity_sequence")
    @SequenceGenerator(name="sempleentity_sequence", sequenceName="sempleentity_sequence", allocationSize=100)
    private Long id;

    private String name;
    private String surname;
    private String mail;
    private Date brithdate;


}