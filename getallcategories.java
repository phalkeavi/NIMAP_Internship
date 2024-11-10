import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

// Service method
public Page<Category> getAllCategories(Pageable pageable) {
    return categoryRepository.findAll(pageable);
}

// Controller method with pagination
@GetMapping
public Page<Category> getAllCategories(@RequestParam int page) {
    Pageable pageable = PageRequest.of(page, 10); // 10 items per page
    return categoryService.getAllCategories(pageable);
}