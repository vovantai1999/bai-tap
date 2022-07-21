function myFunction(){
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let operator = document.getElementById("operator").value;
    var result = 0;
    if(operator=="+"){
        result = parseInt(number1) + parseInt(number2);
    }else if(operator=="-"){
        result = parseInt(number1) - parseInt(number2);
    }else if(operator=="*"){
        result = parseInt(number1) * parseInt(number2);
    }else{
        result = parseInt(number1) / parseInt(number2);
        document.getElementById("result").value = result;  
    }
}

