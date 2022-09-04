var count=1;
var countElement= document.querySelector("p");

function add(){
    count++;
    countElement.innerText = "The Count is "+ count;
}