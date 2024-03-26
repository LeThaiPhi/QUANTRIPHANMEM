package com.example.group11_quantripm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.example.group11_quantripm.adapter.PagerAdapter_AddFood;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AddProductManageActivity extends AppCompatActivity {
    ViewPager2 viewPagerAddProduct;
    TabLayout tabLayoutAddProduct;
    PagerAdapter_AddFood adapter_addFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product_manage);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        viewPagerAddProduct = findViewById(R.id.viewpager2_add_product);
        tabLayoutAddProduct = findViewById(R.id.tablayout_add_product);

        adapter_addFood = new PagerAdapter_AddFood(this);
        viewPagerAddProduct.setAdapter(adapter_addFood);

        new TabLayoutMediator(tabLayoutAddProduct, viewPagerAddProduct, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Loại sản phẩm");
                        break;
                    case 1:
                        tab.setText("Thêm sản phẩm ");
                        break;
                    case 2:
                        tab.setText("Sản phẩm phổ biến");
                        break;
                }
            }
        }).attach();
    }
}