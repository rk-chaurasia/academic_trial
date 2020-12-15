package com.merlin.timetable.rest;

import com.merlin.timetable.domain.ClassStandard;
import com.merlin.timetable.domain.ClassStandardRepository;
import com.merlin.timetable.domain.ReqBody;
import com.merlin.timetable.domain.SubjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.InjectService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/merlin")
@Slf4j
public class ApiController {

    private final ClassStandardRepository classStandardRepository;
    private final SubjectRepository subjectRepository;

    public ApiController(ClassStandardRepository classStandardRepository, SubjectRepository subjectRepository) {
        this.classStandardRepository = classStandardRepository;
        this.subjectRepository = subjectRepository;
    }

//    @RequestMapping(value = "/addclass")
//    public HttpEntity addClassStd(@RequestBody ReqBody reqBody){
//        ClassStandard classStandard = new ClassStandard()
//    }

    @RequestMapping(value = "/class")
    public HttpEntity getClassStandard(){
        System.out.println(classStandardRepository.findAll());
        return new HttpEntity("abc");
    }

    @RequestMapping(value = "/subject/{s_id}")
    public ResponseEntity getSubject(@PathVariable("s_id") Integer s_id){
        System.out.println(subjectRepository.findById(s_id));
        return new ResponseEntity("abc", HttpStatus.ACCEPTED);
    }
}
