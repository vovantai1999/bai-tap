
function tinhtuoi(){
    let a=Number(document.getElementById("age").value);
    if (a<0){
        alert("Đây không phải là số tuổi của một người");  
    }
    else if(a>120){
        alert("Đây không phải là số tuổi của một người");
    }
    else{alert("Đây là tuổi của một người")};
}      