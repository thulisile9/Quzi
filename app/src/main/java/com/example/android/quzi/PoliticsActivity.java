package com.example.android.quzi;


import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.quzi.R.id.checkbox;
import static com.example.android.quzi.R.id.radio_option_1;


public class PoliticsActivity extends AppCompatActivity {
    double finalScore = 0.0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);





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
                alertDialogBuilder.setTitle("Politics Final Score ");

                // set dialog message

                int res = (int) ((finalScore * 100.f) / 5);
                alertDialogBuilder
                        .setMessage("Your got: " + res + "% of the question correct!")
                        .setCancelable(false)
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if this button is clicked, close
                                // current activity
                                PoliticsActivity.this.finish();
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



        RadioGroup group1 = (RadioGroup) findViewById(R.id.radio_question_1);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radiooption1 = (RadioButton) findViewById(radio_option_1);
                RadioButton radiooption2 = (RadioButton) findViewById(R.id.radio_option_2);
                RadioButton radiooption3 = (RadioButton) findViewById(R.id.radio_option_3);


                boolean checkbutton1 = radiooption1.isChecked();
                boolean checkbutton2 = radiooption2.isChecked();
                boolean checkbutton3 = radiooption3.isChecked();


                if (checkbutton1) {
                    radiooption1.setTextColor(Color.BLUE);
                    radiooption1.setEnabled(false);
                    radiooption2.setEnabled(false);
                    radiooption3.setEnabled(false);
                    finalScore++;
                } else if (checkbutton2) {
                    radiooption2.setTextColor(Color.BLUE);
                    radiooption2.setEnabled(false);
                    radiooption1.setEnabled(false);
                    radiooption3.setEnabled(false);


                } else if (checkbutton3) {
                    radiooption3.setTextColor(Color.BLUE);
                    radiooption3.setEnabled(false);
                    radiooption1.setEnabled(false);
                    radiooption2.setEnabled(false);

                }
            }


        });

        RadioGroup group2 = (RadioGroup) findViewById(R.id.radio_question_2);
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiobutton1 = (RadioButton) findViewById(R.id.radio_button_1);
            RadioButton radiobutton2 = (RadioButton) findViewById(R.id.radio_button_2);
            RadioButton radiobutton3 = (RadioButton) findViewById(R.id.radio_button_3);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiobutton1.isChecked();
                boolean checkbutton2 = radiobutton2.isChecked();
                boolean checkbutton3 = radiobutton3.isChecked();


                if (checkbutton1) {
                    radiobutton1.setTextColor(Color.BLUE);
                    radiobutton1.setEnabled(false);
                    radiobutton2.setEnabled(false);
                    radiobutton3.setEnabled(false);
                }


                else     if (checkbutton2) {
                        radiobutton2.setTextColor(Color.BLUE);
                        radiobutton2.setEnabled(false);
                        radiobutton1.setEnabled(false);
                        radiobutton3.setEnabled(false);
                        finalScore++;
                    }
               else      if (checkbutton3) {
                        radiobutton3.setTextColor(Color.BLUE);
                        radiobutton3.setEnabled(false);
                        radiobutton1.setEnabled(false);
                        radiobutton2.setEnabled(false);

                    }

            }
        });

        RadioGroup group3 = (RadioGroup) findViewById(R.id.radio_question_3);
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiobutton1option = (RadioButton) findViewById(R.id.radio_button_1_option);
            RadioButton radiobutton2option = (RadioButton) findViewById(R.id.radio_button_2_option);
            RadioButton radiobutton3option = (RadioButton) findViewById(R.id.radio_button_3_option);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiobutton1option.isChecked();
                boolean checkbutton2 = radiobutton2option.isChecked();
                boolean checkbutton3 = radiobutton3option.isChecked();


                if (checkbutton1) {
                    radiobutton1option.setTextColor(Color.BLUE);
                    radiobutton1option.setEnabled(false);
                    radiobutton2option.setEnabled(false);
                    radiobutton3option.setEnabled(false);

                }

             else    if (checkbutton2) {
                    radiobutton2option.setTextColor(Color.BLUE);
                    radiobutton2option.setEnabled(false);
                    radiobutton1option.setEnabled(false);
                    radiobutton3option.setEnabled(false);
                    finalScore++;
                }
             else    if (checkbutton3) {
                    radiobutton3option.setTextColor(Color.BLUE);
                    radiobutton3option.setEnabled(false);
                    radiobutton1option.setEnabled(false);
                    radiobutton2option.setEnabled(false);


                }
            }
        });

        RadioGroup group4 = (RadioGroup) findViewById(R.id.radio_question_4);
        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiooption1button = (RadioButton) findViewById(R.id.radio_option_1_button);
            RadioButton radiooption2button = (RadioButton) findViewById(R.id.radio_option_2_button);
            RadioButton radiooption3button = (RadioButton) findViewById(R.id.radio_option_3_button);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiooption1button.isChecked();
                boolean checkbutton2 = radiooption2button.isChecked();
                boolean checkbutton3 = radiooption3button.isChecked();


                if (checkbutton1) {
                    radiooption1button.setTextColor(Color.BLUE);
                    radiooption1button.setEnabled(false);
                    radiooption2button.setEnabled(false);
                    radiooption3button.setEnabled(false);
                    finalScore++;
                }

            else     if (checkbutton2) {
                    radiooption2button.setTextColor(Color.BLUE);
                    radiooption2button.setEnabled(false);
                    radiooption1button.setEnabled(false);
                    radiooption3button.setEnabled(false);

                }
            else     if (checkbutton3) {
                    radiooption3button.setTextColor(Color.BLUE);
                    radiooption3button.setEnabled(false);
                    radiooption1button.setEnabled(false);
                    radiooption2button.setEnabled(false);


                }
            }
        });


        RadioGroup group5 = (RadioGroup) findViewById(R.id.radio_question_5);
        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiooption1d = (RadioButton) findViewById(R.id.radio_option_1d);
            RadioButton radiooption2e = (RadioButton) findViewById(R.id.radio_option_2e);
            RadioButton radiooption3f = (RadioButton) findViewById(R.id.radio_option_3f);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiooption1d.isChecked();
                boolean checkbutton2 = radiooption2e.isChecked();
                boolean checkbutton3 = radiooption3f.isChecked();


                if (checkbutton1) {
                    radiooption1d.setEnabled(false);
                    radiooption1d.setTextColor(Color.BLUE);
                    radiooption2e.setEnabled(false);
                    radiooption3f.setEnabled(false);


                }
             else    if (checkbutton2) {
                    radiooption2e.setTextColor(Color.BLUE);
                    radiooption2e.setEnabled(false);
                    radiooption1d.setEnabled(false);
                    radiooption3f.setEnabled(false);
                    finalScore++;
                }
             else    if (checkbutton3) {
                    radiooption3f.setTextColor(Color.BLUE);
                    radiooption3f.setEnabled(false);
                    radiooption1d.setEnabled(false);
                    radiooption2e.setEnabled(false);



                }
            }

            public void onRadioButtonClicked(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();

                // Check which radio button was clicked

                if (view.getId() == R.id.radio_option_1) {
                    Toast.makeText(getApplicationContext(), "Gold", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_option_2) {
                    Toast.makeText(getApplicationContext(), "Coal", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_option_3) {
                        Toast.makeText(getApplicationContext(), "Diamonds", Toast.LENGTH_LONG).show();
                        {


                            // Check which radio button was clicked

                            if (view.getId() == R.id.radio_button_1) {
                                Toast.makeText(getApplicationContext(), "Mohamed Mature", Toast.LENGTH_LONG).show();

                            } else if (view.getId() == R.id.radio_button_2) {
                                Toast.makeText(getApplicationContext(), "Nelson Mandela ", Toast.LENGTH_LONG).show();

                                if (view.getId() == R.id.radio_button_3) {
                                    Toast.makeText(getApplicationContext(), "Ronlad Reagan", Toast.LENGTH_LONG).show();
                                }

                            }
                        }


                        // Check which radio button was clicked

                        if (view.getId() == R.id.radio_button_1_option) {
                            Toast.makeText(getApplicationContext(), "Between 150 and 199 ", Toast.LENGTH_LONG).show();

                        } else if (view.getId() == R.id.radio_button_2_option) {
                            Toast.makeText(getApplicationContext(), "Between 50 and 99 ", Toast.LENGTH_LONG).show();

                            if (view.getId() == R.id.radio_button_3_option) {
                                Toast.makeText(getApplicationContext(), "Between 200 and 250", Toast.LENGTH_LONG).show();

                            }


                        }
                        if (view.getId() == R.id.radio_option_1_button) {
                            Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_LONG).show();

                        } else if (view.getId() == R.id.radio_option_2_button) {
                            Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_LONG).show();

                            if (view.getId() == R.id.radio_option_3_button) {
                                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_LONG).show();


                            }
                            ;


                        }
                        if (view.getId() == R.id.radio_option_1d) {
                            Toast.makeText(getApplicationContext(), "Olympics", Toast.LENGTH_LONG).show();


                        } else if (view.getId() == R.id.radio_option_2e) {
                            Toast.makeText(getApplicationContext(), "World Cup", Toast.LENGTH_LONG).show();

                            if (view.getId() == R.id.radio_option_3f) {
                                Toast.makeText(getApplicationContext(), "World Series", Toast.LENGTH_LONG).show();
                                {

                                }}}}}}});}}


