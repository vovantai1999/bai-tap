function timX(){
    let a=Number(document.getElementById("a").value);
    let b=Number(document.getElementById("b").value);
    let c=Number(document.getElementById("c").value);
    let denta = b*b-(4*a*c);
    
    if(denta>0){
        alert("PT có 2 nghiệm là: x1= " +(-b+Math.sqrt(denta))/2*a);
        alert("PT có 2 nghiệm là: x2= " +(-b-Math.sqrt(denta))/2*a);
    }
    else if(denta=0){
        alert("PT có nghiệm kép x1 = x2 = " +(-b/2*a));
    }
    else{alert("PT vô nghiệm")
    }
}