package com.offcn.jpa.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="name",nullable = true,length = 20)
    private String name;
    @Column(name="age",nullable = true,length = 4)
    private Integer age;
}
