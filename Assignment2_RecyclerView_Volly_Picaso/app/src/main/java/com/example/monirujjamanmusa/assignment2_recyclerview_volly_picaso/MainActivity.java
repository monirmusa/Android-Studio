package com.example.monirujjamanmusa.assignment2_recyclerview_volly_picaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String url="https://api.myjson.com/bins/19vf42";
    MyAdapter myAdapter;
    List<MyItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=(RecyclerView)findViewById(R.id.recyclerViewId);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems=new ArrayList<>();

        loadData();

        }
       public void loadData(){


        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                   new Response.Listener<String>() {
                       @Override
                       public void onResponse(String response) {
                        try{
                            JSONObject jsonObject=new JSONObject(response);
                            JSONArray array=jsonObject.getJSONArray("MyData");
                            for (int i=0;i<array.length();i++) {
                                JSONObject receive = array.getJSONObject(i);
                                MyItem item = new MyItem(

                                        receive.getString("headerText"),
                                        receive.getString("descreptionText"),
                                        receive.getString("imageLocation")


                                );

                                listItems.add(item);


                            }

                            myAdapter=new MyAdapter(listItems,getApplicationContext());
                         recyclerView.setAdapter(myAdapter);
                        }
                        catch (JSONException e){
                            e.printStackTrace();

                        }
                       }
                   }, new Response.ErrorListener() {
               @Override
               public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,"Server Error...!",Toast.LENGTH_SHORT).show();
               }
           });

           RequestQueue queue = Volley.newRequestQueue(this);
           queue.add(stringRequest);



       }



}
