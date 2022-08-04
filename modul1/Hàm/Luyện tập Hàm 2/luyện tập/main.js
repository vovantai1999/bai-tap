function Product (name, price, photo, manufactory) {
    this.name = name;
    this.photo = photo;
    this.price = price;
    this.manufactory = manufactory;
}

let products = [
    new Product("SAMSUNG NOTE 8",4000000,"  https://hcm.clickbuy.com.vn/uploads/2019/05/note-8-h%C3%A0n-1.png","China"),
    new Product("SAMSUNG NOTE 9", 5000000,"https://www.xtmobile.vn/vnt_upload/product/12_2019/thumbs/600_samsung_galaxy_note_9_6gb_1282gb_2_sim_like_new_97_1.jpg","China"),
    new Product("SAMSUNG NOTE 10",10000000,"https://www.xtmobile.vn/vnt_upload/product/12_2019/thumbs/600_note_10_plus_anh_cuc_quang_1.jpg","VietNam"),
    new Product("SAMSUNG NOTE 20", 15000000,"https://product.hstatic.net/1000300544/product/samsung-galaxy-note-20-ultra-01596679737_0a60e802f6b94db7928f5e6c39a09317.jpg","USA")
]   
function renderProduct(){
    let htmls = products.map (function(product, index){
        return `
        <tr>
                <td>${index + 1}</td>
                <th>${product.name}</th>
                <td><img style ="width: 90px; height: 90px;" src="${product.photo}" alt="" </td>
                <td>${product.price}</td>
                <td>${product.manufactory}</td>
                <td>
                <buttton>Remove</button>
                </td>
            </tr>`

    });
        document.querySelector('.tbProduct>tbody').innerHTML = htmls.join("");

}
renderProduct();