package com.ibm.developer.blog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/blogs")
public class BlogController {

	private BlogRepo repo;

	protected BlogController(BlogRepo repo) {
		this.repo = repo;
	}

	@GetMapping
	public ResponseEntity<Iterable<Blog>> getAllBlogs() {
		return ResponseEntity.ok(repo.findAll());
	}

	@GetMapping("/search-by/content/{content}")
	public ResponseEntity<Iterable<Blog>> findBlogsByContent(@PathVariable String content) {
		return ResponseEntity.ok(repo.findBlogsByContent(content));
	}
}
