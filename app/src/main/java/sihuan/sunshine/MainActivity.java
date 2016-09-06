package sihuan.sunshine;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container,new PlaceholderFragment());
        }
    }

    private static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment(){

         }
        public View onCreatView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main,container,false);
            return rootView;
        }
    }
}
