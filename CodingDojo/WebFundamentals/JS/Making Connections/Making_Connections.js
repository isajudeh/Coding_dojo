var count=2;
function remove1(x){
    x.parentElement.parentElement.remove();
    count--;
    document.querySelector(".circle").innerText = count ;
}
var count1=2;
var count2=500;
function remove2(x){
    x.parentElement.parentElement.remove();
    count1--;
    document.querySelector(".circle").innerText = count1 ;
    count2++;
    document.querySelector(".circle1").innerText = count2 ;
}
var y=document.querySelector(".sub h1");
function change(){
    y.innerText = "SOSO LOLO";
}