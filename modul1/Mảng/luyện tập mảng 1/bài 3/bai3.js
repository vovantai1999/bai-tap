function result(){
    let size = Number(document.querySelector("#size").value);
    let max = Number(document.querySelector("#max").value);
    let min = Number(document.querySelector("#min").value);
    let array = document.querySelector("#array");
    let total =(document.querySelector("#total"));
    let maxvalue = document.querySelector("#maxvalue");
    let tb = document.querySelector("#trungbinh");
    let maxArray;
    let arr_total = 0;
    let trungbinh = 0


    let numbers = new Array(size);
    for( let i = 0; i < numbers.length; i++){
       numbers[i] = Math.floor(Math.random()*(max - min + 1 ) + min);
    }
          array.value = numbers;
    maxArray = numbers[0];
    for(let i = 0; i < numbers.length; i++){
        if (numbers[i] > maxArray) maxArray = numbers[i];
    }     maxvalue.value = maxArray;
     
    for(let i = 0; i < numbers.length; i ++){
        arr_total = arr_total + numbers[i];
     } total.value = arr_total;
     
     for(let i  = 0; i < numbers.length; i++){
        trungbinh = arr_total / numbers.length;
     } tb.value = trungbinh;


}