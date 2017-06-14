package com.example.android.quzi;




import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.quzi.R;

import static android.R.attr.checkedButton;
import static android.R.attr.id;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.os.Build.VERSION_CODES.M;
import static com.example.android.quzi.R.id.radio_a_1;
import static com.example.android.quzi.R.id.radio_a_2;
import static com.example.android.quzi.R.id.radio_a_3;


public class SportActivity extends AppCompatActivity {
    int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);


        final Context context = this;
        Button button;


        button = (Button) findViewById(R.id.buttonAlert);

        // add button listener
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Sport Final Score ");

                // set dialog message
                int res = (int) ((finalScore * 100.f) / 5);
                alertDialogBuilder
                        .setMessage("Your got: " + res + "% of the question correct!")
                        .setCancelable(false)
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if this button is clicked, close
                                // current activity
                                SportActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Try Again", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });


        RadioGroup group1 = (RadioGroup) findViewById(R.id.radio_group);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioa1 = (RadioButton) findViewById(radio_a_1);
                RadioButton radioa2 = (RadioButton) findViewById(radio_a_2);
                RadioButton radioa3 = (RadioButton) findViewById(radio_a_3);



                boolean checkbutton1 = radioa1.isChecked();
                boolean checkbutton2 = radioa2.isChecked();
                boolean checkbutton3 = radioa3.isChecked();


                if (checkbutton1) {
                    radioa1.setTextColor(Color.BLUE);
                    radioa1.setEnabled(false);
                    radioa2.setEnabled(false);
                    radioa3.setEnabled(false);
                    finalScore++;


                } else if (checkbutton2) {
                    radioa2.setTextColor(Color.BLUE);
                    radioa2.setEnabled(false);
                    radioa1.setEnabled(false);
                    radioa3.setEnabled(false);


                }
                else if (checkbutton3) {
                    radioa3.setTextColor(Color.BLUE);
                    radioa3.setEnabled(false);
                    radioa1.setEnabled(false);
                    radioa2.setEnabled(false);

                }
            }







        });

        RadioGroup group2 = (RadioGroup) findViewById(R.id.radio_button_b2);
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioquest1 = (RadioButton) findViewById(R.id.radio_quest_1);
            RadioButton radioquest2 = (RadioButton) findViewById(R.id.radio_quest_2);
            RadioButton radioquest3 = (RadioButton) findViewById(R.id.radio_quest_3);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radioquest1.isChecked();
                boolean checkbutton2 = radioquest2.isChecked();
                boolean checkbutton3 = radioquest3.isChecked();


                if (checkbutton1) {
                    radioquest1.setTextColor(Color.BLUE);
                    radioquest1.setEnabled(false);
                    radioquest2.setEnabled(false);
                    radioquest3.setEnabled(false);
                    }


                 else    if (checkbutton2) {
                        radioquest2.setTextColor(Color.BLUE);
                        radioquest2.setEnabled(false);
                        radioquest1.setEnabled(false);
                        radioquest3.setEnabled(false);


                    }
                    else if (checkbutton3) {
                        radioquest3.setTextColor(Color.BLUE);
                        radioquest3.setEnabled(false);
                        radioquest1.setEnabled(false);
                        radioquest2.setEnabled(false);
                    finalScore++;

                    }

            }});

        RadioGroup group3 = (RadioGroup) findViewById(R.id.radio_button_c3);
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radioc1 = (RadioButton) findViewById(R.id.radio_c_1);
            RadioButton radioc2 = (RadioButton) findViewById(R.id.radio_c_2);
            RadioButton radioc3 = (RadioButton) findViewById(R.id.radio_c_3);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radioc1.isChecked();
                boolean checkbutton2 = radioc2.isChecked();
                boolean checkbutton3 = radioc3.isChecked();


                if (checkbutton1) {
                    radioc1.setEnabled(false);
                    radioc1.setTextColor(Color.BLUE);
                    radioc2.setEnabled(false);
                    radioc3.setEnabled(false);

                }

                if (checkbutton2) {
                    radioc2.setTextColor(Color.BLUE);
                    radioc2.setEnabled(false);
                    radioc1.setEnabled(false);
                    radioc3.setEnabled(false);
                    finalScore++;
                }
                if (checkbutton3) {
                    radioc3.setTextColor(Color.BLUE);
                    radioc3.setEnabled(false);
                    radioc1.setEnabled(false);
                    radioc2.setEnabled(false);


                }
            }
        });
        RadioGroup group4 = (RadioGroup) findViewById(R.id.radio_button_d4);
        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiod1 = (RadioButton) findViewById(R.id.radio_d_1);
            RadioButton radiod2 = (RadioButton) findViewById(R.id.radio_d_2);
            RadioButton radiod3 = (RadioButton) findViewById(R.id.radio_d_3);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiod1.isChecked();
                boolean checkbutton2 = radiod2.isChecked();
                boolean checkbutton3 = radiod3.isChecked();


                if (checkbutton1) {
                    radiod1.setEnabled(false);
                    radiod1.setTextColor(Color.BLUE);
                    radiod2.setEnabled(false);
                    radiod3.setEnabled(false);

                }

                if (checkbutton2) {
                    radiod2.setTextColor(Color.BLUE);
                    radiod2.setEnabled(false);
                    radiod1.setEnabled(false);
                    radiod3.setEnabled(false);
                    finalScore++;
                }
                if (checkbutton3) {
                    radiod3.setTextColor(Color.BLUE);
                    radiod3.setEnabled(false);
                    radiod1.setEnabled(false);
                    radiod2.setEnabled(false);

                }
            }
        });
        RadioGroup group5 = (RadioGroup) findViewById(R.id.radio_button_e5);
        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            RadioButton radioE1 = (RadioButton) findViewById(R.id.radio_E_1);
            RadioButton radioE2 = (RadioButton) findViewById(R.id.radio_E_2);
            RadioButton radioE3 = (RadioButton) findViewById(R.id.radio_E_3);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radioE1.isChecked();
                boolean checkbutton2 = radioE2.isChecked();
                boolean checkbutton3 = radioE3.isChecked();


                if (checkbutton1) {
                    radioE1.setEnabled(false);
                    radioE1.setTextColor(Color.BLUE);
                    radioE2.setEnabled(false);
                    radioE3.setEnabled(false);
                    finalScore++;

                }
                if (checkbutton2) {
                    radioE2.setTextColor(Color.BLUE);
                    radioE2.setEnabled(false);
                    radioE1.setEnabled(false);
                    radioE3.setEnabled(false);

                }
                if (checkbutton3) {
                    radioE3.setTextColor(Color.BLUE);
                    radioE3.setEnabled(false);
                    radioE1.setEnabled(false);
                    radioE2.setEnabled(false);



                }
            }
        });
    } public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked

        if (view.getId() == radio_a_1) {
            Toast.makeText(getApplicationContext(), "Chelsea", Toast.LENGTH_LONG).show();

        } else if (view.getId() == radio_a_2) {
            Toast.makeText(getApplicationContext(), "Aresene", Toast.LENGTH_LONG).show();

            if (view.getId() == radio_a_3) {
                Toast.makeText(getApplicationContext(), "Man.City", Toast.LENGTH_LONG).show();
                {


                    // Check which radio button was clicked

                    if (view.getId() == R.id.radio_quest_1) {
                        Toast.makeText(getApplicationContext(), "Cristano Ronaldo", Toast.LENGTH_LONG).show();

                    } else if (view.getId() == R.id.radio_quest_2) {
                        Toast.makeText(getApplicationContext(), " Marcelo", Toast.LENGTH_LONG).show();

                        if (view.getId() == R.id.radio_quest_3) {
                            Toast.makeText(getApplicationContext(), "Sergio Ramos", Toast.LENGTH_LONG).show();
                        }

                    }
                }


                // Check which radio button was clicked

                if (view.getId() == R.id.radio_c_1) {
                    Toast.makeText(getApplicationContext(), "19 Games ", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_c_2) {
                    Toast.makeText(getApplicationContext(), "25 Games", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_c_3) {
                        Toast.makeText(getApplicationContext(), "29 Games", Toast.LENGTH_LONG).show();

                    }


                }
                if (view.getId() == R.id.radio_d_1) {
                    Toast.makeText(getApplicationContext(), "Juventus", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_d_2) {
                    Toast.makeText(getApplicationContext(), "Real Madrid", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_d_3) {
                        Toast.makeText(getApplicationContext(), "Bayern Munich", Toast.LENGTH_LONG).show();


                    }
                    ;


                }
                if (view.getId() == R.id.radio_E_1) {
                    Toast.makeText(getApplicationContext(), "Bidvest Wits", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_E_2) {
                    Toast.makeText(getApplicationContext(), "Kaizer Chiefs", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_E_3) {
                        Toast.makeText(getApplicationContext(), "Mamelod Sundowns", Toast.LENGTH_LONG).show();
                        {
                        }}}}}}}



