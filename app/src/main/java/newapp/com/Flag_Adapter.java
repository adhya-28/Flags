package newapp.com;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Flag_Adapter extends RecyclerView.Adapter<Flag_Adapter.FlagViewHolder> {
    private Context mCtx;
    private List<Flag> flagList;

    public Flag_Adapter(Context mCtx, List<Flag> flagList) {
        this.mCtx = mCtx;
        this.flagList = flagList;
    }

    @Override
    public FlagViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_flag, null);
        return new FlagViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FlagViewHolder holder, int position) {
        Flag flag = flagList.get(position);
        holder.textViewTitle.setText(flag.getTitle());


        Glide.with(mCtx).load(flag.getImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return flagList.size();
    }


    class FlagViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;
        CardView cardView;

        public FlagViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);

            imageView = itemView.findViewById(R.id.imageview);
            cardView = itemView.findViewById(R.id.cardview1);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(mCtx,Details.class);
                  mCtx.startActivity(i);
                }
            });
        }

    }
}


