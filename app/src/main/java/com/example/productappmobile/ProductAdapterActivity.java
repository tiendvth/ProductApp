package com.example.productappmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapterActivity extends AppCompatActivity {
    private List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_adapter);
        generateData();
        ProductAdapter productAdapter = new ProductAdapter(this, productList);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerView recyclerView = findViewById(R.id.rvProductList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(productAdapter);
    }

    public void generateData() {
        productList.add(new Product(1, "Product 1", R.drawable.adc, 30000));
        productList.add(new Product(2, "Product 2", R.drawable.cba, 35000));
        productList.add(new Product(3, "Product 3", R.drawable.download, 40000));

    }
}
