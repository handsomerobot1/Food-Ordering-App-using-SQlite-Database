package com.handsomerobot.foododering.Adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.handsomerobot.foododering.Models.MainModel
import com.handsomerobot.foododering.R

class MainAdapter (
    private val list: ArrayList<MainModel>,
    private val context: Context
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.sample_mainfood, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.foodImage.setImageResource(model.image)
        holder.mainName.text = model.name
        holder.price.text = model.price
        holder.description.text = model.descrition
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.imageView2)
        val mainName: TextView = itemView.findViewById(R.id.Name)
        val price: TextView = itemView.findViewById(R.id.Price)
        val description: TextView = itemView.findViewById(R.id.description)
    }
}