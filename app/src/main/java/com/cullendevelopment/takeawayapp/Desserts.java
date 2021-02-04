package com.cullendevelopment.takeawayapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;


public class Desserts extends MainActivity{

    public Desserts() {
        /* No args constructor */
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        TextView baklavaQuantityTextView = findViewById(R.id.baklava_quantity_text_view);
        baklavaQuantityTextView.setText(String.valueOf(baklava_quantity));

        TextView galactobureko_quantityTextView = findViewById(R.id.galactobureko_quantity_text_view);
        galactobureko_quantityTextView.setText(String.valueOf(galactobureko_quantity));

        TextView cakeQuantityTextView = findViewById(R.id.cake_quantity_text_view);
        cakeQuantityTextView.setText(String.valueOf(cake_quantity));

        TextView ravaniQuantityTextView = findViewById(R.id.ravani_quantity_text_view);
        ravaniQuantityTextView.setText(String.valueOf(ravani_quantity));

        // Desserts increment and decrement buttons



    }

    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState
    @Override
    public void onSaveInstanceState(@NonNull Bundle  outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(BAKLAVA_AMOUNT, baklava_quantity);
        outState.putInt(GALACTOBUREKO_AMOUNT, galactobureko_quantity);
        outState.putInt(CAKE_AMOUNT, cake_quantity);
        outState.putInt(RAVANI_AMOUNT, ravani_quantity);
    }

    /**
     * This method displays the given  ravani quantity value on the screen.
     */
    private void displayRavaniQuantity(int ravani_quantity) {
        TextView ravaniQuantityTextView = findViewById(R.id.ravani_quantity_text_view);
        ravaniQuantityTextView.setText(String.valueOf(ravani_quantity));
    }
    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    private void displayBaklavaQuantity(int baklava_quantity) {
        TextView baklavaQuantityTextView = findViewById(R.id.baklava_quantity_text_view);
        baklavaQuantityTextView.setText(String.valueOf(baklava_quantity));
    }


    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    private void displayGalactoburekoQuantity(int galactobureko_quantity) {
        TextView galactobureko_quantityTextView = findViewById(R.id.galactobureko_quantity_text_view);
        galactobureko_quantityTextView.setText(String.valueOf(galactobureko_quantity));
    }

    /**
     * This method displays the given  baklava quantity value on the screen.
     */
    private void displayCakeQuantity(int cake_quantity) {
        TextView cakeQuantityTextView = findViewById(R.id.cake_quantity_text_view);
        cakeQuantityTextView.setText(String.valueOf(cake_quantity));
    }



    public void mains_dessertsClicked(View view) {
        // Create a new intent to open the {@link Mains}
        Intent mains_desserts_intent = new Intent(Desserts.this, Mains.class);

        // Start the new activity
        startActivity(mains_desserts_intent); // opens up the Mains Activity
    }

    public void starters_dessertsClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent starters_desserts_intent = new Intent(Desserts.this, Starters.class);

        // Start the new activity
        startActivity(starters_desserts_intent); // opens up the Starters Activity
    }


    public void order_dessertsClicked(View view) {
        // Create a new intent to open the {@link MainActivity Home}
        Intent order_desserts_intent = new Intent(Desserts.this, MainActivity.class);

        // Start the new activity
        startActivity(order_desserts_intent); // opens up the MainActivity
    }

    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void baklavaIncrement(View view) {

        if (baklava_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 pieces of Baklava!", Toast.LENGTH_SHORT).show();
            return;
        }
        baklava_quantity = baklava_quantity + 1;
        displayBaklavaQuantity(baklava_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void baklavaDecrement(View view) {

        if (baklava_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 Baklava!", Toast.LENGTH_SHORT).show();
            return;
        }

        baklava_quantity = baklava_quantity - 1;
        displayBaklavaQuantity(baklava_quantity);

    }


    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void galactobureko_increment(View view) {

        if (galactobureko_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 Galactbureko?", Toast.LENGTH_SHORT).show();
            return;
        }
        galactobureko_quantity= galactobureko_quantity + 1;
        displayGalactoburekoQuantity(galactobureko_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void galactobureko_decrement(View view) {

        if (galactobureko_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 Galactbureko!", Toast.LENGTH_SHORT).show();
            return;
        }

        galactobureko_quantity = galactobureko_quantity - 1;
        displayGalactoburekoQuantity(galactobureko_quantity);

    }

    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void cake_increment(View view) {

        if (cake_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 pieces of Chocolate cake?", Toast.LENGTH_SHORT).show();
            return;
        }
        cake_quantity = cake_quantity + 1;
        displayCakeQuantity(cake_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void cake_decrement(View view) {

        if (cake_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 pieces of cake!", Toast.LENGTH_SHORT).show();
            return;
        }

        cake_quantity = cake_quantity - 1;
        displayCakeQuantity(cake_quantity);

    }


    /**
     * This method is called when the baklava increment button is clicked.
     */
    public void ravani_increment(View view) {

        if (ravani_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 Ravani?", Toast.LENGTH_SHORT).show();
            return;
        }
        ravani_quantity = ravani_quantity + 1;
        displayRavaniQuantity(ravani_quantity);

    }

    /**
     * This method is called when the  baklava decrement button is clicked.
     */
    public void ravani_decrement(View view) {

        if (ravani_quantity ==  0) {
            Toast.makeText(this, "You cannot have less than 0 Ravani!", Toast.LENGTH_SHORT).show();
            return;
        }

        ravani_quantity = ravani_quantity -1;
        displayRavaniQuantity(ravani_quantity);

    }

}
