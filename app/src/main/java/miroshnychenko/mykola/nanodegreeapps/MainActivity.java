package miroshnychenko.mykola.nanodegreeapps;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.spotify_streamer_btn)
    public void showStreamerToast() {
        Toast.makeText(getApplicationContext(), "This will launch spotify streamer app", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.scores_app_btn)
    public void showScoresToast() {
        Toast.makeText(getApplicationContext(), "This will launch scores app", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.library_app_btn)
    public void showLibraryToast() {
        Toast.makeText(getApplicationContext(), "This will launch library app", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.build_it_bigger_btn)
    public void showBiggerToast() {
        Toast.makeText(getApplicationContext(), "This will launch build it bigger app", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.xyz_reader_btn)
    public void showReaderToast() {
        Toast.makeText(getApplicationContext(), "This will launch XYZ reader app", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.capstone_btn)
    public void showCapstoneToast() {
        Toast.makeText(getApplicationContext(), "This will launch the capstone app", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
