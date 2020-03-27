package com.example.nguyenxuansang98.recyclerviewpool.views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nguyenxuansang98.recyclerviewpool.R
import com.example.nguyenxuansang98.recyclerviewpool.model.entity.Child
import com.example.nguyenxuansang98.recyclerviewpool.model.entity.Parent
import com.example.nguyenxuansang98.recyclerviewpool.views.adapter.ParentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun createChildItem(): ArrayList<Child> {
        return arrayListOf(
            Child(
                "https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/90511760_739254733274309_7607955349869428736_n.jpg?_nc_cat=105&_nc_sid=ca434c&_nc_ohc=jKVRi7qlo6AAX9vhU27&_nc_ht=scontent-hkg3-1.xx&oh=e7b266ade9a3344b91cad41a4c9bfcf8&oe=5EA1C8D4",
                "Da Mi"
            ),
            Child(
                "https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/90242273_707236983429144_7546285181481517056_n.jpg?_nc_cat=108&_nc_sid=07e735&_nc_ohc=emiRVHvmV-4AX9gPBh7&_nc_ht=scontent-hkg3-1.xx&oh=3a35e3e86657dbb89aa03b32068fca2d&oe=5EA28F9C",
                "Park Seo-joon"
            ),
            Child(
                "https://scontent-xsp1-2.xx.fbcdn.net/v/t1.0-9/90798446_654779512002208_960194734213562368_n.jpg?_nc_cat=104&_nc_sid=ca434c&_nc_ohc=_nmRUQULFXwAX-JXK22&_nc_ht=scontent-xsp1-2.xx&oh=af7e236c5afd956ca76cac597070229a&oe=5EA10A0B",
                "Kwon Nara"
            ),
            Child(
                "https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/90511760_739254733274309_7607955349869428736_n.jpg?_nc_cat=105&_nc_sid=ca434c&_nc_ohc=jKVRi7qlo6AAX9vhU27&_nc_ht=scontent-hkg3-1.xx&oh=e7b266ade9a3344b91cad41a4c9bfcf8&oe=5EA1C8D4",
                "Da Mi"
            ),
            Child(
                "https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/90242273_707236983429144_7546285181481517056_n.jpg?_nc_cat=108&_nc_sid=07e735&_nc_ohc=emiRVHvmV-4AX9gPBh7&_nc_ht=scontent-hkg3-1.xx&oh=3a35e3e86657dbb89aa03b32068fca2d&oe=5EA28F9C",
                "Park Seo-joon"
            ),
            Child(
                "https://scontent-xsp1-2.xx.fbcdn.net/v/t1.0-9/90798446_654779512002208_960194734213562368_n.jpg?_nc_cat=104&_nc_sid=ca434c&_nc_ohc=_nmRUQULFXwAX-JXK22&_nc_ht=scontent-xsp1-2.xx&oh=af7e236c5afd956ca76cac597070229a&oe=5EA10A0B",
                "Kwon Nara"
            )
        )
    }

    fun createParent(): ArrayList<Parent> {
        return arrayListOf(
            Parent("Tên Diễn Viên Itaewon", createChildItem()),
            Parent("Tên Diễn Viên Itaewon", createChildItem()),
            Parent("Tên Diễn Viên Itaewon", createChildItem()),
            Parent("Tên Diễn Viên Itaewon", createChildItem()),
            Parent("Tên Diễn Viên Itaewon", createChildItem()),
            Parent("Tên Diễn Viên Itaewon", createChildItem())
        )
    }

    fun initRecyclerView() {
        recycler_main.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = ParentAdapter(createParent())
        }
    }
}
