package com.BuiNgoTruongTho.LTJavaBuoi4.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BuiNgoTruongTho.LTJavaBuoi4.models.Course;

@Service
public class CourseService {
    private List<Course> listcourse = new ArrayList<>();
    public void add(Course newProduct) {
        listcourse.add(newProduct);
    }
    public List<Course> GetAll(){return listcourse;}
}
