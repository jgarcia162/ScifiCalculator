package com.example.joe.plus;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView display = (TextView) findViewById(R.id.display);


        final Button mulbutton = (Button) findViewById(R.id.multiple);
        mulbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                display.append(mulbutton.getText().toString());
            }
        });

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button sinbutton = (Button) findViewById(R.id.sin);
            sinbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (sinbutton != null) {
                        display.append(sinbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button tanbutton = (Button) findViewById(R.id.tan);
            tanbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (tanbutton != null) {
                        display.append(tanbutton.getText().toString());
                    }
                }
            });
        }

        final Button divdbutton = (Button) findViewById(R.id.divide);
        divdbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (divdbutton != null) {
                    display.append(divdbutton.getText().toString());
                }
            }
        });

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button sqrbutton = (Button) findViewById(R.id.square);
            sqrbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (sqrbutton != null) {
                        display.append(sqrbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button lnbutton = (Button) findViewById(R.id.ln);
            lnbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (lnbutton != null) {
                        String caltext = lnbutton.getText().toString();
                        display.append(caltext);
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button logbutton = (Button) findViewById(R.id.log);
            logbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (logbutton != null) {
                        display.append(logbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button pibutton = (Button) findViewById(R.id.pi);
            pibutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (pibutton != null) {
                        display.append(pibutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button degbutton = (Button) findViewById(R.id.Deg);
            degbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (degbutton != null) {
                        display.append(degbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button radbutton = (Button) findViewById(R.id.rad);
            radbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (radbutton != null) {
                        display.append(radbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button ebutton = (Button) findViewById(R.id.BigE);
            ebutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (ebutton != null) {
                        display.append(ebutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button openbutton = (Button) findViewById(R.id.openpara);
            openbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (openbutton != null) {
                        display.append(openbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button endbutton = (Button) findViewById(R.id.endpara);
            endbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (endbutton != null) {
                        display.append(endbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button coshbutton = (Button) findViewById(R.id.cosh);
            coshbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (coshbutton != null) {
                        display.append(coshbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button sinhbutton = (Button) findViewById(R.id.sinh);
            sinhbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (sinhbutton != null) {
                        display.append(sinhbutton.getText().toString());
                    }
                }
            });
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            final Button tanhbutton = (Button) findViewById(R.id.tanh);
            tanhbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (tanhbutton != null) {
                        display.append(tanhbutton.getText().toString());
                    }
                }
            });
        }
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

