package com.ibm.developer.blog;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepo extends CrudRepository<Blog, Long>, CustomBlogRepo {

}
