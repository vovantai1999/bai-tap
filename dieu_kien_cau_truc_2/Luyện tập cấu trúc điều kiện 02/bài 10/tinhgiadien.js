function giadien(){
    let kwh=Number(document.getElementById("kwh").value);
    let result = document.getElementById("result");
    if(kwh>0){
        if(kwh<=50)
            result.innerHTML="Số tiền điện phải trả là: " + (kwh*1.678).toFixed(2) + " VNĐ" ;
       
         else if(kwh<=100)
            result.innerHTML="Số tiền điện phải trả là: "+ (((kwh-50)*1.734)+(50*1.678)).toFixed(2) + " VNĐ";
         
         else if(kwh<=200)
            result.innerHTML="Số tiền điện phải trả là: "+((((kwh-100)*2.014)+(50*1.734))+(50*1.678)).toFixed(2) +" VNĐ";
         
         else if(kwh<=300)
            result.innerHTML="Số tiền điện phải trả là:" +(((((kwh-200)*2.536)+(100*2.014))+(50*1.734))+(50*1.678)).toFixed(2) +" VNĐ";
         
         else if(kwh<=400)
            result.innerHTML="Số tiền điện phải trả là: "+((((((kwh-300)*2.834)+(100*2.536))+(100*2.014))+(50*1.734))+(50*1.678)) +"VNĐ";
         
         else result.innerHTML="Số tiền điện phải trả là: "+((((((kwh-400)*2.927)+(200*2.536))+(100*2.014))+(50*1.734))+(50*1.678)) +"VNĐ";
        
    }
        
}