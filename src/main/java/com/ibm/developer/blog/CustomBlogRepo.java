package com.ibm.developer.blog;

public interface CustomBlogRepo {
	Iterable<Blog> findBlogsByContent(String content);
}
