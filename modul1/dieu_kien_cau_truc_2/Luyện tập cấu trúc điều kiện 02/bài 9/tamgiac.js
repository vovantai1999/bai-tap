function kiemtra(){
    let a=Number(document.getElementById("a").value);
    let b=Number(document.getElementById("b").value);
    let c=Number(document.getElementById("c").value);
    let result =document.querySelector("#result"); 
    result.innerHTML= `${a>0 && b>0 && c>0?a < b + c && b < a + c && c < a + b? "Đây là ba cạnh tạo nên một tam giác!":"Ba cạnh này không tạo thành một tam giác!":"Hãy nhập vào ba số dương!"}`
}