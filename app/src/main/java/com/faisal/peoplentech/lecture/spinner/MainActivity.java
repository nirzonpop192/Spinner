package com.faisal.peoplentech.lecture.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUpRelationSpinner();

     /*   // view declare & linked with xml
        Spinner spRelation = findViewById(R.id.spRelation);
        //get string from resource and put into String array
        final String[] relation = getResources().getStringArray(R.array.relation);
        // initiate adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, relation);
        // set adapter
        spRelation.setAdapter(arrayAdapter);

        spRelation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {
                    String strRelation = relation[position];

                    Toast.makeText(MainActivity.this, "He/ She is your " + strRelation, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/


        Spinner spinner = (Spinner) findViewById(R.id.spAge);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.age, R.layout.custom_spinner_item);
        adapter.setDropDownViewResource(R.layout.custom_spinner_drop_down);
        spinner.setAdapter(adapter);


        setQuantityAdapter();
    }

    private void setUpRelationSpinner() {
        // view declare & linked with xml
        Spinner spRelation = findViewById(R.id.spRelation);
        //get string from resource and put into String array
        final String[] relation = getResources().getStringArray(R.array.relation);
        // initiate adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, relation);
        // set adapter
        spRelation.setAdapter(arrayAdapter);

        spRelation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {
                    String strRelation = relation[position];

                    Toast.makeText(MainActivity.this, "He/ She is your " + strRelation, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void setQuantityAdapter() {
        final Spinner spQuantity= findViewById(R.id.spQuantity);
        String [] quantityArray = getResources().getStringArray(R.array.quantity_array);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, R.layout.simple_spinner_item, quantityArray);
        adapter.setDropDownViewResource(R.layout.simple_spinner_drop_item);
        spQuantity.setAdapter(adapter);
        spQuantity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String quantity = spQuantity.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
