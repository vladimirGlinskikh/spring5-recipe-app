package kz.zhelezyaka.repositories;

import kz.zhelezyaka.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
