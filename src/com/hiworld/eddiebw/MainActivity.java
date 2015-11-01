package com.hiworld.eddiebw;

import android.support.v4.widget.DrawerLayout;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this._navDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		this._listView = (ListView) findViewById(R.id.left_drawer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.salir:
			//Se crea un dialogo de alerta
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
			//título del cuadro de dialogo
			dialogo1.setTitle("Warning");
			//mensaje del cuadro de diálogo
			dialogo1.setMessage("Do you want to leave?");
			dialogo1.setCancelable(false); 
			dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                aceptar();  
	            }  
	        });
			dialogo1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                cancelar();
	            }  
	        });
			dialogo1.show();
			//finish();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}	
	public void cancelar() {
	    //Toast t=Toast.makeText(this,"Bienvenido a probar el programa.", Toast.LENGTH_SHORT);
	    //t.show();
	}

	public void aceptar() {
	    finish();
	}
	private DrawerLayout _navDrawerLayout;
	private ListView _listView;
}
