import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  

  constructor() { }


  getCourses()
  {
    return ["course1","course-2","course-3"];
  }
}
