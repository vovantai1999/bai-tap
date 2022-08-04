class product{
    constructor(productId, productName, quantity, price, photo ){
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.photo = photo;
        this.amount = this.quantity * this.price;
    }
}
let products =[];
let key_data = "key";
    
function init(){
    if(getData(key_data) == null){
        products = [
            new product(1, "Bún Bò", 5, 30000, "https://i.ytimg.com/vi/A_o2qfaTgKs/maxresdefault.jpg"),
            new product(2, "Bánh canh ", 3, 30000, "https://bathaofood.com/wp-content/uploads/to-banh-canh-ca-loc-bathao-1-scaled.jpg"),
            new product(3, "Bò Húc", 7, 15000, "https://cf.shopee.vn/file/5cd2c375002ec00ef7b63f6756060508"),
            new product(4, "Phở Gà", 2, 50000, "https://trivietphat.net/wp-content/uploads/2021/08/pho-ga1-1.jpg"),
        ]
        setData(key_data, products);
    }
    else{
        products = getData(key_data);    
    }
    
}
function getData(key){
    return JSON.parse(localStorage.getItem(key_data));
}
function setData(key, data){
    localStorage.setItem("key",JSON.stringify(data));
}
function renderProduct(){
    let tbproduct = document.querySelector('.table>tbody');
    let htmls = products.map(function(product){
        return`
            <tr id="tr_${product.productId}">
                <td>${product.productId}</td>
                <td>${product.productName}</td>
                <td class="text-right:center">${product.quantity}</td>
                <td class="text-right:center">${formathCurrency(product.price)}</td>
                <td class="text-right"><img id = "img_${product.getProductId}" style ="width: 90px; height: 70px;" src= ${product.photo} </td>
                <td class="text-right">${formathCurrency(product.amount)}</td>
                <td id="action_${product.productId}" class="text-right">
                <button class="btn btn-warning" onclick="change(${product.productId})">Edit</button>
                <button class="btn btn-primary d-none" onclick="update(${product.productId})">Update</button>
                <button class="btn btn-warning d-none" onclick="cancel(${product.productId})">Cancel</button>
                <button class="btn btn-danger" onclick= "remove(${product.productId})">Remove</button>
                </td>
            </tr>`
    })
    tbproduct.innerHTML = htmls.join("");
    document.querySelector("#totalAmount").innerHTML = formathCurrency(totalAmount());
}
function totalAmount(){
    let totalAmount = products.reduce(function(total, pdt){
        return total + pdt.amount;

    }, 0)
    return totalAmount;
}
function formathCurrency(number){
    return number.toLocaleString('vi', {style : 'currency', currency : 'VND'});
}
function addProduct(){
    let productName = document.querySelector("#productName").value;
    if(!validation(productName)){
        alert("ProductName is required !")
        return;
    }
    let quantity = Number(document.querySelector("#quantity").value);
    let price = Number(document.querySelector("#price").value);
    let photo =document.querySelector("#photo").value;
    let productId = getLastestId() + 1;
    let  newProduct = new product(productId, productName, quantity, price, photo);
    
    products.push(newProduct);
    setData(key_data, products);
    // setData("key_data", products);
    renderProduct();
    resetForm();
}
function getLastestId(){
    let producTemp = [...products];
    let maxId = producTemp.sort(function(pdt1, pdt2){
        return pdt2.productId - pdt1.productId
    })[0].productId
    return maxId;
}
function resetForm(){
    document.querySelector("#productName").value = "";
    document.querySelector("#quantity").value = ""
    document.querySelector("#price").value ="";
    document.querySelector("#photo").value ="";

}
function validation(field){
    return field != null && field.trim() != "";
}
function remove(productId){
        let confirmed = window.confirm("continue to delete");
        if(confirmed){
            let position = products.findIndex(function(pdt){
                return pdt.productId ==  productId;
            });
            products.splice(position, 1);
            setData(key_data,products);
            renderProduct();
        }   
}


function change(pdtId){
    let tr = document.getElementById(`tr_${pdtId}`);
    let position = getProductById(pdtId);   
    tr.children[1].innerHTML = `<input id="ip_productName_${pdtId}" class ='form-control-md' type ='text' value = '${products[position].productName}' />`;
    tr.children[2].innerHTML = `<input id="ip_productQuantity_${pdtId}" class ='form-control-md' type ='number' value = '${products[position].quantity}' />`;
    tr.children[3].innerHTML = `<input id="ip_productPrice_${pdtId}" class ='form-control-md' type ='number' value = '${products[position].price}' />`;
    tr.children[4].innerHTML = `<input id="ip_productPhoto_${pdtId}" class ='form-control-md' type ='text' value = '${products[position].photo}' />`;
    let action = document.getElementById(`action_${pdtId}`);
    action.children[0].classList.add('d-none');
    action.children[1].classList.remove('d-none');
    action.children[2].classList.remove('d-none');
}

function getProductById(pdtId){
    return products.findIndex(function(pdt){
        return pdt.productId == pdtId; 
    })  
}
function cancel(pdtId){
    let tr = document.getElementById(`tr_${pdtId}`);
    let position = getProductById(pdtId); 
    tr.children[1].innerHTML = products[position].productName;
    tr.children[2].innerHTML = products[position].quantity;
    tr.children[3].innerHTML = formathCurrency(products[position].price);

    let imgElement = `<img id="img_undefined" style="width: 90px; height: 70px;" src=${products[position].photo} />`;
    
    tr.children[4].innerHTML = imgElement;
    document.querySelector(`#img_${products[position].pdtId}`);

    let action = document.getElementById(`action_${pdtId}`);
    action.children[0].classList.remove('d-none');
    action.children[1].classList.add('d-none');
    action.children[2].classList.add('d-none');


}

function update(pdtId){
    let tr = document.getElementById(`tr_${pdtId}`);
    let position = getProductById(pdtId);
    let newProductName = document.querySelector(`#ip_productName_${pdtId}`).value;
    let newQuantity = document.querySelector(`#ip_productQuantity_${pdtId}`).value;
    let newPrice = document.querySelector(`#ip_productPrice_${pdtId}`).value;
    let photo = document.querySelector(`#ip_productPhoto_${pdtId}`).value;
    products[position].productName = newProductName;
    products[position].quantity = newQuantity;
    products[position].price = newPrice;
    products[position].photo = photo;
    products[position].amount =  products[position].quantity * products[position].price;
    tr.children[5].innerHTML = formathCurrency(products[position].amount);
    
    setData(key_data, products);
    document.querySelector("#totalAmount").innerHTML = formathCurrency(totalAmount());
    cancel(pdtId);

} 

function ready(){
    init();
    renderProduct();

}
ready();
