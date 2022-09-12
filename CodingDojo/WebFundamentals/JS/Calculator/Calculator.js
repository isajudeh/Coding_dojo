var displayDiv = document.querySelector("#display");
displayDiv.innerText = "0";
var firstInput='';
var firstInput1='';

function press(x){
    firstInput+=x;
    displayDiv.innerText = firstInput;
    return(parseFloat(firstInput));
}
function setOP(y){
    if (y=='/'){
        parseFloat(a= 5/press()) ;
        displayDiv.innerText = a;
    }
    else if(y=='*'){
        var a= 5*press();
        displayDiv.innerText = a;   
    } 
}

function calculate(){

}

function clr(){

}

