/*
How can we access HTML elements (DOM)?
- By TAG: getElementByTagName()
- By ID: getElementById()
- By Name: getElementByNome()
- By Class: getElementByClassName()
- By Seletor: querySelector()

Best practices: By selector.
*/

let name = window.document.getElementById("name");
let email = document.querySelector("input#email"); //just #email also works!
let subject = document.querySelector("#subject");

let okName = false;
let okEmail = false;
let okSubject = false;

name.style.width = "100%";
email.style.width = "100%";

function validateName() {
    let txtName = document.querySelector("#txtName");
    if(name.value.length < 3) {
        txtName.innerHTML = "Invalid name!";
        txtName.style.color = "red";
    } else {
        txtName.innerHTML = "Valid name";
        txtName.style.color = "green";
        okName = true;
    }
}

function validateEmail() {
    let txtEmail = document.querySelector("#txtEmail");
    if(email.value.indexOf("@") === -1 || email.value.indexOf(".") === -1) {
        txtEmail.innerHTML = "Invalid email!"
        txtEmail.style.color = "red";
    } else {
        txtEmail.innerHTML = "Valid email"
        txtEmail.style.color = "green";
        okEmail = true;
    }
}

function validateSubject() {
    let txtSubject = document.querySelector("#txtSubject");
    if(subject.value.length >= 100) {
        txtSubject.innerHTML = "This entry exceeds the maximum length limit of 100 characters!";
        txtSubject.style.color = "red";
        txtSubject.style.display = "block";
    } else {
        txtSubject.style.display = "none";
        okSubject = true;
    }
}

function send() {
    if(okName == true && okEmail == true && okSubject == true) {
        alert("Submitted!");
    } else {
        alert("Please, fill the form correctly before submitting");
    }
}