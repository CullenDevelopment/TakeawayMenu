package com.cullendevelopment.takeawayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;


public class Starters extends MainActivity {

    public Starters() {
        /* No args constructor */
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        TextView halloumiQuantityTextView =  findViewById(R.id.halloumi_quantity_text_view);
        halloumiQuantityTextView.setText(String.valueOf(halloumi_quantity));

        TextView kolokithokeftedesQuantityTextView =  findViewById(R.id.kolokithokeftedes_quantity_text_view);
        kolokithokeftedesQuantityTextView.setText(String.valueOf(kolokithokeftedes_quantity));

        TextView keftedesQuantityTextView = findViewById(R.id.keftedes_quantity_text_view);
        keftedesQuantityTextView.setText(String.valueOf(keftedes_quantity));

        TextView halloumiPancettaQuantityTextView =  findViewById(R.id.halloumi_pancetta_quantity_text_view);
        halloumiPancettaQuantityTextView.setText(String.valueOf(halloumi_pancetta_quantity));

        TextView calamariQuantityTextView = findViewById(R.id.calamari_quantity_text_view);
        calamariQuantityTextView.setText(String.valueOf(calamari_quantity));

        TextView saladQuantityTextView =  findViewById(R.id.salad_quantity_text_view);
        saladQuantityTextView.setText(String.valueOf(salad_quantity));

        TextView patzarosalataQuantityTextView =  findViewById(R.id.patzarosalata_quantity_text_view);
        patzarosalataQuantityTextView.setText(String.valueOf(patzarosalata_quantity));

        TextView hummusQuantityTextView = findViewById(R.id.hummus_quantity_text_view);
        hummusQuantityTextView.setText(String.valueOf(hummus_quantity));

        TextView tirokafteriQuantityTextView =  findViewById(R.id.tirokafteri_quantity_text_view);
        tirokafteriQuantityTextView.setText(String.valueOf(tirokafteri_quantity));

        TextView tsatzikiQuantityTextView = findViewById(R.id.tsatziki_quantity_text_view);
        tsatzikiQuantityTextView.setText(String.valueOf(tsatziki_quantity));

    }

    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState
    @Override
    public void onSaveInstanceState(@NonNull Bundle  outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(HALLOUMI_AMOUNT, halloumi_quantity);
        outState.putInt(KOLOKITHOKEFTEDES_AMOUNT, kolokithokeftedes_quantity);
        outState.putInt(KEFTEDES_AMOUNT, keftedes_quantity);
        outState.putInt(HALLOUMI_PANCETTA_AMOUNT, halloumi_pancetta_quantity);
        outState.putInt(CALAMARI_AMOUNT, calamari_quantity);
        outState.putInt(SALAD_AMOUNT, salad_quantity);
        outState.putInt(PATZAROSALATA_AMOUNT, patzarosalata_quantity);
        outState.putInt(HUMMUS_AMOUNT, hummus_quantity);
        outState.putInt(TSATZIKI_AMOUNT, tsatziki_quantity);
        outState.putInt(TIROKAFTERI_AMOUNT, tirokafteri_quantity);
    }

    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(@NonNull Bundle  savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        MainActivity.halloumi_quantity = savedInstanceState.getInt(HALLOUMI_AMOUNT);
        halloumiDisplayQuantity(MainActivity.halloumi_quantity);


        kolokithokeftedes_quantity = savedInstanceState.getInt(KOLOKITHOKEFTEDES_AMOUNT);
        kolokithokeftedesDisplayQuantity(kolokithokeftedes_quantity);

        keftedes_quantity = savedInstanceState.getInt(KEFTEDES_AMOUNT);
        keftedesDisplayQuantity(keftedes_quantity);

        halloumi_pancetta_quantity = savedInstanceState.getInt(HALLOUMI_PANCETTA_AMOUNT);
        halloumiPancettaDisplayQuantity(halloumi_pancetta_quantity);

        calamari_quantity = savedInstanceState.getInt(CALAMARI_AMOUNT);
        calamariDisplayQuantity(calamari_quantity);

        salad_quantity = savedInstanceState.getInt(SALAD_AMOUNT);
        saladDisplayQuantity(salad_quantity);

        patzarosalata_quantity = savedInstanceState.getInt(PATZAROSALATA_AMOUNT);
        patzarosalataDisplayQuantity(patzarosalata_quantity);

        hummus_quantity = savedInstanceState.getInt(HUMMUS_AMOUNT);
        hummusDisplayQuantity(hummus_quantity);

        tsatziki_quantity = savedInstanceState.getInt(TSATZIKI_AMOUNT);
        tsatzikiDisplayQuantity(tsatziki_quantity);

        tirokafteri_quantity = savedInstanceState.getInt(TIROKAFTERI_AMOUNT);
        tirokafteriDisplayQuantity(tirokafteri_quantity);
    }

    /**
     * This method is called when the halloumi increment button is clicked.
     */
    public void halloumi_increment(View view) {

        if (halloumi_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Halloumi?", Toast.LENGTH_SHORT).show();
            return;
        }
        halloumi_quantity = halloumi_quantity + 1;
        halloumiDisplayQuantity(halloumi_quantity);

    }

    /**
     * This method is called when the  halloumi decrement button is clicked.
     */
    public void halloumi_decrement(View view) {

        if (halloumi_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Halloumi!", Toast.LENGTH_SHORT).show();
            return;
        }

        halloumi_quantity = halloumi_quantity - 1;
        halloumiDisplayQuantity(halloumi_quantity);

    }
    /**
     * This method displays the given halloumi quantity value on the screen.
     */
    public void halloumiDisplayQuantity(int halloumi_quantity) {
        TextView halloumiQuantityTextView = findViewById(R.id.halloumi_quantity_text_view);
        halloumiQuantityTextView.setText(String.valueOf(halloumi_quantity));
    }

    /**
     * This method is called when the kolokithokeftedes increment button is clicked.
     */
    public void kolokithokeftedes_increment(View view) {

        if (kolokithokeftedes_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Kolokithokeftedes?", Toast.LENGTH_SHORT).show();
            return;
        }
        kolokithokeftedes_quantity = kolokithokeftedes_quantity + 1;
        kolokithokeftedesDisplayQuantity(kolokithokeftedes_quantity);


    }

    /**
     * This method is called when the kolokithokeftedes decrement button is clicked.
     */
    public void kolokithokeftedes_decrement(View view) {

        if (kolokithokeftedes_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Kolokithokeftedes!", Toast.LENGTH_SHORT).show();
            return;
        }

        kolokithokeftedes_quantity = kolokithokeftedes_quantity - 1;
        kolokithokeftedesDisplayQuantity(kolokithokeftedes_quantity);

    }
    /**
     * This method displays the given kolokithokeftedes quantity value on the screen.
     */
    public void kolokithokeftedesDisplayQuantity(int kolokithokeftedes_quantity) {
        TextView kolokithokeftedesQuantityTextView = findViewById(R.id.kolokithokeftedes_quantity_text_view);
        kolokithokeftedesQuantityTextView.setText(String.valueOf(kolokithokeftedes_quantity));
    }

    /**
     * This method is called when the keftedes increment button is clicked.
     */
    public void keftedes_increment(View view) {

        if (keftedes_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Keftedes?", Toast.LENGTH_SHORT).show();
            return;
        }
        keftedes_quantity = keftedes_quantity + 1;
        keftedesDisplayQuantity(keftedes_quantity);

    }

    /**
     * This method is called when the keftedes decrement button is clicked.
     */
    public void keftedes_decrement(View view) {

        if (keftedes_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Keftedes!", Toast.LENGTH_SHORT).show();
            return;
        }

        keftedes_quantity = keftedes_quantity - 1;
        keftedesDisplayQuantity(keftedes_quantity);

    }
    /**
     * This method displays the given keftedes quantity value on the screen.
     */
    public void keftedesDisplayQuantity(int keftedes_quantity) {
        TextView keftedesQuantityTextView = findViewById(R.id.keftedes_quantity_text_view);
        keftedesQuantityTextView.setText(String.valueOf(keftedes_quantity));
    }



    /**
     * This method is called when the halloumi_pancetta increment button is clicked.
     */
    public void halloumi_pancetta_increment(View view) {

        if (halloumi_pancetta_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Halloumi Pancetta?", Toast.LENGTH_SHORT).show();
            return;
        }
        halloumi_pancetta_quantity = halloumi_pancetta_quantity + 1;
        halloumiPancettaDisplayQuantity(halloumi_pancetta_quantity);

    }

    /**
     * This method is called when the halloumi_pancetta decrement button is clicked.
     */
    public void halloumi_pancetta_decrement(View view) {

        if (halloumi_pancetta_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Halloumi Pancetta!", Toast.LENGTH_SHORT).show();
            return;
        }

        halloumi_pancetta_quantity = halloumi_pancetta_quantity - 1;
        halloumiPancettaDisplayQuantity(halloumi_pancetta_quantity);

    }
    /**
     * This method displays the given halloumi_pancetta quantity value on the screen.
     */
    public void halloumiPancettaDisplayQuantity(int halloumi_pancetta_quantity) {
        TextView halloumiPancettaQuantityTextView =  findViewById(R.id.halloumi_pancetta_quantity_text_view);
        halloumiPancettaQuantityTextView.setText(String.valueOf(halloumi_pancetta_quantity));
    }

    /**
     * This method is called when the calimari increment button is clicked.
     */
    public void calamari_increment(View view) {

        if (calamari_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Calamari?", Toast.LENGTH_SHORT).show();
            return;
        }
        calamari_quantity = calamari_quantity + 1;
        calamariDisplayQuantity(calamari_quantity);

    }

    /**
     * This method is called when the calimari decrement button is clicked.
     */
    public void calamari_decrement(View view) {

        if (calamari_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Calamari!", Toast.LENGTH_SHORT).show();
            return;
        }
        calamari_quantity = calamari_quantity - 1;
        calamariDisplayQuantity(calamari_quantity);

    }
    /**
     * This method displays the given calimari quantity value on the screen.
     */
    public void calamariDisplayQuantity(int calamari_quantity) {
        TextView calamariQuantityTextView = findViewById(R.id.calamari_quantity_text_view);
        calamariQuantityTextView.setText(String.valueOf(calamari_quantity));
    }

    /**
     * This method is called when the salad increment button is clicked.
     */
    public void salad_increment(View view) {

        if (salad_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Greek Salad?", Toast.LENGTH_SHORT).show();
            return;
        }
        salad_quantity = salad_quantity + 1;
        saladDisplayQuantity(salad_quantity);

    }

    /**
     * This method is called when the salad decrement button is clicked.
     */
    public void salad_decrement(View view) {

        if (salad_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Greek Salad!", Toast.LENGTH_SHORT).show();
            return;
        }
        salad_quantity = salad_quantity - 1;
        saladDisplayQuantity(salad_quantity);

    }
    /**
     * This method displays the given salad quantity value on the screen.
     */
    public void saladDisplayQuantity(int salad_quantity) {
        TextView saladQuantityTextView = findViewById(R.id.salad_quantity_text_view);
        saladQuantityTextView.setText(String.valueOf(salad_quantity));
    }

    /**
     * This method is called when the patzarosalata increment button is clicked.
     */
    public void patzarosalata_increment(View view) {

        if (patzarosalata_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Patzarosalata Beetroot Salad?", Toast.LENGTH_SHORT).show();
            return;
        }
        patzarosalata_quantity = patzarosalata_quantity + 1;
        patzarosalataDisplayQuantity(patzarosalata_quantity);

    }

    /**
     * This method is called when the  patzarosalata decrement button is clicked.
     */
    public void patzarosalata_decrement(View view) {

        if (patzarosalata_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Patzarosalata Beetroot Salad!", Toast.LENGTH_SHORT).show();
            return;
        }
        patzarosalata_quantity = patzarosalata_quantity - 1;
        patzarosalataDisplayQuantity(patzarosalata_quantity);

    }
    /**
     * This method displays the given patzarosalata quantity value on the screen.
     */
    public void patzarosalataDisplayQuantity(int patzarosalata_quantity) {
        TextView patzarosalataQuantityTextView = findViewById(R.id.patzarosalata_quantity_text_view);
        patzarosalataQuantityTextView.setText(String.valueOf(patzarosalata_quantity));
    }

    /**
     * This method is called when the hummus increment button is clicked.
     */
    public void hummus_increment(View view) {

        if (hummus_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Hummus?", Toast.LENGTH_SHORT).show();
            return;
        }
        hummus_quantity = hummus_quantity + 1;
        hummusDisplayQuantity(hummus_quantity);

    }

    /**
     * This method is called when the  hummus decrement button is clicked.
     */
    public void hummus_decrement(View view) {

        if (hummus_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Hummus!", Toast.LENGTH_SHORT).show();
            return;
        }
        hummus_quantity = hummus_quantity - 1;
        hummusDisplayQuantity(hummus_quantity);

    }
    /**
     * This method displays the given hummus quantity value on the screen.
     */
    public void hummusDisplayQuantity(int hummus_quantity) {
        TextView hummusQuantityTextView = findViewById(R.id.hummus_quantity_text_view);
        hummusQuantityTextView.setText(String.valueOf(hummus_quantity));
    }

    /**
     * This method is called when the tsatziki increment button is clicked.
     */
    public void tsatziki_increment(View view) {

        if (tsatziki_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Tsatziki?", Toast.LENGTH_SHORT).show();
            return;
        }
        tsatziki_quantity = tsatziki_quantity + 1;
        tsatzikiDisplayQuantity(tsatziki_quantity);

    }

    /**
     * This method is called when the  tsatziki decrement button is clicked.
     */
    public void tsatziki_decrement(View view) {

        if (tsatziki_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Tsatziki!", Toast.LENGTH_SHORT).show();
            return;
        }
        tsatziki_quantity = tsatziki_quantity - 1;
        tsatzikiDisplayQuantity(tsatziki_quantity);

    }
    /**
     * This method displays the given tsatziki quantity value on the screen.
     */
    public void tsatzikiDisplayQuantity(int tsatziki_quantity) {
        TextView tsatzikiQuantityTextView = findViewById(R.id.tsatziki_quantity_text_view);
        tsatzikiQuantityTextView.setText(String.valueOf(tsatziki_quantity));
    }

    /**
     * This method is called when the tirokafteri increment button is clicked.
     */
    public void tirokafteri_increment(View view) {

        if (tirokafteri_quantity == 20) {
            Toast.makeText(this, "Do you really want to order more than 20 portions of Tirokafteri?", Toast.LENGTH_SHORT).show();
            return;
        }
        tirokafteri_quantity = tirokafteri_quantity + 1;
        tirokafteriDisplayQuantity(tirokafteri_quantity);

    }

    /**
     * This method is called when the  tirokafteri decrement button is clicked.
     */
    public void tirokafteri_decrement(View view) {

        if (tirokafteri_quantity == 0) {
            Toast.makeText(this, "You cannot have less than 0 portions of Tirokafteri!", Toast.LENGTH_SHORT).show();
            return;
        }
        tirokafteri_quantity = tirokafteri_quantity - 1;
        tirokafteriDisplayQuantity(tirokafteri_quantity);

    }
    /**
     * This method displays the given tirokafteri quantity value on the screen.
     */
    public void tirokafteriDisplayQuantity(int tirokafteri_quantity) {
        TextView tirokafteriQuantityTextView = findViewById(R.id.tirokafteri_quantity_text_view);
        tirokafteriQuantityTextView.setText(String.valueOf(tirokafteri_quantity));
    }






    public void home_startersClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent home_starters_intent = new Intent(Starters.this, MainActivity.class);

        // Start the new activity
        startActivity(home_starters_intent); // opens up the Starters Activity
    }

    public void mains_startersClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent mains_home_intent = new Intent(Starters.this, Mains.class);

        // Start the new activity
        startActivity(mains_home_intent); // opens up the Starters Activity
    }

    public void desserts_startersClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent desserts_home_intent = new Intent(Starters.this, Desserts.class);

        // Start the new activity
        startActivity(desserts_home_intent); // opens up the Starters Activity
    }

}
