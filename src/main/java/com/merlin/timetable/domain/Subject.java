package com.merlin.timetable.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "subject")
@Data
public class Subject implements Serializable {

    @Id
    private Integer id;

    private String subjectName;

    private String subjectCode;

}
