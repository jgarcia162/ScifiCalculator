package com.example.joe.plus;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

import ext.Expression;


public class MainActivity extends Activity implements View.OnClickListener {
    String expression;
    String ANS;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isLandscape = getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;

        display = (TextView) findViewById(R.id.display);

        if (  (savedInstanceState != null)) {
            //Restore value of members from saved state
            display.setText(savedInstanceState.getString("display"));
        }
        else {

            expression = "";
            ANS= "";
        }

        findViewById(R.id.zero).setOnClickListener(this);
        findViewById(R.id.number1).setOnClickListener(this);
        findViewById(R.id.number2).setOnClickListener(this);
        findViewById(R.id.number3).setOnClickListener(this);
        findViewById(R.id.number4).setOnClickListener(this);
        findViewById(R.id.number5).setOnClickListener(this);
        findViewById(R.id.number6).setOnClickListener(this);
        findViewById(R.id.number7).setOnClickListener(this);
        findViewById(R.id.number8).setOnClickListener(this);
        findViewById(R.id.number9).setOnClickListener(this);


        final Button decimalbutton = (Button) findViewById(R.id.decimal);
        decimalbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().toString().equals("")){
                    display.append("0" + decimalbutton.getText().toString());
                }else if(display.getText().toString().charAt(display.length()-1) != '.' && !Character.isDigit(display.getText().toString().charAt(display.length()-1))){
                    display.append("0" + decimalbutton.getText().toString());
                }else if(display.getText().charAt(display.length()-1) != '.'){
                    display.append(decimalbutton.getText().toString());
                }
            }
        });

        final Button plusbutton = (Button) findViewById(R.id.plus);
        plusbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().toString().equals("") || display.getText().toString().charAt(display.length()-1) != '+'){
                    display.append(plusbutton.getText().toString());
                }
            }
        });

        final Button minusbutton = (Button) findViewById(R.id.minus);
        minusbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().toString().equals("") || display.getText().toString().charAt(display.length()-1) != '-'){
                    display.append(minusbutton.getText().toString());
                }
            }
        });

        final Button divdbutton = (Button) findViewById(R.id.divide);
        divdbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().toString().equals("") || display.getText().toString().charAt(display.length()-1) != '/'){
                    display.append(divdbutton.getText().toString());
                }
            }
        });

        final Button mulbutton = (Button) findViewById(R.id.multiple);
        mulbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().toString().equals("") || display.getText().toString().charAt(display.length()-1) != '*'){
                    display.append(mulbutton.getText().toString());
                }
            }
        });

        final Button percentbutton = (Button) findViewById(R.id.percent);
        percentbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().charAt(display.length()-1) != '%'){
                    display.append(percentbutton.getText().toString());
                }
            }
        });

        final Button equalbutton = (Button) findViewById(R.id.equal);
        equalbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String exp = display.getText().toString();
                try {

                    Expression expression = new Expression(exp);

                    BigDecimal answer = expression.eval();

                    String result = answer.toPlainString();

                    display.setText(result);

                } catch (Exception e) {
                    display.setText("syntax error");
                }
            }
        });

        final Button negbutton = (Button) findViewById(R.id.negative);
        negbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(display.getText().toString().equals("") || display.getText().toString().charAt(0) != '-'){
                    display.setText("-" + display.getText().toString());
                }else if ( display.getText().toString().charAt(0) == '-'){
                    display.setText("" + display.getText().toString());
                }
            }
        });

        final Button clearbutton = (Button) findViewById(R.id.clear);
        clearbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                display.setText("");
            }
        });

        final Button deletebutton = (Button) findViewById(R.id.delete);
        deletebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str= display.getText().toString();
                if (str.length() > 1 ) {
                    str = str.substring(0, str.length() - 1);
                    display.setText(str);
                }
                else if (str.length() <=1 ) {
                    display.setText("");
                }
        }
        });

        if (isLandscape) {
            final Button sinbutton = (Button) findViewById(R.id.sin);
            sinbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (sinbutton != null) {
                        display.append(sinbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button cosbutton = (Button) findViewById(R.id.cos);
            cosbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (cosbutton != null) {
                        display.append(cosbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button tanbutton = (Button) findViewById(R.id.tan);
            tanbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (tanbutton != null) {
                        display.append(tanbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button sqrbutton = (Button) findViewById(R.id.square);
            sqrbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (sqrbutton != null) {
                        display.append(sqrbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
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

        if (isLandscape) {
            final Button logbutton = (Button) findViewById(R.id.log);
            logbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (logbutton != null) {
                        display.append(logbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button pibutton = (Button) findViewById(R.id.pi);
            pibutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (pibutton != null) {
                        display.append(pibutton.getText().toString());
                    }
                }
            });
        }

        if (isLandscape) {
            final Button degbutton = (Button) findViewById(R.id.Deg);
            degbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (degbutton != null) {
                        display.append(degbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button ebutton = (Button) findViewById(R.id.e);
            ebutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (ebutton != null) {
                        display.append(ebutton.getText().toString());
                    }
                }
            });
        }

        if (isLandscape) {
            final Button ebutton = (Button) findViewById(R.id.BigE);
            ebutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (ebutton != null) {
                        display.append(ebutton.getText().toString());
                    }
                }
            });
        }

        if (isLandscape) {
            final Button openbutton = (Button) findViewById(R.id.openpara);
            openbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (openbutton != null) {
                        display.append(openbutton.getText().toString());
                    }
                }
            });
        }

        if (isLandscape) {
            final Button endbutton = (Button) findViewById(R.id.endpara);
            endbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (endbutton != null) {
                        display.append(endbutton.getText().toString());
                    }
                }
            });
        }

        if (isLandscape) {
            final Button coshbutton = (Button) findViewById(R.id.cosh);
            coshbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (coshbutton != null) {
                        display.append(coshbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button sinhbutton = (Button) findViewById(R.id.sinh);
            sinhbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (sinhbutton != null) {
                        display.append(sinhbutton.getText().toString() + "(");
                    }
                }
            });
        }

        if (isLandscape) {
            final Button tanhbutton = (Button) findViewById(R.id.tanh);
            tanhbutton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (tanhbutton != null) {
                        display.append(tanhbutton.getText().toString() + "(");
                    }
                }
            });
        }
    }
    //        outState.putString(, display.getText().toString());

    @Override
    protected void onSaveInstanceState (Bundle outState){
        outState.putString("display", display.getText().toString());


        super.onSaveInstanceState(outState);


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

    @Override
    public void onClick(View view) {
        final TextView display = (TextView) findViewById(R.id.display);

        String buttonPressed = ((Button) view).getText().toString();
        if(display.getText().toString().equals("0")){
            display.setText("" + buttonPressed);

        }display.append(buttonPressed);
    }



    //TODO
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//
//        EditText display = (EditText) findViewById(R.id.display);
//
//        //super.onSaveInstanceState(outState);
//
//    }
    //TODO
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
//            Toast.makeText(this,"landscape", Toast.LENGTH_LONG).show();
//        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
//            Toast.makeText(this,"portrait",Toast.LENGTH_LONG).show();
//        }
//    }
}