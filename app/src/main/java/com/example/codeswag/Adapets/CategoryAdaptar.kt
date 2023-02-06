package com.example.codeswag.Adapets

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.codeswag.Model.Category
import com.example.codeswag.R
import java.util.zip.Inflater

class CategoryAdaptar(context: Context,categories:List<Category>): BaseAdapter() {
    var context=context
    var categories=categories
    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder :holderView

        if(convertView==null)
        {
            categoryView= LayoutInflater.from(context).inflate(R.layout.list_activity,null)
            holder= holderView()
            holder.categoryImage=categoryView.findViewById(R.id.catageryImage)
            holder.categoryText=categoryView.findViewById(R.id.categoryName)
            categoryView.tag=holder

        }
        else
        {
            holder=convertView.tag as holderView
            categoryView=convertView
        }

        val category=categories[position]
        holder.categoryText?.text=category.title
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        return categoryView
    }
    private class holderView{
        var categoryImage:ImageView?=null
        var categoryText:TextView?=null

    }
}