import android.os.Bundle;  
import android.app.Activity;  
import android.view.Menu;  
import android.view.View;  
import android.widget.Toast;  
  
public class MainActivity extends Activity {  
     @Override  
        public void onCreate(Bundle savedInstanceState) {  
            super.onCreate(savedInstanceState);  
            setContentView(R.layout.activity_main);  
              
        //DisplayToast with Hello Gagandeep message  
            Toast.makeText(getApplicationContext(),"Hello Gagandeep",Toast.LENGTH_SHORT).show();  
			
			
        }  
  
       
}  