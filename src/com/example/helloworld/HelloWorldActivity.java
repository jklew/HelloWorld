package com.example.helloworld;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        initDisplayButton();
        initClearButton();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_hello_world, container, false);
            return rootView;
        }
    }
    private void initDisplayButton(){
    	Button displayButton = (Button) findViewById(R.id.buttonDisplay);
    	displayButton.setOnClickListener(new OnClickListener () {
    		
    		@Override
    		public void onClick (View arg0){
    			EditText editFirstName = (EditText) findViewById(R.id.editTextFirstName);
    			EditText editLastName = (EditText) findViewById(R.id.editTextLastName);
    			TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
    			String firstNameToDisplay = editFirstName.getText().toString();
    			String lastNameToDisplay = editLastName.getText().toString();
    			textDisplay.setText("Hello" + firstNameToDisplay + lastNameToDisplay);
    		}

			
    	});
    	
    }
    
    private void initClearButton(){
    	Button clearButton = (Button) findViewById(R.id.buttonClear);
    	clearButton.setOnClickListener(new OnClickListener () {
    		
    		@Override
    		public void onClick (View arg0){
    			EditText editFirstName = (EditText) findViewById(R.id.editTextFirstName);
    			EditText editLastName = (EditText) findViewById(R.id.editTextLastName);
    			TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);

    			textDisplay.setText("Hello World");
    		}

			
    	});
    	
    }
}
