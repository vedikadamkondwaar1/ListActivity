package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AppleList extends AppCompatActivity {
    CardView cardView1, cardView2;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_list);

        cardView1=findViewById(R.id.card_view);

        final Dialog dialog = new Dialog(context);
        dialog.setTitle("Custom Dialog");
        final ImageView cartDecrement = dialog.findViewById(R.id.cart_decrement);
        ImageView cartIncrement = dialog.findViewById(R.id.cart_increment);









    }
}
