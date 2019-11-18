import { CourseService } from './course.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CourseComponent } from './course/course.component';
import { PostComponent } from './post/post.component';
import {HttpModule} from '@angular/http'
import { from } from 'rxjs';
@NgModule({
  declarations: [
    AppComponent,
    CourseComponent,
    PostComponent
  ],
  imports: [
    BrowserModule,
    HttpModule
    
  ],
  providers: [
CourseService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
