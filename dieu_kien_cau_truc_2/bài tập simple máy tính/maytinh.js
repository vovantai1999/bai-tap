var input=document.querySelectorAll('.input')
var item= Array.from(document.querySelectorAll('.item'));
items.forEach (function(btn){
    btn.addEventListener('click',function(){
        if(input.innerHTML=='0'){
        input.innerHTML==''};
        if(btn.innerHTML=='AC')
        input.innerHTML=='0';
        else if(btn.innerHTML=='DEL'){
            var arrtext=Array.from(input.innerHTML);
            arrtexxt.splice(arrtext.length-1,1);
            if(arrtext.length!=0) 
            input.innerHTML=arrtext.join('');
            else input.innerHTML='0';
        }
        else if(btn.innerHTML=='='){    
            input.innerHTML=eval(input.innerHTML)
        }
        else input.innerHTML+=btn.innerHTML;
    })
})      