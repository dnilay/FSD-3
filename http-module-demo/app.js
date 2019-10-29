const morgan=require('morgan');
const express = require('express');
const app = express();
app.use(express.json());
app.use(morgan('tiny'));
const courses=[
{
    id:1,
    name:'Course-1'
},
{

    id:2,
    name:'Course-2'
},
{
    id:3,
    name:'Course-3'
}

];


    app.get("/",(req,res)=>{

        res.send("welcome to my first angular app.!");
    });
    
    app.get("/api/courses",(req,res)=>{
    
    res.status(200).send(courses);
    });
    

app.get("/api/courses/:id",(req,res)=>{

    const course=courses.find(c=>c.id==parseInt(req.params.id))
    if(!course)
    {
        res.send('no course found with the given id.');
        return;
    }
    res.send(course);
});

let port=3000;
app.listen(port,()=>{
    console.log("server started and listining on port",port);
})





















