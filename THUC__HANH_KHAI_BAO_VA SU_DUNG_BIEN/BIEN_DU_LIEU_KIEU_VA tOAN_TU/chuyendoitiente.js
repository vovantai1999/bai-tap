function lamgido(){
    let giatrivao = document.getElementById('dauvao').value;
    let select1 = document.getElementById('select1').value;
    let select2 = document.getElementById('select2').value;
    if (select1 == select2){
    alert(giatrivao)
    }
    if (select1 == "vnđ" && select2 == "usd") {
    alert(giatrivao/24000)
    }
    if (select1 == "usd" && select2 == "vnđ"){
     alert(giatrivao*24000)
    }}