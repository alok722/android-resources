import android.os.Bundle;  
import android.app.Activity;  
import android.app.AlertDialog;  
import android.content.DialogInterface;  
import android.view.Menu;  
  
public class MainActivity extends Activity {  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
          
        AlertDialog.Builder builder = new AlertDialog.Builder(this);  
          
        //Setting message manually and performing action on button click   
        builder.setMessage("Do you want to close this application ?")  
            .setCancelable(false)  
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {  
                public void onClick(DialogInterface dialog, int id) {  
                finish();  
                }  
            })  
            .setNegativeButton("No", new DialogInterface.OnClickListener() {  
                public void onClick(DialogInterface dialog, int id) {  
                //  Action for 'NO' Button  
                dialog.cancel();  
             }  
            });  
  
        //Creating dialog box  
        AlertDialog alert = builder.create();  
        //Setting the title manually  
        alert.setTitle("AlertDialogExample");  
        alert.show();  
        setContentView(R.layout.activity_main);  
    }  
  
   
  
}  