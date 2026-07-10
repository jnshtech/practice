//var const let

var a=10;

//alert
//console
//window.alert

const adharnumber=2324979799
let name=jenish
let address=annanagar,chennai
var phone_number=24798359795;
console.log(adharnumber,address,phone_number)


// variable types:(3 types)
// 1.var =redeclare/update, 2.let=only update cann't redeclared, 3.const = cann't redeclared and update 
var phone_no = 8967859403;
const Aadhar_no = 9854453687645;
let name = "Ak";
let age = 25
var address = "chennai"
let date =  Date("1999-08-23")

// print types:(3 types)
//1.console.log() = print in inspect (console)
//2.alter, 3.window.alter = print(popup)

console.log("phone no:",phone_no) 
console.log("name:",name) 
console.log("Aadhar:",Aadhar_no) 
// alert(age)
// window.alert(address)

// update and redeclare
var address = "madurai"
// window.alert(address)

// wecan't update and redeclare
// const Aadhar_no = 676857594749;
// console.log("Aadhar:",Aadhar_no) 


// update but cann't redeclare
// let name = "bt";
// console.log("name:",name) 
// update
let name1 = "bt";
console.log("name:",name1) 

// // // // console.log(date)


// // // // // data type:
// // // // // primitive datatype:
// // // // // string,number,boolean,undefined,null,symbol
// // // // // non-primitive
// // // // // object

// // // // name1 = 'Ak'
// // // // console.log(name1)
// // // // console.log(typeof(name1))

// // // // age = 26
// // // // console.log(age)
// // // // console.log(typeof age)

// // // // a = true
// // // // console.log(a)
// // // // console.log(typeof a)

// // // // // we should mention variable type
// // // // let u_define; 
// // // // console.log(u_define)
// // // // console.log(typeof(u_define))

// // // // // null mentioned null is an object type
// // // // n = null
// // // // console.log(n)
// // // // console.log(typeof n)

// // // // s = Symbol('AK')
// // // // console.log(s)
// // // // console.log(typeof s)
// // // // // using symbol as keyword to object
// // // // dis={
// // // //     [s]:'ajith'
// // // // }
// // // // console.log(dis[s])

// // // // //object
// // // // var selfIntro ={
// // // //     'name':"Ajithkumar K",
// // // //     'place':"Ramanathapuram",
// // // //     'degree':"MCA",
// // // //     'college_name':"sona college of technology",
// // // //     'college_place':'salem',
// // // //     'yearOfPassout':2021,
// // // //     "company_name" : 'Funbook Software Pvt Ltd',
// // // //     "experience":'Software Trainee Engineer',
// // // //     knowleged :{
// // // //         'skill':'Python'
// // // //     },
// // // //     'field':'web scraping',
// // // //     'course':'Python Full Stack Development',
// // // //     'career':'software development'
// // // // }

// // // // console.log(`Good morning sir/ma'am.

// // // // My name is ${selfIntro.name}, and I am from ${selfIntro.place}, Tamil Nadu. I completed my ${selfIntro.degree} from ${selfIntro.college_name}, ${selfIntro.college_place}.

// // // // I have experience as a ${selfIntro.experience} at ${selfIntro.college_name} , where I worked with ${selfIntro.knowleged.skill} and ${selfIntro.field} projects.

// // // // My technical skills include ${selfIntro.knowleged.skill}, Java, HTML, CSS, and basic knowledge of Linux, EC2, and Nifi.

// // // // Currently, I am pursuing a ${selfIntro.course} course to improve my technical skills and prepare for a ${selfIntro.career} career.

// // // // Thank you.
// // // //  `)
// // // // // input from user
// // // // var person_name = prompt("enter your name:")
// // // // console.log("name:",person_name)
// // // // var person_age = Number(prompt("enter your age:"))
// // // // console.log("age:",person_age)
// // // // var mobile_number = BigInt(prompt("enter your mobile number:"))
// // // // window.alert(mobile_number)
// // // // console.log("mobile_number:",mobile_number)

// // // // // type casting

// // // // // convert number to string

// // // // var n = 123
// // // // console.log("number value:",n)
// // // // console.log("convert number to string:",String(n))
// // // // console.log(typeof n)
// // // // console.log(String(typeof n))// we can't see type converting types 

// // // // // convert string to number
// // // // var s_n = "123"
// // // // console.log("string value:",s_n)
// // // // console.log("convert string to number:",Number(s_n))
// // // // console.log(typeof s_n)
// // // // console.log(Number(typeof s_n))// we can't see type converting types 

// // // // // NaN means (not a number)

// // // // // operators:

// // // // // arithmetic -> +,-,*,/,%
// // // // // assignment -> +=,-=,*=,/=,%=
// // // // // logical -> &&,||,!
// // // // // comparition -> >,<,>=,<=,!=,!==(streat not edual),==,===(check data type and value (give 100% accurancy))

// // // // let number1 = Number(prompt("enter your first value:"))
// // // // let number2 = Number(prompt("enter your second value:"))
// // // // console.log("add value is:",number1+number2)
// // // // console.log("subtract value is:",number1-number2)
// // // // console.log("multiply value is:",number1*number2)
// // // // console.log("division value is:",number1/number2)
// // // // console.log("modulo value is:",number1%number2)
// // // // console.log("exponent value is:",number1**number2)

// // // // // comparision
// // // // console.log("equal value is:",number1 == number2)
// // // // console.log("notequal value is:",number1 != number2)
// // // // console.log("greater than value is:",number1 > number2)
// // // // console.log("lesser than value is:",number1 < number2)
// // // // console.log("greater than equal value is:",number1 >= number2)
// // // // console.log("lesser than equal value is:",number1 <= number2)

// // // // // assignment

value = 10
console.log("add and equal value is:",value += value)
console.log("subtract and equal value is:",value -= value)
console.log("multiply and equal value is:",value *= value)
console.log("division and equal value is:",value /= value)
console.log("modulo and equal value is:",value %= value)
console.log("exponent and equal value is:",value **= value)
console.log("add and equal value is:",value++)
console.log("add and equal value is:",value--)

// // // // // logical 
// // // // first_value ,second_value = 15, 10
// // // // console.log("both condition are equal:", first_value >2 && second_value <20 ) 
// // // // console.log("any one condition are equal:", first_value >2 || second_value <20 ) 
// // // // console.log("both condition are equal:", !second_value <20 ) 

// if = true statement

// var voter_age = Number(prompt("enter your age:"))
// var compare_age = Number(prompt("enter your comparition age:"))
//  if (voter_age > compare_age){
//     alert("your agre eligible for vote")
//  }
//  else if(voter_age == compare_age){
//     alert("your eligible for appling voter id")
//  }
//  else{
//     alert("your not eligible for vote")
//  }


//  date = Number(prompt("enter your day"))
//  let day = Number(prompt("enter your date:"))


//  switch(day){
//     case 1:
//         window.alert("monday")
//         break
//     case 2:
//         window.alert("tuesday")
//         break
//     case 3:
//         window.alert("wednesday")
//         break
//     default:
//         window.alert("no days")
//         break
//  }


// // // for statement
// // first_digit = Number(prompt("enter your first digit:"))
// // last_digit = Number(prompt("enter your last digit:"))
// // table_value = Number(prompt("which table:"))
// //  for(var i=first_digit;i<=last_digit;i++){
// //     console.log(i+"x"+table_value+"="+i*table_value)
// //  }
// // console.log("while loop method")
// // //  while loop:
// // i = first_digit
// // while(i<=last_digit){
// //     console.log(i+"x"+table_value+"="+i*table_value)
// //     i++
// // }

start = Number(prompt("enter your first number:"))
end = Number(prompt("enter your end number:"))
do{
    console.log(start)
    start++
}while(start<=end)

var student = {
    student_name : prompt("enter student name :"),
    student_age : Number(prompt("enter student age :")),
    student_class : prompt("enter student class :")
}
for( key in student){
    console.log(key + ':' +student[key] )
}


details = ["Ajith", 26, "chennai"]
for(person of details){
    console.log(person)
}


