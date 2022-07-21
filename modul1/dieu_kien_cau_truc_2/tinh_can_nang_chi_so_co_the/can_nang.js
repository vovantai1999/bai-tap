function(kiem_tra){
let weight = document.getElementById("can_nang"). value;
let height = document.getElementById("chieu_cao"). value;
let BMI = weight / Math.pow(height,2);
let result ="";
if(BMI < 18.5){
    result = "chỉ số BMI của bạn là: " + BMI + " ứng với (thiếu cân)"
}
else if(BMI < 25){
    result = "chỉ số BMI của bạn là: " + BMI + " ứng với (bình thường)"
}
else if(BMI < 30){
    result = "chỉ số BMI của bạn là: " + BMI + " ứng với (thừa cân)"
}
else {
    result = "chỉ số BMI của bạn là: " + BMI + " ứng với (béo phì)"
}
document.getElementById(result).innerHTML = result
}