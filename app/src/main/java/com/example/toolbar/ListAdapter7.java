package com.example.toolbar;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter7 extends RecyclerView.Adapter<ListAdapter7.ViewHolder> {
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

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.list_fragment7, parent, false);
        return new ViewHolder(view);
    }

    public ListAdapter7(Context c, List<Model> list) {
        this.context = c;
        this.elements = list;
    }

    @Override
    public int getItemCount() {
        return this.elements.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
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
                        //v.getBackground().setAlpha(50);
                        break;
                    case 1:
                        v.setBackgroundColor(Color.RED);
                        break;
                    case 2:
                        v.setBackgroundColor(Color.GREEN);
                        break;
                    case 3:
                        v.setBackgroundColor(Color.WHITE);
                        break;
                    case 4:
                        v.setBackgroundColor(Color.YELLOW);
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
            if(holder.getAdapterPosition() == 4) {
                VideoPath.videopath = "https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1.mp4";
                ((MainActivity) context).selectFragment(0);
            }
            else {
                Toast.makeText(context, "You clicked a fake movie at " + (holder.getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}


