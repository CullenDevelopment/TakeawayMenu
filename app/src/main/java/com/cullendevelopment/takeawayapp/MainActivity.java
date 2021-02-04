package com.cullendevelopment.takeawayapp;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import static java.util.Locale.UK;


public class MainActivity extends AppCompatActivity {


    public MainActivity() {
        /* no argument constructor */
    }



    double totalPrice = 0;


    private int submit_order_quantity = 0;

    protected static int halloumi_quantity = 0;
    protected static int kolokithokeftedes_quantity = 0;
    protected static int keftedes_quantity = 0;
    protected static int halloumi_pancetta_quantity = 0;
    protected static int calamari_quantity = 0;
    protected static int salad_quantity = 0;
    protected static int patzarosalata_quantity = 0;
    protected static int hummus_quantity = 0;
    protected static int tsatziki_quantity = 0;
    protected static int tirokafteri_quantity = 0;
    protected static int gyros_open_quantity = 0;
    protected static int gyros_wrapped_quantity = 0;
    protected static int mixed_souvlaki_quantity = 0;
    protected static int pork_souvlaki_quantity = 0;
    protected static int chicken_souvlaki_quantity = 0;
    protected static int yiaourtlou_quantity = 0;
    protected static int seftalies_quantity = 0;
    protected static int moshari_quantity = 0;
    protected static int meat_moussaka_quantity = 0;
    protected static int veg_moussaka_quantity = 0;
    protected static int spanakopita_quantity = 0;
    protected static int baklava_quantity = 0;
    protected static int galactobureko_quantity = 0;
    protected static int cake_quantity = 0;
    protected static int ravani_quantity = 0;

    protected static String HALLOUMI_AMOUNT = "HALLOUMI_AMOUNT";
    protected static String KOLOKITHOKEFTEDES_AMOUNT = "KOLOKITHOKEFTEDES_AMOUNT";
    protected static String KEFTEDES_AMOUNT = "KEFTEDES_AMOUNT";
    protected static String HALLOUMI_PANCETTA_AMOUNT = "HALLOUMI_PANCETTA_AMOUNT";
    protected static String CALAMARI_AMOUNT = "CALAMARI_AMOUNT";
    protected static String SALAD_AMOUNT = "SALAD_AMOUNT";
    protected static String PATZAROSALATA_AMOUNT = "PATZAROSALATA_AMOUNT";
    protected static String HUMMUS_AMOUNT = "HUMMUS_AMOUNT";
    protected static String TSATZIKI_AMOUNT = "TSATZIKI_AMOUNT";
    protected static String TIROKAFTERI_AMOUNT = "TIROKAFTERI_AMOUNT";


    protected static String GYROS_OPEN_AMOUNT = "GYROS_OPEN_AMOUNT";
    protected static String GYROS_WRAPPED_AMOUNT = "GYROS_WRAPPED_AMOUNT";
    protected static String MIXED_SOUVLAKI_AMOUNT = "MIXED_SOUVLAKI_AMOUNT";
    protected static String PORK_SOUVLAKI_AMOUNT = "PORK_SOUVLAKI_AMOUNT";
    protected static String CHICKEN_SOUVLAKI_AMOUNT = "CHICKEN_SOUVLAKI_AMOUNT";
    protected static String YIAOURTLOU_AMOUNT = "YIAOURTLOU_AMOUNT";
    protected static String SEFTALIES_AMOUNT = "SEFTALIES_AMOUNT";
    protected static String MOSHARI_AMOUNT = "MOSHARI_AMOUNT";
    protected static String MEAT_MOUSSAKA_AMOUNT = "MEAT_MOUSSAKA_AMOUNT";
    protected static String VEG_MOUSSAKA_AMOUNT = "VEG_MOUSSAKA_AMOUNT";
    protected static String SPANAKOPITA_AMOUNT = "SPANAKOPITA_AMOUNT";


    protected static String BAKLAVA_AMOUNT = "BAKLAVA_AMOUNT";
    protected static String GALACTOBUREKO_AMOUNT = "GALACTOBUREKO_AMOUNT";
    protected static String CAKE_AMOUNT = "CAKE_AMOUNT";
    protected static String RAVANI_AMOUNT = "RAVANI_AMOUNT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        outState.putInt(BAKLAVA_AMOUNT, baklava_quantity);
        outState.putInt(GALACTOBUREKO_AMOUNT, galactobureko_quantity);
        outState.putInt(CAKE_AMOUNT, cake_quantity);
        outState.putInt(RAVANI_AMOUNT, ravani_quantity);
    }




    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int[] scrcoords = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    /**create summary of order
     *
     * @param showName name of customer
     * @param totalPrice of order
     * @return text summary
     */

    @SuppressLint("DefaultLocale")
    private String createOrderSummary(String showName, String showPhone, String showTime, double totalPrice) {
        String priceMessage = getString(R.string.summary_order_name) + showName;
        priceMessage +=  "\n" + getString(R.string.cust_telephone) + showPhone;
        priceMessage +=  "\n" + getString(R.string.collect_time) + showTime;
        if(hummus_quantity > 0){
            priceMessage += "\n" + getString(R.string.halloumi) + hummus_quantity;
        }
        if(kolokithokeftedes_quantity > 0){
            priceMessage += "\n" + getString(R.string.kolokithokeftedes) + kolokithokeftedes_quantity;
        }
        if(keftedes_quantity > 0){
            priceMessage += "\n" + getString(R.string.keftedes) + keftedes_quantity;
        }
        if(halloumi_pancetta_quantity > 0){
            priceMessage += "\n" + getString(R.string.halloumi_pancetta) + halloumi_pancetta_quantity;
        }
        if(calamari_quantity > 0){
            priceMessage += "\n" + getString(R.string.calamari) + calamari_quantity;
        }
        if(salad_quantity > 0){
            priceMessage += "\n" + getString(R.string.salad) + salad_quantity;
        }
        if(patzarosalata_quantity > 0){
            priceMessage += "\n" + getString(R.string.patzarosalata) + patzarosalata_quantity;
        }
        if(hummus_quantity > 0){
            priceMessage += "\n" + getString(R.string.hummus) + hummus_quantity;
        }
        if(tsatziki_quantity > 0){
            priceMessage += "\n" + getString(R.string.tsatziki) + tsatziki_quantity;
        }
        if(tirokafteri_quantity > 0){
            priceMessage += "\n" + getString(R.string.tirokafteri) + tirokafteri_quantity;
        }
        if(gyros_open_quantity > 0){
            priceMessage += "\n" + getString(R.string.gyros_open) + gyros_open_quantity;
        }
        if(gyros_wrapped_quantity > 0){
            priceMessage += "\n" + getString(R.string.gyros_wrapped) + gyros_wrapped_quantity;
        }
        if(mixed_souvlaki_quantity > 0){
            priceMessage += "\n" + getString(R.string.mixed_souvlaki) + mixed_souvlaki_quantity;
        }
        if(pork_souvlaki_quantity > 0){
            priceMessage += "\n" + getString(R.string.pork_souvlaki) + pork_souvlaki_quantity;
        }
        if(chicken_souvlaki_quantity > 0){
            priceMessage += "\n" + getString(R.string.chicken_souvlaki) + chicken_souvlaki_quantity;
        }
        if(yiaourtlou_quantity > 0){
            priceMessage += "\n" + getString(R.string.yiaourtlou) + yiaourtlou_quantity;
        }
        if(seftalies_quantity > 0){
            priceMessage += "\n" + getString(R.string.seftalies) + seftalies_quantity;
        }
        if(moshari_quantity > 0){
            priceMessage += "\n" + getString(R.string.moshari) + moshari_quantity;
        }
        if(meat_moussaka_quantity > 0){
            priceMessage += "\n" + getString(R.string.meat_moussaka) + meat_moussaka_quantity;
        }
        if(veg_moussaka_quantity > 0){
            priceMessage += "\n" + getString(R.string.veg_moussaka) + veg_moussaka_quantity;
        }
        if(spanakopita_quantity > 0){
            priceMessage += "\n" + getString(R.string.spanakopita) + spanakopita_quantity;
        }
        if(baklava_quantity > 0){
            priceMessage += "\n" + getString(R.string.baklava) + baklava_quantity;
        }
        if(galactobureko_quantity > 0){
            priceMessage += "\n" + getString(R.string.galactobureko) + galactobureko_quantity;
        }
        if(cake_quantity > 0){
            priceMessage += "\n" + getString(R.string.cake) + cake_quantity;
        }
        if(ravani_quantity > 0){
            priceMessage += "\n" + getString(R.string.ravani) + ravani_quantity;
        }
        priceMessage += String.format("\n%s%s", getString(R.string.total), String.format(UK,"%.2f", totalPrice));
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }




    public void submitOrder(View view) {
        submit_order_quantity = submit_order_quantity + 1;
        EditText enterName = findViewById(R.id.nameBar);
        String showName = enterName.getText().toString(); //gets you the contents of name edit text
        EditText enterTelephone = findViewById(R.id.your_telephone);
        String showPhone = enterTelephone.getText().toString(); //gets you the contents of telephone numberedit text
        EditText enterTime = findViewById(R.id.collect_time);
        String showTime = enterTime.getText().toString(); //gets you the contents of telephone numberedit text


        double totalPrice = calculatePrice();
        String priceMessage = createOrderSummary(showName, showPhone, showTime, totalPrice);


        if(submit_order_quantity == 1 && totalPrice != 0){
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "cullendevelopment@outlook.com", null));
            // only email apps should handle this
            intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.yiannis_order) + showName);
            intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
            startActivity(Intent.createChooser(intent, "Send email..."));
        }
    }

    private double calculatePrice() {

        //desserts prices
        double baklavaBasePrice = 4.50;
        double galactoburekoBasePrice = 4.50;
        double cakeBasePrice = 4.80;
        double ravaniBasePrice = 4.80;

        //Starters prices
        double halloumiBasePrice = 4.80;
        double kolokithokeftedesBasePrice = 5.00;
        double keftedesBasePrice = 5.00;
        double halloumiPancettaBasePrice = 5.50;
        double calamariBasePrice = 5.00;
        double saladBasePrice = 4.30;
        double patzarosalataBasePrice = 4.50;
        double hummusBasePrice = 2.50;
        double tsatzikiBasePrice = 2.50;
        double tirokafteriBasePrice = 2.70;

        //Mains Prices
        double gyrosOpenBasePrice = 9.90;
        double gyrosWrappedBasePrice = 5.00;
        double mixedSouvlakiBasePrice = 11.90;
        double porkSouvlakiBasePrice = 11.50;
        double chickenSouvlakiBasePrice = 11.50;
        double yiaourtlouBasePrice = 11.50;
        double seftaliesBasePrice = 11.50;
        double moshariBasePrice = 11.90;
        double meatMoussakaBasePrice = 11.50;
        double vegMoussakaBasePrice = 11.50;
        double spanakopitaBasePrice = 9.90;

        //Subtotal prices
        //Dessert Prices
        double baklavaPrice;
        double galactoburekoPrice;
        double cakePrice;
        double ravaniPrice;

        //Starters prices
        double halloumiPrice;
        double kolokithokeftedesPrice;
        double keftedesPrice;
        double halloumiPancettaPrice;
        double calamariPrice;
        double saladPrice;
        double patzarosalataPrice;
        double hummusPrice;
        double tsatzikiPrice;
        double tirokafteriPrice;

        //Mains Prices
        double gyrosOpenPrice;
        double gyrosWrappedPrice;
        double mixedSouvlakiPrice;
        double porkSouvlakiPrice;
        double chickenSouvlakiPrice;
        double yiaourtlouPrice;
        double seftaliesPrice;
        double moshariPrice;
        double meatMoussakaPrice;
        double vegMoussakaPrice;
        double spanakopitaPrice;

        //The Calculations
        baklavaPrice = baklavaBasePrice * baklava_quantity;
        totalPrice = totalPrice + baklavaPrice;

        galactoburekoPrice = galactoburekoBasePrice * galactobureko_quantity;
        totalPrice = totalPrice + galactoburekoPrice;

        cakePrice = cakeBasePrice * cake_quantity;
        totalPrice = totalPrice + cakePrice;

        ravaniPrice = ravaniBasePrice * ravani_quantity;
        totalPrice = totalPrice + ravaniPrice;

        halloumiPrice = halloumiBasePrice * halloumi_quantity;
        totalPrice = totalPrice + halloumiPrice;

        kolokithokeftedesPrice = kolokithokeftedesBasePrice * kolokithokeftedes_quantity;
        totalPrice = totalPrice + kolokithokeftedesPrice;

        keftedesPrice = keftedesBasePrice * keftedes_quantity;
        totalPrice = totalPrice + keftedesPrice;

        halloumiPancettaPrice = halloumiPancettaBasePrice * halloumi_pancetta_quantity;
        totalPrice = totalPrice + halloumiPancettaPrice;

        calamariPrice = calamariBasePrice * calamari_quantity;
        totalPrice = totalPrice + calamariPrice;

        saladPrice = saladBasePrice * salad_quantity;
        totalPrice = totalPrice + saladPrice;

        patzarosalataPrice = patzarosalataBasePrice * patzarosalata_quantity;
        totalPrice = totalPrice + patzarosalataPrice;

        hummusPrice = hummusBasePrice * hummus_quantity;
        totalPrice = totalPrice + hummusPrice;

        tsatzikiPrice = tsatzikiBasePrice * tsatziki_quantity;
        totalPrice = totalPrice + tsatzikiPrice;

        tirokafteriPrice = tirokafteriBasePrice * tirokafteri_quantity;
        totalPrice = totalPrice + tirokafteriPrice;

        gyrosOpenPrice = gyrosOpenBasePrice * gyros_open_quantity;
        totalPrice = totalPrice + gyrosOpenPrice;

        gyrosWrappedPrice = gyrosWrappedBasePrice * gyros_wrapped_quantity;
        totalPrice = totalPrice + gyrosWrappedPrice;

        mixedSouvlakiPrice = mixedSouvlakiBasePrice * mixed_souvlaki_quantity;
        totalPrice = totalPrice + mixedSouvlakiPrice;

        porkSouvlakiPrice = porkSouvlakiBasePrice * pork_souvlaki_quantity;
        totalPrice = totalPrice + porkSouvlakiPrice;

        chickenSouvlakiPrice = chickenSouvlakiBasePrice * chicken_souvlaki_quantity;
        totalPrice = totalPrice + chickenSouvlakiPrice;

        yiaourtlouPrice = yiaourtlouBasePrice * yiaourtlou_quantity;
        totalPrice = totalPrice + yiaourtlouPrice;

        seftaliesPrice = seftaliesBasePrice * seftalies_quantity;
        totalPrice =totalPrice + seftaliesPrice;

        moshariPrice = moshariBasePrice * moshari_quantity;
        totalPrice = totalPrice + moshariPrice;

        meatMoussakaPrice = meatMoussakaBasePrice * meat_moussaka_quantity;
        totalPrice = totalPrice + meatMoussakaPrice;

        vegMoussakaPrice = vegMoussakaBasePrice * veg_moussaka_quantity;
        totalPrice = totalPrice + vegMoussakaPrice;

        spanakopitaPrice = spanakopitaBasePrice * spanakopita_quantity;
        totalPrice = totalPrice + spanakopitaPrice;



        return totalPrice;

    }

    public void reset(View view) {
        halloumi_quantity = 0;
        kolokithokeftedes_quantity = 0;
        keftedes_quantity = 0;
        halloumi_pancetta_quantity = 0;
        calamari_quantity = 0;
        salad_quantity = 0;
        patzarosalata_quantity = 0;
        hummus_quantity = 0;
        tsatziki_quantity = 0;
        tirokafteri_quantity = 0;
        gyros_open_quantity = 0;
        gyros_wrapped_quantity = 0;
        mixed_souvlaki_quantity = 0;
        pork_souvlaki_quantity = 0;
        chicken_souvlaki_quantity = 0;
        yiaourtlou_quantity = 0;
        seftalies_quantity = 0;
        moshari_quantity = 0;
        meat_moussaka_quantity = 0;
        veg_moussaka_quantity = 0;
        spanakopita_quantity = 0;
        baklava_quantity = 0;
        galactobureko_quantity = 0;
        cake_quantity = 0;
        ravani_quantity = 0;

        submit_order_quantity = 0;


        totalPrice = 0;
        ((EditText) findViewById(R.id.nameBar)).setText(" ");
        ((EditText) findViewById(R.id.your_telephone)).setText(" ");
        ((EditText) findViewById(R.id.collect_time)).setText(" ");

        ((TextView) findViewById(R.id.halloumi_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.kolokithokeftedes_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.keftedes_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.halloumi_pancetta_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.calamari_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.salad_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.patzarosalata_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.hummus_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.tsatziki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.tirokafteri_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.gyros_open_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.gyros_wrapped_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.mixed_souvlaki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.pork_souvlaki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.chicken_souvlaki_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.yiaourtlou_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.seftalies_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.meat_moussaka_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.veg_moussaka_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.moshari_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.spanakopita_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.baklava_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.galactobureko_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.cake_quantity_text_view)).setText("0");
        ((TextView) findViewById(R.id.ravani_quantity_text_view)).setText("0");
    }


    public void starters_homeClicked(View view) {

        // Create a new intent to open the {@link Starters}
        Intent starters_home_intent = new Intent(MainActivity.this, Starters.class);

        // Start the new activity
        startActivity(starters_home_intent); // opens up the Starters Activity
    }

    public void mains_homeClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent mains_home_intent = new Intent(MainActivity.this, Mains.class);

        // Start the new activity
        startActivity(mains_home_intent); // opens up the Starters Activity
    }

    public void desserts_homeClicked(View view) {
        // Create a new intent to open the {@link Starters}
        Intent desserts_home_intent = new Intent(MainActivity.this, Desserts.class);

        // Start the new activity
        startActivity(desserts_home_intent); // opens up the Starters Activity
    }
}
