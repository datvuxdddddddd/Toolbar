package com.example.toolbar;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter3 extends RecyclerView.Adapter<ListAdapter3.ViewHolder> {
    private Context context;
    private List<Model> elements;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textInfo;
        ImageView imgThumbnail;

        public ViewHolder(View view) {
            super(view);

            textName = view.findViewById(R.id.txt_media_title);
            textInfo = view.findViewById(R.id.txt_media_info);
            imgThumbnail = view.findViewById(R.id.img_media_thumbnail);

        }
    }




    public ListAdapter3(Context c, List<Model> list) {
        this.context = c;
        this.elements = list;
    }

    @Override
    public int getItemCount() {
        return this.elements.size();
    }

    @NonNull
    @Override
    public ListAdapter3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.list_fragment3, parent, false);
        return new ListAdapter3.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter3.ViewHolder holder, int position) {
        holder.textName.setText(elements.get(position).getMediaTitle());
        holder.textInfo.setText(elements.get(position).getMediaInfo());
        Picasso.get()
                .load(elements.get(position).getMediaThumbnail())
                .into(holder.imgThumbnail);

        holder.itemView.setClickable(true);

        holder.itemView.setOnFocusChangeListener((View v, boolean hasFocus) -> {
            if (hasFocus){
                switch(holder.getAdapterPosition()) {
                    case 0:
                        v.setBackgroundColor(Color.CYAN);
                        break;
                    case 1:
                        v.setBackgroundColor(Color.BLACK);
                        break;
                    case 2:
                        v.setBackgroundColor(Color.BLUE);
                        break;
                    case 3:
                        v.setBackgroundColor(Color.WHITE);
                        break;
                    case 4:
                        v.setBackgroundColor(Color.DKGRAY);
                        break;
                    default:
                        break;
                }
            }
            else {
                v.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        holder.itemView.setOnClickListener((View v) -> {
            if(holder.getAdapterPosition() == 3) {
                VideoPath.videopath = "https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1.mp4";
                ((MainActivity) context).selectFragment(0);
            }
            else {
                Toast.makeText(context, "You clicked a fake movie at " + (holder.getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }


}


