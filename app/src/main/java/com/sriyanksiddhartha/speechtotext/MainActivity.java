package com.sriyanksiddhartha.speechtotext;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

	private TextView txvResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txvResult = (TextView) findViewById(R.id.txvResult);
		waitForVoiceInstruction();
	}

	public void waitForVoiceInstruction() {
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
		intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);


		if (intent.resolveActivity(getPackageManager()) != null) {

			startActivityForResult(intent, 10);
		} else {
			Toast.makeText(this, "Your Device Don't Support Speech Input", Toast.LENGTH_SHORT).show();
		}
	}

	public void getSpeechInput(View view) {
		waitForVoiceInstruction();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.d("tag","Llamando Activity "+requestCode+" results "+resultCode);
		switch (requestCode) {
			case 10:
				if (resultCode == RESULT_OK && data != null) {
					ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
					txvResult.setText(result.toString());

					waitForVoiceInstruction();
				}
				break;
		}
	}
}
