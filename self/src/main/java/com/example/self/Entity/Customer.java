package com.example.self.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer {
//    id, first name, middle name, last name, mobile, gender(enum), occupation(enum), datecreated, dateEdited, timeCreated, timeEdited;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;
    private LocalDate dateCreated;
    private LocalTime timeCreated;
    private String Name;



}
