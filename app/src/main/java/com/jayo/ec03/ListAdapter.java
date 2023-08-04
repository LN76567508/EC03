package com.jayo.ec03;

//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.jayo.ec03.model.Platos;
//
//import java.util.List;
//
//public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
//    private List<Platos> mData;
//    private LayoutInflater mInflater;
//    private Context context;
//
//    public ListAdapter(List<Platos> itemList, Context context){
//        this.mInflater =  LayoutInflater.from(context);
//        this.context = context;
//        this.mData itemList;
//    }
//    @Override public int getItemCount() {
//        return mData.size();
//    }
//    @Override ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
//        View view  = mInflater.inflate(R.layout.fragment_home,null);
//        return  new ListAdapter.ViewHolder(view);
//    }
//    @Override
//    public void onBindViewHolder(final ListAdapter.ViewHolder holder,final int position){
//        holder.bindData(mData.get(position));
//    }
//    public void setItems(List<Platos> items){
//        mData = items;
//    }
//    public class ViewHolder extends RecyclerView.ViewHolder{
//        ImageView imgUr;
//        TextView name, receta;
//
//        ViewHolder(View itemView){
//            super(itemView);
//            imgUr = itemView.find
//        }
//    }
//}
