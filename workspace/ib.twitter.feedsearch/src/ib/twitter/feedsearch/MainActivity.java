package ib.twitter.feedsearch;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
 
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
 
public class MainActivity extends Activity {
	private String url;
	private EditText urlText;
	 
	/** Called when the activity is first created. */
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
 
		urlText = (EditText) findViewById(R.id.SearchText);		
	}
 
	public void myClickHandler(View view) throws ClientProtocolException, IOException {
		switch (view.getId()) {
		case R.id.OpenBrowser:
			try {
				url = "https://twitter.com/search?q=" + urlText.getText().toString() ;
				Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
				startActivity(i);
				
			}
 
			catch (Exception e) {
				System.out.println("Nay, did not work");				
			}
			break;
		}
	}
}