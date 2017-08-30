package ca.rmen.recyclerviewbug;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final int count;
    MyAdapter(int count) {
        this.count = count;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        TextView textView = new TextView(viewGroup.getContext());
        return new MyViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        myViewHolder.textView.setText("Item number " + position);
    }

    @Override
    public int getItemCount() {
        return count;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView;
        }
    }
}
