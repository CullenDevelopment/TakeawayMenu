package com.cullendevelopment.takeawayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;


public class Mains  extends MainActivity {

    public Mains() {
        /* No args constructor */
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        TextView gyrosOpenQuantityTextView =  findViewById(R.id.gyros_open_quantity_text_view);
        gyrosOpenQuantityTextView.setText(String.valueOf(gyros_open_quantity));

        TextView gyrosWrappedQuantityTextView = findViewById(R.id.gyros_wrapped_quantity_text_view);
        gyrosWrappedQuantityTextView.setText(String.valueOf(gyros_wrapped_quantity));

        TextView mixedSouvlakiQuantityTextView = findViewById(R.id.mixed_souvlaki_quantity_text_view);
        mixedSouvlakiQuantityTextView.setText(String.valueOf(mixed_souvlaki_quantity));

        TextView pork_souvlakiQuantityTextView = findViewById(R.id.pork_souvlaki_quantity_text_view);
        pork_souvlakiQuantityTextView.setText(String.valueOf(pork_souvlaki_quantity));

        TextView chickenSouvlakiDisplayQuantityTextView = findViewById(R.id.chicken_souvlaki_quantity_text_view);
        chickenSouvlakiDisplayQuantityTextView.setText(String.valueOf(chicken_souvlaki_quantity));

        TextView yiaourtlouQuantityTextView = findViewById(R.id.yiaourtlou_quantity_text_view);
        yiaourtlouQuantityTextView.setText(String.valueOf(yiaourtlou_quantity));

        TextView seftaliesQuantityTextView = findViewById(R.id.seftalies_quantity_text_view);
        seftaliesQuantityTextView.setText(String.valueOf(seftalies_quantity));

        TextView meatMoussakaQuantityTextView = findViewById(R.id.meat_moussaka_quantity_text_view);
        meatMoussakaQuantityTextView.setText(String.valueOf(meat_moussaka_quantity));

        TextView vegMoussakaQuantityTextView = findViewById(R.id.veg_moussaka_quantity_text_view);
        vegMoussakaQuantityTextView.setText(String.valueOf(veg_moussaka_quantity));

        TextView moshariQuantityTextView = findViewById(R.id.moshari_quantity_text_view);
        moshariQuantityTextView.setText(String.valueOf(moshari_quantity));

        TextView spanakopitaQuantityTextView = findViewById(R.id.spanakopita_quantity_text_view);
        spanakopitaQuantityTextView.setText(String.valueOf(spanakopita_quantity));

    }

    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState
    @Override
    public void onSaveInstanceState(@NonNull Bundle  outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(GYROS_OPEN_AMOUNT, gyros_open_quantity);
        outState.putInt(GYROS_WRAPPED_AMOUNT, gyros_wrapped_quantity);
        outState.putInt(MIXED_SOUVLAKI_AMOUNT, mixed_souvlaki_quantity);
        outState.putInt(PORK_SOUVLAKI_AMOUNT, pork_souvlaki_quantity);
        outState.putInt(CHICKEN_SOUVLAKI_AMOUNT, chicken_souvlaki_quantity);
        outState.putInt(YIAOURTLOU_AMOUNT, yiaourtlou_quantity);
        outState.putInt(SEFTALIES_AMOUNT, seftalies_quantity);
        outState.putInt(MOSHARI_AMOUNT, moshari_quantity);
        outState.putInt(MEAT_MOUSSAKA_AMOUNT, meat_moussaka_quantity);
        outState.putInt(VEG_MOUSSAKA_AMOUNT, veg_moussaka_quantity);
        outState.putInt(SPANAKOPITA_AMOUNT, spanakopita_quantity);

    }


    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(@NonNull Bundle  savedInstanceState){

            super.onRestoreInstanceState(savedInstanceState);

            // Restore UI state from the savedInstanceState.
            // This bundle has also been passed to onCreate.


            gyros_open_quantity = savedInstanceState.getInt(GYROS_OPEN_AMOUNT);
            gyrosOpenDisplayQuantity(gyros_open_quantity);

            gyros_wrapped_quantity = savedInstanceState.getInt(GYROS_WRAPPED_AMOUNT);
            gyrosWrappedDisplayQuantity(gyros_wrapped_quantity);

            mixed_souvlaki_quantity = savedInstanceState.getInt(MIXED_SOUVLAKI_AMOUNT);
            mixedSouvlakiDisplayQuantity(mixed_souvlaki_quantity);

            pork_souvlaki_quantity = savedInstanceState.getInt(PORK_SOUVLAKI_AMOUNT);
            porkSouvlakiDisplayQuantity(pork_souvlaki_quantity);

            chicken_souvlaki_quantity = savedInstanceState.getInt(CHICKEN_SOUVLAKI_AMOUNT);
            chickenSouvlakiDisplayQuantity(chicken_souvlaki_quantity);

            yiaourtlou_quantity = savedInstanceState.getInt(YIAOURTLOU_AMOUNT);
            yiaourtlouDisplayQuantity(yiaourtlou_quantity);

            seftalies_quantity = savedInstanceState.getInt(SEFTALIES_AMOUNT);
            seftaliesDisplayQuantity(seftalies_quantity);

            moshari_quantity = savedInstanceState.getInt(MOSHARI_AMOUNT);
            moshariDisplayQuantity(moshari_quantity);

            meat_moussaka_quantity = savedInstanceState.getInt(MEAT_MOUSSAKA_AMOUNT);
            meatMoussakaDisplayQuantity(meat_moussaka_quantity);

            veg_moussaka_quantity = savedInstanceState.getInt(VEG_MOUSSAKA_AMOUNT);
            vegMoussakaDisplayQuantity(veg_moussaka_quantity);

            spanakopita_quantity = savedInstanceState.getInt(SPANAKOPITA_AMOUNT);
            spanakopitaDisplayQuantity(spanakopita_quantity);

    }

    /**
     * This method is called when the  gyros decrement button is clicked.
     */
    public void gyros_open_decrement(View view) {

        if (gyros_open_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Gyros Chicken(open)!", Toast.LENGTH_SHORT).show();
            return;
        }

        gyros_open_quantity = gyros_open_quantity - 1;
        gyrosOpenDisplayQuantity(gyros_open_quantity);

    }

    /**
     * This method is called when the gyros open increment button is clicked.
     */
    public void gyros_open_increment(View view) {

        if (gyros_open_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Gyros Chicken(open)?", Toast.LENGTH_SHORT).show();
            return;
        }
        gyros_open_quantity = gyros_open_quantity + 1;
        gyrosOpenDisplayQuantity(gyros_open_quantity);

    }
    /**
     * This method displays the given gyros open quantity value on the screen.
     */
    public void gyrosOpenDisplayQuantity(int gyros_open_quantity) {
        TextView gyrosOpenQuantityTextView =  findViewById(R.id.gyros_open_quantity_text_view);
        gyrosOpenQuantityTextView.setText(String.valueOf(gyros_open_quantity));
    }



    /**
     * This method is called when the  gyros wrapped decrement button is clicked.
     */
    public void gyros_wrapped_decrement(View view) {

        if (gyros_wrapped_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Gyros Chicken(wrapped)!", Toast.LENGTH_SHORT).show();
            return;
        }

        gyros_wrapped_quantity = gyros_wrapped_quantity - 1;
        gyrosWrappedDisplayQuantity(gyros_wrapped_quantity);

    }

    /**
     * This method is called when the gyros open increment button is clicked.
     */
    public void gyros_wrapped_increment(View view) {

        if (gyros_wrapped_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Gyros Chicken(wrapped)?", Toast.LENGTH_SHORT).show();
            return;
        }
        gyros_wrapped_quantity = gyros_wrapped_quantity + 1;
        gyrosWrappedDisplayQuantity(gyros_wrapped_quantity);

    }
    /**
     * This method displays the given gyros wrapped value on the screen.
     */
    public void gyrosWrappedDisplayQuantity(int gyros_wrapped_quantity) {
        TextView gyrosWrappedQuantityTextView = findViewById(R.id.gyros_wrapped_quantity_text_view);
        gyrosWrappedQuantityTextView.setText(String.valueOf(gyros_wrapped_quantity));
    }

    /**
     * This method is called when the kolokithokeftedes increment button is clicked.
     */
    public void mixed_souvlaki_increment(View view) {

        if (mixed_souvlaki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Mixed Souvlaki?", Toast.LENGTH_SHORT).show();
            return;
        }
        mixed_souvlaki_quantity = mixed_souvlaki_quantity + 1;
        mixedSouvlakiDisplayQuantity(mixed_souvlaki_quantity);

    }

    /**
     * This method is called when the mixed souvlaki decrement button is clicked.
     */
    public void mixed_souvlaki_decrement(View view) {

        if (mixed_souvlaki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Mixed Souvlaki!", Toast.LENGTH_SHORT).show();
            return;
        }

        mixed_souvlaki_quantity = mixed_souvlaki_quantity - 1;
        mixedSouvlakiDisplayQuantity(mixed_souvlaki_quantity);

    }
    /**
     * This method displays the given mixed souvlaki quantity value on the screen.
     */
    public void mixedSouvlakiDisplayQuantity(int mixed_souvlaki_quantity) {
        TextView mixedSouvlakiQuantityTextView = findViewById(R.id.mixed_souvlaki_quantity_text_view);
        mixedSouvlakiQuantityTextView.setText(String.valueOf(mixed_souvlaki_quantity));
    }

    /**
     * This method is called when the pork souvlaki increment button is clicked.
     */
    public void pork_souvlaki_increment(View view) {

        if (pork_souvlaki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Souvlaki?", Toast.LENGTH_SHORT).show();
            return;
        }
        pork_souvlaki_quantity = pork_souvlaki_quantity + 1;
        porkSouvlakiDisplayQuantity(pork_souvlaki_quantity);

    }

    /**
     * This method is called when the Pork souvlaki decrement button is clicked.
     */
    public void pork_souvlaki_decrement(View view) {

        if (pork_souvlaki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Pork Souvlaki!", Toast.LENGTH_SHORT).show();
            return;
        }

        pork_souvlaki_quantity = pork_souvlaki_quantity - 1;
        porkSouvlakiDisplayQuantity(pork_souvlaki_quantity);

    }
    /**
     * This method displays the given Pork souvlaki quantity value on the screen.
     */
    public void porkSouvlakiDisplayQuantity(int pork_souvlaki_quantity) {
        TextView pork_souvlakiQuantityTextView = findViewById(R.id.pork_souvlaki_quantity_text_view);
        pork_souvlakiQuantityTextView.setText(String.valueOf(pork_souvlaki_quantity));
    }



    /**
     * This method is called when the Chicken souvlaki increment button is clicked.
     */
    public void chicken_souvlaki_increment(View view) {

        if (chicken_souvlaki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Chicken Souvlaki?", Toast.LENGTH_SHORT).show();
            return;
        }
        chicken_souvlaki_quantity = chicken_souvlaki_quantity + 1;
        chickenSouvlakiDisplayQuantity(chicken_souvlaki_quantity);

    }

    /**
     * This method is called when the Chicken souvlaki decrement button is clicked.
     */
    public void chicken_souvlaki_decrement(View view) {

        if (chicken_souvlaki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Chicken Souvlaki!", Toast.LENGTH_SHORT).show();
            return;
        }
        chicken_souvlaki_quantity = chicken_souvlaki_quantity - 1;
        chickenSouvlakiDisplayQuantity(chicken_souvlaki_quantity);

    }
    /**
     * This method displays the given Chicken souvlaki quantity value on the screen.
     */
    public void chickenSouvlakiDisplayQuantity(int chicken_souvlaki_quantity) {
        TextView chickenSouvlakiDisplayQuantityTextView =  findViewById(R.id.chicken_souvlaki_quantity_text_view);
        chickenSouvlakiDisplayQuantityTextView.setText(String.valueOf(chicken_souvlaki_quantity));
    }

    /**
     * This method is called when the yiaourtlou increment button is clicked.
     */
    public void yiaourtlou_increment(View view) {

        if (yiaourtlou_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Yiaourtlou?", Toast.LENGTH_SHORT).show();
            return;
        }
        yiaourtlou_quantity = yiaourtlou_quantity + 1;
        yiaourtlouDisplayQuantity(yiaourtlou_quantity);

    }

    /**
     * This method is called when the yiaourtlou decrement button is clicked.
     */
    public void yiaourtlou_decrement(View view) {

        if (yiaourtlou_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Yiaourtlou!", Toast.LENGTH_SHORT).show();
            return;
        }
        yiaourtlou_quantity = yiaourtlou_quantity - 1;
        yiaourtlouDisplayQuantity(yiaourtlou_quantity);

    }
    /**
     * This method displays the given yiaourtlou quantity value on the screen.
     */
    public void yiaourtlouDisplayQuantity(int yiaourtlou_quantity) {
        TextView yiaourtlouQuantityTextView = findViewById(R.id.yiaourtlou_quantity_text_view);
        yiaourtlouQuantityTextView.setText(String.valueOf(yiaourtlou_quantity));
    }

    /**
     * This method is called when the seftalies increment button is clicked.
     */
    public void seftalies_increment(View view) {

        if (seftalies_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Seftalies?", Toast.LENGTH_SHORT).show();
            return;
        }
        seftalies_quantity = seftalies_quantity + 1;
        seftaliesDisplayQuantity(seftalies_quantity);

    }

    /**
     * This method is called when the seftalies decrement button is clicked.
     */
    public void seftalies_decrement(View view) {

        if (seftalies_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Seftalies!", Toast.LENGTH_SHORT).show();
            return;
        }
        seftalies_quantity = seftalies_quantity - 1;
        seftaliesDisplayQuantity(seftalies_quantity);

    }
    /**
     * This method displays the given seftalies quantity value on the screen.
     */
    public void seftaliesDisplayQuantity(int seftalies_quantity) {
        TextView seftaliesQuantityTextView = findViewById(R.id.seftalies_quantity_text_view);
        seftaliesQuantityTextView.setText(String.valueOf(seftalies_quantity));
    }

    /**
     * This method is called when the meat_moussaka increment button is clicked.
     */
    public void meat_moussaka_increment(View view) {

        if (meat_moussaka_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Meat Moussaka?", Toast.LENGTH_SHORT).show();
            return;
        }
        meat_moussaka_quantity = meat_moussaka_quantity + 1;
        meatMoussakaDisplayQuantity(meat_moussaka_quantity);

    }

    /**
     * This method is called when the  meat moussaka decrement button is clicked.
     */
    public void meat_moussaka_decrement(View view) {

        if (meat_moussaka_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Meat Moussaka!", Toast.LENGTH_SHORT).show();
            return;
        }
        meat_moussaka_quantity = meat_moussaka_quantity - 1;
        meatMoussakaDisplayQuantity(meat_moussaka_quantity);

    }
    /**
     * This method displays the given meat_moussaka quantity value on the screen.
     */
    public void meatMoussakaDisplayQuantity(int meat_moussaka_quantity) {
        TextView meatMoussakaQuantityTextView = findViewById(R.id.meat_moussaka_quantity_text_view);
        meatMoussakaQuantityTextView.setText(String.valueOf(meat_moussaka_quantity));
    }

    /**
     * This method is called when the meat_moussaka increment button is clicked.
     */
    public void veg_moussaka_increment(View view) {

        if (veg_moussaka_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Vegetable Moussaka?", Toast.LENGTH_SHORT).show();
            return;
        }
        veg_moussaka_quantity = veg_moussaka_quantity + 1;
        vegMoussakaDisplayQuantity(veg_moussaka_quantity);

    }

    /**
     * This method is called when the  veg moussaka decrement button is clicked.
     */
    public void veg_moussaka_decrement(View view) {

        if (veg_moussaka_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Vegetable Moussaka!", Toast.LENGTH_SHORT).show();
            return;
        }
        veg_moussaka_quantity = veg_moussaka_quantity - 1;
        vegMoussakaDisplayQuantity(veg_moussaka_quantity);

    }
    /**
     * This method displays the given meat_moussaka quantity value on the screen.
     */
    public void vegMoussakaDisplayQuantity(int veg_moussaka_quantity) {
        TextView vegMoussakaQuantityTextView =  findViewById(R.id.veg_moussaka_quantity_text_view);
        vegMoussakaQuantityTextView.setText(String.valueOf(veg_moussaka_quantity));
    }

    /**
     * This method is called when the moshari increment button is clicked.
     */
    public void moshari_increment(View view) {

        if (moshari_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Moshari Stifado?", Toast.LENGTH_SHORT).show();
            return;
        }
        moshari_quantity = moshari_quantity + 1;
        moshariDisplayQuantity(moshari_quantity);
    }

    /**
     * This method is called when the  moshari decrement button is clicked.
     */
    public void moshari_decrement(View view) {

        if (moshari_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Moshari Stifado!", Toast.LENGTH_SHORT).show();
            return;
        }
        moshari_quantity = moshari_quantity - 1;
        moshariDisplayQuantity(moshari_quantity);

    }
    /**
     * This method displays the given moshari quantity value on the screen.
     */
    public void moshariDisplayQuantity(int moshari_quantity) {
        TextView moshariQuantityTextView = findViewById(R.id.moshari_quantity_text_view);
        moshariQuantityTextView.setText(String.valueOf(moshari_quantity));
    }

    /**
     * This method displays the given spanakopita quantity value on the screen.
     */
    public void spanakopitaDisplayQuantity(int spanakopita_quantity) {
        TextView spanakopitaQuantityTextView = findViewById(R.id.spanakopita_quantity_text_view);
        spanakopitaQuantityTextView.setText(String.valueOf(spanakopita_quantity));
    }

    /**
     * This method is called when the spanakopita increment button is clicked.
     */
    public void spanakopita_increment(View view) {

        if (spanakopita_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Spanakopita?", Toast.LENGTH_SHORT).show();
            return;
        }
        spanakopita_quantity = spanakopita_quantity + 1;
        spanakopitaDisplayQuantity(spanakopita_quantity);

    }

    /**
     * This method is called when the  spanakopita decrement button is clicked.
     */
    public void spanakopita_decrement(View view) {

        if (spanakopita_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Spanakopita!", Toast.LENGTH_SHORT).show();
            return;
        }
        spanakopita_quantity = spanakopita_quantity - 1;
        spanakopitaDisplayQuantity(spanakopita_quantity);

    }



    public void starters_mainsClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent starters_mains_intent = new Intent(Mains.this, Starters.class);

        // Start the new activity
        startActivity(starters_mains_intent); // opens up the Starters Activity
    }

    public void desserts_mainsClicked(View view) {
        // Create a new intent to open the {@link Desserts}
        Intent desserts_mains_intent = new Intent(Mains.this, Desserts.class);

        // Start the new activity
        startActivity(desserts_mains_intent); // opens up the Desserts Activity
    }

    public void order_mainsClicked(View view) {
        // Create a new intent to open the {@link Main Activity}
        Intent order_mains_intent = new Intent(Mains.this, MainActivity.class);

        // Start the new activity
        startActivity(order_mains_intent); // opens up the Main Activity Home page Activity
    }
}

