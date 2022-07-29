function result(){
    let size = Number(document.querySelector("#size").value);
    let min = Number(document.querySelector('#min').value);
    let max = Number(document.querySelector('#max').value);
    let arrays = (document.querySelector('#array'));
    let maxvalue = (document.querySelector('#maxvalue'));
    let arrcount = (document.querySelector('#count'));
    let stt = (document.querySelector("#stt"));
    let minvalue = (document.querySelector("#minvalue"));

    let maxArray;
    let minArray;
    let count = 0;
    // let total = 0;  

    let numbers = new Array(size);
        for(let i = 0; i < numbers.length; i++ ){
            numbers[i] = Math.floor(Math.random()*(max - min + 1) + min );
        } 
            arrays.value = numbers;
        maxArray = numbers[0];
        for (let i = 0; i < numbers.length; i++){
            if (numbers[i] > maxArray) maxArray = numbers[i];
        };
             maxvalue.value = maxArray;
        minArray = numbers[0];
        for(let i = 0; i < numbers.length; i++){
            if(numbers[i] < minArray) minArray = number[i];
        } minvalue.value = minArray;
        
        
        


    }