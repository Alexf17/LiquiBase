package com.rangers.liquibase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "employ_id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}
