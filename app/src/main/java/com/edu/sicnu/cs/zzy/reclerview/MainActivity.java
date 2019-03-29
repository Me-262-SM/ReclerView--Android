package com.edu.sicnu.cs.zzy.reclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.准备数据
        //2.派生一个适配器类
        //3.绑定界面和Adapter对象

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("zzy",22,true));
        persons.add(new Person("zsh",21,true));
        persons.add(new Person("xs",21,true));
        persons.add(new Person("yzw",21,true));
        persons.add(new Person("caomeili",21,false));
        persons.add(new Person("zzy",22,true));
        persons.add(new Person("zsh",21,true));
        persons.add(new Person("xs",21,true));
        persons.add(new Person("yzw",21,true));
        persons.add(new Person("caomeili",21,false));
        persons.add(new Person("zzy",22,true));
        persons.add(new Person("zsh",21,true));
        persons.add(new Person("xs",21,true));
        persons.add(new Person("yzw",21,true));
        persons.add(new Person("caomeili",21,false));
        persons.add(new Person("zzy",22,true));
        persons.add(new Person("zsh",21,true));
        persons.add(new Person("xs",21,true));
        persons.add(new Person("yzw",21,true));
        persons.add(new Person("caomeili",21,false));
        persons.add(new Person("zzy",22,true));
        persons.add(new Person("zsh",21,true));
        persons.add(new Person("xs",21,true));
        persons.add(new Person("yzw",21,true));
        persons.add(new Person("caomeili",21,false));
        persons.add(new Person("zzy",22,true));
        persons.add(new Person("zsh",21,true));
        persons.add(new Person("xs",21,true));
        persons.add(new Person("yzw",21,true));
        persons.add(new Person("caomeili",21,false));

        PersonAdapter personAdapter = new PersonAdapter(this,persons);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(linearLayoutManager);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(personAdapter);






    }
}
