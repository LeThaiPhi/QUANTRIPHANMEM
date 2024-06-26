package com.example.group11_quantripm.model;

public class SanPham {
    private int id;
    private String category;
    private String img_product;
    private String name_product;
    private String price_product;
    private String note_product;

    private String time_product;
    private String quantity_product;

    public SanPham() {
    }

    public SanPham(int id, String category, String img_product, String name_product, String price_product, String note_product, String time_product ,String quantity_product) {
        this.id = id;
        this.category = category;
        this.img_product = img_product;
        this.name_product = name_product;
        this.price_product = price_product;
        this.note_product = note_product;
        this.quantity_product =quantity_product;
        this.time_product = time_product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg_product() {
        return img_product;
    }

    public void setImg_product(String img_product) {
        this.img_product = img_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getPrice_product() {
        return price_product;
    }

    public void setPrice_product(String price_product) {
        this.price_product = price_product;
    }

    public String getNote_product() {
        return note_product;
    }

    public void setNote_product(String note_product) {
        this.note_product = note_product;
    }


    public String getTime_product() {
        return time_product;
    }

    public void setTime_product(String note_product) {
        this.time_product = time_product;
    }
    public String getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(String quantity_product) {
        this.quantity_product = quantity_product;
    }

}
