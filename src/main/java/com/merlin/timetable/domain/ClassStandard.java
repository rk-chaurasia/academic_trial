package com.merlin.timetable.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "class")
@Data
@NoArgsConstructor
public class ClassStandard implements Serializable {

    @Id
    private Integer id;

    @JsonProperty(value = "class_std")
    private String classStd;

    @JsonProperty(value = "class_teacher")
    private String classTeacher;

    @JsonProperty(value = "class_subjects")
    private List<Subject> subjectList;


}
