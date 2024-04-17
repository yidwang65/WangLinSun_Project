package com.example.cs501finalproject


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class BlogListViewModel : ViewModel() {
    private val blogRepository = BlogRepository.get()

    private val _blogs: MutableStateFlow<List<Blog>> = MutableStateFlow(emptyList())
    val blogs: StateFlow<List<Blog>>
        get() = _blogs.asStateFlow()

    init {
        viewModelScope.launch {
            blogRepository.getBlogs().collect {
                _blogs.value = it
            }
        }
    }

    suspend fun addBlog(blog: Blog) {
        blogRepository.addBlog(blog)
    }
}