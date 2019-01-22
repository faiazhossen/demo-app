package mobileapp.faiaz.home.com.startup.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobileapp.faiaz.home.com.startup.DataItem;
import mobileapp.faiaz.home.com.startup.R;
import mobileapp.faiaz.home.com.startup.SecondActivity;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private Context mContext;
    private List<DataItem> mDataItems;

    public ItemAdapter(Context context, List<DataItem> data) {
        this.mContext = context;
        this.mDataItems = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext)
                .inflate(R.layout.single_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_person.setText(mDataItems.get(position).getName());
        holder.txt_address.setText(mDataItems.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return mDataItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txt_person)
        TextView txt_person;

        @BindView(R.id.txt_address)
        TextView txt_address;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
