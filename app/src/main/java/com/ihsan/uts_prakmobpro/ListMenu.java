package com.ihsan.uts_prakmobpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.ihsan.uts_prakmobpro.adapter.Product;
import com.ihsan.uts_prakmobpro.adapter.ProductListAdapter;
import com.ihsan.uts_prakmobpro.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ihsan jatnika on 27/10/16.
 */
public class ListMenu extends AppCompatActivity{

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }

    private void setProducts() {

        Product product1 = new Product(1, "Takoyaki", "Makanan khas Canary Japanese", 90000);
        Product product2 = new Product(2, "Tempura",
                "Rasanya oriental dengan sayuran pilihan", 150000);
        Product product3 = new Product(3, "Chicken Teriyaki",
                "Ayam segar setengah matang", 95000);
        Product product4 = new Product(4, "Sashimi",
                "Sushi dengan ikan tuna dan ikan salmon", 120000);
        Product product5 = new Product(5, "Norikita",
                "Nori goreng dengan rasa terhebat", 70000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }
}
