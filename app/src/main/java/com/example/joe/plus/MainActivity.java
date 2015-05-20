package com.example.joe.plus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView display = (TextView)findViewById(R.id.display);


        final Button cosbutton = (Button) findViewById(R.id.cos);
            cosbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String caltext = cosbutton.getText().toString();
                    display.append(caltext);
                }
            });


        final Button sinbutton = (Button) findViewById(R.id.sin);
        sinbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = sinbutton.getText().toString();
                display.append(caltext);
            }
        });


        final Button tanbutton = (Button) findViewById(R.id.tan);
        tanbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    String caltext = tanbutton.getText().toString();
                    display.append(caltext);
                }
            });

        final Button mulbutton = (Button) findViewById(R.id.multiple);
        mulbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = mulbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button sqrbutton = (Button) findViewById(R.id.square);
        sqrbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = sqrbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button lnbutton = (Button) findViewById(R.id.ln);
        lnbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = lnbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button logbutton = (Button) findViewById(R.id.log);
        logbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = logbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button pibutton = (Button) findViewById(R.id.pi);
        pibutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = pibutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button degbutton = (Button) findViewById(R.id.Deg);
        degbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = degbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button radbutton = (Button) findViewById(R.id.rad);
        radbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = radbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button ebutton = (Button) findViewById(R.id.BigE);
        ebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = ebutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button openbutton = (Button) findViewById(R.id.openpara);
        openbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = openbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button endbutton = (Button) findViewById(R.id.endpara);
        endbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = endbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button coshbutton = (Button) findViewById(R.id.cosh);
        coshbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = coshbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button sinhbutton = (Button) findViewById(R.id.sinh);
        sinhbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = sinhbutton.getText().toString();
                display.append(caltext);
            }
        });

        final Button tanhbutton = (Button) findViewById(R.id.tanh);
        tanhbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String caltext = tanhbutton.getText().toString();
                display.append(caltext);
            }
        });
    }


                    @Override
                    public boolean onCreateOptionsMenu (Menu menu){
                        // Inflate the menu; this adds items to the action bar if it is present.
                        getMenuInflater().inflate(R.menu.menu_main, menu);
                        return true;
                    }

                    @Override
                    public boolean onOptionsItemSelected (MenuItem item){
                        // Handle action bar item clicks here. The action bar will
                        // automatically handle clicks on the Home/Up button, so long
                        // as you specify a parent activity in AndroidManifest.xml.
                        int id = item.getItemId();

                        //noinspection SimplifiableIfStatement
                        if (id == R.id.action_settings) {
                            return true;
                        }

                        return super.onOptionsItemSelected(item);
                    }
                }

