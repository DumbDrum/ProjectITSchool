package com.example.asus.projectitschool;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Bitmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.textView);
                try{
                    final File text = new File("C:\\Users\\asus\\Desktop\\school","TestFile.txt");
                    final InputStream fileStream = new FileInputStream(text);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
                    String line = reader.readLine();
                    while(line != null){
                        txt.setText(line);
                        line = reader.readLine();
                    }
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
