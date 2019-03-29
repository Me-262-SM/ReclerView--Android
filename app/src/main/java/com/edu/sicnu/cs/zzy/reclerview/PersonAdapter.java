package com.edu.sicnu.cs.zzy.reclerview;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Person> persons = new ArrayList<>();

    public PersonAdapter(Context context, ArrayList<Person> persons) {
        this.context = context;
        this.persons = persons;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.personlayout,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        Person person = persons.get(i);
        viewHolder.textView_name.setText(person.getName());
        viewHolder.textView_age.setText(""+person.getAge());
        viewHolder.textView_gender.setText(person.isGender()?"男":"女");
        viewHolder.imageView.setAdjustViewBounds(true);
        if(person.isGender()){
            viewHolder.imageView.setImageResource(R.drawable.bg_black_small);
        }else{
            viewHolder.imageView.setImageResource(R.drawable.bg_pink_small);
        }


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,""+i,Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                persons.remove(i);
                notifyItemRemoved(i);
                notifyDataSetChanged();
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView_name;
        TextView textView_age;
        TextView textView_gender;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView_name = itemView.findViewById(R.id.textView1);
            textView_age = itemView.findViewById(R.id.textView2);
            textView_gender = itemView.findViewById(R.id.textView3);
        }
    }
}
