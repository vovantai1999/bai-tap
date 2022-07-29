function transcript(){
    let arrenglish = ["banana", "apple", "black,", "orange"];
    let arrvietnam = ["quả chuối", "quả táo", "màu đen", "quả cam"];
    let string = (document.getElementById("string"));
    let index_english = 0;
    for( let i = 0; i < arrenglish.leng; i++){
        if(string == arrenglish[i]){
            index_english = i;
            for (let j = 0; j < arrvietnam; j++){
                if(index_english == j){
                    result = arrvietnam[j];
                }
            }
        }
    }
    document.getElementById("result").innerHTML = result;
}