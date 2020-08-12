package my.com.anak2u.myrecylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    public List<String> items  = new ArrayList<>();

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.titleTextView.setText(items.get(position));
    }


    // How many rows are there
    @Override
    public int getItemCount() {
        return items.size();
    }

    // The representation of a row
    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;

        public CustomViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.custom_row, parent, false));
            titleTextView = itemView.findViewById(R.id.titleTextView);
            // Tomorrow you might have 4 findViewById

        }
    }
}
