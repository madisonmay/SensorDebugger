package madisonmay.sensordebugger;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button accel;
    private Button magnetic;
    private Button light;
    private Button gravity;
    private Button gyro;
    private Button snapshot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accel = (Button) findViewById(R.id.accelerometer);
        accel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentApp = new Intent(MainActivity.this,
                        AccelerometerActivity.class);

                MainActivity.this.startActivity(intentApp);
            }
        });

        magnetic = (Button) findViewById(R.id.magnetic_field);
        magnetic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentApp = new Intent(MainActivity.this,
                        MagneticFieldActivity.class);

                MainActivity.this.startActivity(intentApp);
            }
        });

        light = (Button) findViewById(R.id.light_data);
        light.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentApp = new Intent(MainActivity.this,
                        LightActivity.class);

                MainActivity.this.startActivity(intentApp);
            }
        });

        gravity = (Button) findViewById(R.id.gravity);
        gravity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentApp = new Intent(MainActivity.this,
                        GravityActivity.class);

                MainActivity.this.startActivity(intentApp);
            }
        });

        gyro = (Button) findViewById(R.id.gyro);
        gyro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentApp = new Intent(MainActivity.this,
                        GyroscopeActivity.class);

                MainActivity.this.startActivity(intentApp);
            }
        });

        snapshot = (Button) findViewById(R.id.snapshot);
        snapshot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentApp = new Intent(MainActivity.this,
                        SensorSnapshotActivity.class);

                MainActivity.this.startActivity(intentApp);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
