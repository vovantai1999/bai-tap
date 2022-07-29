function result(){
    let size = Number(document.querySelector('#size').value);
    let min = Number(document.querySelector('#min').value);
    let max = Number(document.querySelector('#max').value);
    let arrays = (document.querySelector('#array'));
    let arrtotal = (document.querySelector('#total'));
    let maxvalue = (document.querySelector('#maxArray'));
    let arrcount = (document.querySelector('#count'));

    let maxArray;
    let count = 0;
    let total = 0;  

    let numbers = new Array(size);
        for(let i = 0; i < numbers.length; i++ ){
            numbers[i] = Math.floor(Math.random()*(max - min + 1) + min );
        };
        arrays.value = numbers;
        
        for (let i = 0; i < numbers.length; i++){
        total = total + numbers[i];
         };
         arrtotal.value = total;

         maxArray = numbers[0]
         for (let i = 0; i < numbers.length; i++){
            if (numbers[i] > maxArray) maxArray = numbers[i];
         };
         maxvalue.value = maxArray;
         for (let i = 0; i < numbers.length; i++){
            if (numbers[i]%2 == 0) count = count + 1;
         };
         arrcount.value = count;
        
        
        
        }






