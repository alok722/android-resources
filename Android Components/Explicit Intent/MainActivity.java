import android.os.Bundle;  
import android.app.Activity;  
import android.content.Intent;  
import android.view.Menu;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.Button;  
import android.widget.Toast;  
public class ActivityOne extends Activity {  
    /** Called when the activity is first created. */  
      @Override  
      public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        Button button1=(Button)findViewById(R.id.Button01);  
          
        button1.setOnClickListener(new OnClickListener(){  
         public void onClick(View view) {  
          Intent txt = new Intent(getApplicationContext(), ActivityTwo.class);  
          txt.putExtra("Value1", "Android Tutorial Gagandeep Thakur");  
          txt.putExtra("Value2", "Multiple Activity Tutorial");  
          // Set the request code to any code you like, you can identify the  
          // callback via this code  
          startActivity(txt);  
         }  
         });  
      }  
    }   