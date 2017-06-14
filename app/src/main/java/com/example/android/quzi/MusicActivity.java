package com.example.android.quzi;

import android.app.Activity;
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

import static android.R.attr.checkedButton;
import static android.R.attr.id;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.os.Build.VERSION_CODES.M;

public class MusicActivity extends AppCompatActivity {
    int finalScore = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


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
                alertDialogBuilder.setTitle("Music Final Score ");

                // set dialog message
                int res = (int) ((finalScore * 100.f) / 5);
                alertDialogBuilder
                        .setMessage("Your got: " + res + "% of the question correct!")
                        .setCancelable(false)
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if this button is clicked, close
                                // current activity
                                MusicActivity.this.finish();
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
                RadioButton radiobutton1 = (RadioButton) findViewById(R.id.radio_button_1);
                RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_button_2);
                RadioButton radioButton3 = (RadioButton) findViewById(R.id.radio_button_3);


                boolean checkbutton1 = radiobutton1.isChecked();
                boolean checkbutton2 = radioButton2.isChecked();
                boolean checkbutton3 = radioButton3.isChecked();


                if (checkbutton1) {
                    radiobutton1.setTextColor(Color.BLUE);
                    radiobutton1.setEnabled(false);
                    radioButton2.setEnabled(false);
                    radioButton3.setEnabled(false);
                    finalScore++;
                } else if (checkbutton2) {
                    radioButton2.setTextColor(Color.BLUE);
                    radioButton2.setEnabled(false);
                    radiobutton1.setEnabled(false);
                    radioButton3.setEnabled(false);


                } else if (checkbutton3) {
                    radioButton3.setTextColor(Color.BLUE);
                    radioButton3.setEnabled(false);
                    radiobutton1.setEnabled(false);
                    radioButton2.setEnabled(false);

                }
            }


        });

        RadioGroup group2 = (RadioGroup) findViewById(R.id.radio_button_b2);
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiooption1 = (RadioButton) findViewById(R.id.radio_option_1);
            RadioButton radiooption2 = (RadioButton) findViewById(R.id.radio_option_2);
            RadioButton radiooption3 = (RadioButton) findViewById(R.id.radio_option_3);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiooption1.isChecked();
                boolean checkbutton2 = radiooption2.isChecked();
                boolean checkbutton3 = radiooption3.isChecked();


                if (checkbutton1) {
                    radiooption1.setTextColor(Color.BLUE);
                    radiooption1.setEnabled(false);
                    radiooption2.setEnabled(false);
                    radiooption3.setEnabled(false);

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
                    finalScore++;
                }
            }
        });
        RadioGroup group3 = (RadioGroup) findViewById(R.id.radio_button_c3);
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiobutton1E = (RadioButton) findViewById(R.id.radio_option_1E);
            RadioButton radiobutton2E = (RadioButton) findViewById(R.id.radio_option_2E);
            RadioButton radiobutton3E = (RadioButton) findViewById(R.id.radio_option_3E);


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiobutton1E.isChecked();
                boolean checkbutton2 = radiobutton2E.isChecked();
                boolean checkbutton3 = radiobutton3E.isChecked();


                if (checkbutton1) {
                    radiobutton1E.setTextColor(Color.BLUE);
                    radiobutton1E.setEnabled(false);
                    radiobutton2E.setEnabled(false);
                    radiobutton3E.setEnabled(false);
                    finalScore++;
                } else if (checkbutton2) {
                    radiobutton2E.setTextColor(Color.BLUE);
                    radiobutton2E.setEnabled(false);
                    radiobutton1E.setEnabled(false);
                    radiobutton3E.setEnabled(false);

                } else if (checkbutton3) {
                    radiobutton3E.setTextColor(Color.BLUE);
                    radiobutton3E.setEnabled(false);
                    radiobutton2E.setEnabled(false);
                    radiobutton1E.setEnabled(false);


                }
            }
        });
        RadioGroup group4 = (RadioGroup) findViewById(R.id.radio_button_d4);
        group4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiooption1 = (RadioButton) findViewById(R.id.radio_option_1b);
            RadioButton radiooption2 = (RadioButton) findViewById(R.id.radio_option_2b);
            RadioButton radiooption3 = (RadioButton) findViewById(R.id.radio_option_3c);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiooption1.isChecked();
                boolean checkbutton2 = radiooption2.isChecked();
                boolean checkbutton3 = radiooption3.isChecked();


                if (checkbutton1) {
                    radiooption1.setTextColor(Color.BLUE);
                    radiooption1.setEnabled(false);
                    radiooption2.setEnabled(false);
                    radiooption3.setEnabled(false);

                } else if (checkbutton2) {
                    radiooption2.setTextColor(Color.BLUE);
                    radiooption2.setEnabled(false);
                    radiooption1.setEnabled(false);
                    radiooption3.setEnabled(false);
                    finalScore++;
                } else if (checkbutton3) {
                    radiooption3.setTextColor(Color.BLUE);
                    radiooption3.setEnabled(false);
                    radiooption1.setEnabled(false);
                    radiooption2.setEnabled(false);

                }
            }
        });
        RadioGroup group5 = (RadioGroup) findViewById(R.id.radio_button_e5);
        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            RadioButton radiooption1c = (RadioButton) findViewById(R.id.radio_option_1c);
            RadioButton radiooption2c = (RadioButton) findViewById(R.id.radio_option_2c);
            RadioButton radiooption3c = (RadioButton) findViewById(R.id.radio_option_3c);

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                boolean checkbutton1 = radiooption1c.isChecked();
                boolean checkbutton2 = radiooption2c.isChecked();
                boolean checkbutton3 = radiooption3c.isChecked();


                if (checkbutton1) {
                    radiooption1c.setTextColor(Color.BLUE);
                    radiooption1c.setEnabled(false);
                    radiooption2c.setEnabled(false);
                    radiooption3c.setEnabled(false);
                    finalScore++;

                } else if (checkbutton2) {
                    radiooption2c.setTextColor(Color.BLUE);
                    radiooption2c.setEnabled(false);
                    radiooption1c.setEnabled(false);
                    radiooption3c.setEnabled(false);

                } else if (checkbutton3) {
                    radiooption3c.setTextColor(Color.BLUE);
                    radiooption3c.setEnabled(false);
                    radiooption1c.setEnabled(false);
                    radiooption2c.setEnabled(false);



                }
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked

        if (view.getId() == R.id.radio_option_1) {
            Toast.makeText(getApplicationContext(), "1,723", Toast.LENGTH_LONG).show();

        } else if (view.getId() == R.id.radio_option_2) {
            Toast.makeText(getApplicationContext(), "500", Toast.LENGTH_LONG).show();

            if (view.getId() == R.id.radio_option_3) {
                Toast.makeText(getApplicationContext(), "750", Toast.LENGTH_LONG).show();
                {


                    // Check which radio button was clicked

                    if (view.getId() == R.id.radio_button_1) {
                        Toast.makeText(getApplicationContext(), "\"Nick Minaj", Toast.LENGTH_LONG).show();

                    } else if (view.getId() == R.id.radio_button_2) {
                        Toast.makeText(getApplicationContext(), "Drake", Toast.LENGTH_LONG).show();

                        if (view.getId() == R.id.radio_button_3) {
                            Toast.makeText(getApplicationContext(), "Future", Toast.LENGTH_LONG).show();
                        }

                    }
                }


                // Check which radio button was clicked

                if (view.getId() == R.id.radio_option_1E) {
                    Toast.makeText(getApplicationContext(), "20", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_option_2E) {
                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_option_3E) {
                        Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_LONG).show();

                    }


                }
                if (view.getId() == R.id.radio_option_1b) {
                    Toast.makeText(getApplicationContext(), "Kendrick Lamar", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_option_2b) {
                    Toast.makeText(getApplicationContext(), "Drake", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_option_3c) {
                        Toast.makeText(getApplicationContext(), "Future", Toast.LENGTH_LONG).show();


                    }
                    ;


                }
                if (view.getId() == R.id.radio_option_1d) {
                    Toast.makeText(getApplicationContext(), "Beyonce", Toast.LENGTH_LONG).show();

                } else if (view.getId() == R.id.radio_option_2e) {
                    Toast.makeText(getApplicationContext(), "Nicki Minaj", Toast.LENGTH_LONG).show();

                    if (view.getId() == R.id.radio_option_3f) {
                        Toast.makeText(getApplicationContext(), "Rihanna", Toast.LENGTH_LONG).show();
                        {
                        }
                    }
                }
            }
        }
    }
}



