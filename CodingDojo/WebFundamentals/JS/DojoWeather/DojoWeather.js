function remove(element){
    document.querySelector(".cookie").remove();
}

var conv = document.querySelectorAll("#number");
function temp(){
    for (var i=0;i<conv.length;++i){
        conv[i].innerText=Math.floor((conv[i].innerText*(9/5))+32);
    }
}