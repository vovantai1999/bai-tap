function(checkNgay){
    with (frm){
        var m=eval(month.vale);
    
        switch(m){
            case 4: case 6: case 9: case 11:
                ketqua.value ="Tháng" + m + " có 30 ngày ";
                break;
            default:
                ketqua.value ="Tháng" + m +" có 31 ngày ";
        }
    }
    return false;  
}