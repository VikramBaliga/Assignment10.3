package projects.android.my.customlistfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get fragment manager
        FragmentManager fm = getSupportFragmentManager();
        //create object of fragment
        MyFragment myFragment = new MyFragment();
        // Load fragment
        fm.beginTransaction().add(R.id.fragmentHolder, myFragment).commit();
    }
}
