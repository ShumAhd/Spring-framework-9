package com.example.reviewservice.controller;

import com.example.reviewservice.model.Review;
import com.example.reviewservice.repository.ReviewRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

  @Autowired
  private ReviewRepository reviewRepository;

  @GetMapping
  public List<Review> getAllReviews() {
    return reviewRepository.findAll();
  }

  @PostMapping
  public Review addReview(@RequestBody Review review) {
    return reviewRepository.save(review);
  }

  @DeleteMapping("/{id}")
  public void deleteReview(@PathVariable Long id) {
    reviewRepository.deleteById(id);
  }
}
