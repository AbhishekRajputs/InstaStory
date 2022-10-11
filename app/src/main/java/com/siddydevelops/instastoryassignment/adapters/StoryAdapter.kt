//package com.siddydevelops.instastoryassignment.adapters
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.siddydevelops.instastoryassignment.databinding.ItemStoryBinding
//import com.siddydevelops.instastoryassignment.user.UserData
//
//class StoryAdapter(private var imageList: ArrayList<UserData>) :
//    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
//        return StoryViewHolder(
//            ItemStoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        )
//    }
//
//    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
//        holder.bindItems(imageList[position])
//    }
//
//    override fun getItemCount() = imageList.size
//
//    inner class StoryViewHolder(private var binding: ItemStoryBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun bindItems(userData: UserData) {
//
//            if (userData.type == "image") {
//                binding.image.visibility = View.VISIBLE
//                binding.video.visibility = View.GONE
//                binding.stories.setSingleDisplayTime(5F)
//                Glide.with(this).load(image).into(binding.image)
//            } else {
//                previewVideo(imageList[counter].image)
//            }
//        }
//
//    }
//}