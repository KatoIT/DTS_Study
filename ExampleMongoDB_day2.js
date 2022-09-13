/**
 * 
 * Example MongoDB - Day 2
 * Author: KatoIT
 * 
 *  */

db.createCollection('student')

db.student.insertMany([
    { name: 'A', year: 2000, gender: true, math: 5, physica: 8, chemistry: 8 , class: 'A1', grade: 10},
    { name: 'B', year: 2000, gender: false, math: 9, physica: 7, chemistry: 6 , class: 'A1', grade: 10},
    { name: 'C', year: 2000, gender: true, math: 7, physica: 6, chemistry: 4 , class: 'A1', grade: 10},
    { name: 'D', year: 2000, gender: false, math: 5, physica: 9, chemistry: 6 , class: 'A2', grade: 10},
    { name: 'E', year: 2000, gender: false, math: 5, physica: 9, chemistry: 6 , class: 'A2', grade: 10},
    { name: 'F', year: 2000, gender: true, math: 7, physica: 5, chemistry: 6 , class: 'A2', grade: 10},
    { name: 'G', year: 2000, gender: false, math: 4, physica: 3, chemistry: 8 , class: 'A3', grade: 10},
    { name: 'H', year: 2000, gender: true, math: 7, physica: 7, chemistry: 7 , class: 'A3', grade: 10},
    { name: 'I', year: 2000, gender: false, math: 8, physica: 4, chemistry: 4 , class: 'A3', grade: 10},
])

db.student.aggregate({
    $school: { math: { $abs: { $subtract: ["$max", "$min"] } } }
})

