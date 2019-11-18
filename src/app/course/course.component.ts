import { CourseService } from './../course.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-course',
  template: `
  <h2>{{title}}</h2>
  <ul>
    <li *ngFor="let course of courses">{{course}}</li>
  </ul>

  `
})
export class CourseComponent implements OnInit {

  title="list of courses";
  courses=[];
  constructor(service:CourseService) { 

this.courses=service.getCourses();

  }

  ngOnInit() {
  }

}
